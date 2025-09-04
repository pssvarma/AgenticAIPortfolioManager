
-- Core relational schema (Postgres)
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
CREATE EXTENSION IF NOT EXISTS vector;

CREATE TABLE IF NOT EXISTS portfolio (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  name TEXT NOT NULL,
  base_ccy TEXT NOT NULL,
  max_drawdown NUMERIC DEFAULT 0.2,
  created_at TIMESTAMPTZ DEFAULT now()
);

CREATE TABLE IF NOT EXISTS position (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  portfolio_id UUID REFERENCES portfolio(id),
  symbol TEXT NOT NULL,
  qty NUMERIC NOT NULL,
  avg_price NUMERIC NOT NULL,
  side TEXT CHECK (side IN ('LONG','SHORT')),
  opened_at TIMESTAMPTZ DEFAULT now(),
  updated_at TIMESTAMPTZ DEFAULT now()
);

CREATE TABLE IF NOT EXISTS signal (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  symbol TEXT NOT NULL,
  tf TEXT NOT NULL,
  strategy TEXT NOT NULL,
  score NUMERIC,
  direction TEXT CHECK (direction IN ('LONG','SHORT','FLAT')),
  reason JSONB,
  generated_at TIMESTAMPTZ DEFAULT now()
);
CREATE INDEX IF NOT EXISTS signal_symbol_tf_gen_idx ON signal(symbol, tf, generated_at DESC);

CREATE TABLE IF NOT EXISTS order_intent (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  portfolio_id UUID REFERENCES portfolio(id),
  symbol TEXT NOT NULL,
  side TEXT CHECK (side IN ('BUY','SELL')),
  qty NUMERIC NOT NULL,
  limit_price NUMERIC,
  stop_loss NUMERIC,
  take_profit NUMERIC,
  tif TEXT,
  created_at TIMESTAMPTZ DEFAULT now()
);

CREATE TABLE IF NOT EXISTS trade_order (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  intent_id UUID REFERENCES order_intent(id),
  status TEXT,
  broker TEXT,
  broker_ref TEXT,
  submitted_at TIMESTAMPTZ,
  filled_qty NUMERIC,
  avg_fill_price NUMERIC
);

-- Brokerless simulation tables
CREATE TABLE IF NOT EXISTS sim_order (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  portfolio_id UUID REFERENCES portfolio(id),
  symbol TEXT NOT NULL,
  side TEXT CHECK (side IN ('BUY','SELL')),
  qty NUMERIC NOT NULL,
  order_type TEXT CHECK (order_type IN ('MARKET','LIMIT')),
  limit_price NUMERIC,
  stop_loss NUMERIC,
  take_profit NUMERIC,
  tif TEXT,
  created_at TIMESTAMPTZ DEFAULT now(),
  status TEXT
);

CREATE TABLE IF NOT EXISTS sim_fill (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  order_id UUID REFERENCES sim_order(id),
  filled_qty NUMERIC,
  fill_price NUMERIC,
  slippage_bps NUMERIC,
  model TEXT,
  ts TIMESTAMPTZ DEFAULT now()
);

CREATE TABLE IF NOT EXISTS fill_model_config (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  name TEXT UNIQUE NOT NULL,
  params JSONB,
  active BOOLEAN DEFAULT TRUE,
  created_at TIMESTAMPTZ DEFAULT now()
);

-- Research memory (pgvector)
CREATE TABLE IF NOT EXISTS research_note (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  symbol TEXT,
  content TEXT,
  embedding vector(1536),
  created_at TIMESTAMPTZ DEFAULT now()
);

-- Watchlists
CREATE TABLE IF NOT EXISTS watchlist (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  name TEXT NOT NULL,
  user_id UUID,
  created_at TIMESTAMPTZ DEFAULT now()
);

CREATE TABLE IF NOT EXISTS watchlist_symbol (
  watchlist_id UUID REFERENCES watchlist(id) ON DELETE CASCADE,
  symbol TEXT NOT NULL,
  PRIMARY KEY (watchlist_id, symbol)
);


-- Compliance and attestations
CREATE TABLE IF NOT EXISTS compliance_blacklist (
  symbol TEXT PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS attestation (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  portfolio_id UUID REFERENCES portfolio(id),
  message TEXT,
  created_at TIMESTAMPTZ DEFAULT now()
);

-- Backtests
CREATE TABLE IF NOT EXISTS backtest_run (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  strategy TEXT NOT NULL,
  period TEXT,
  status TEXT,
  started_at TIMESTAMPTZ DEFAULT now(),
  finished_at TIMESTAMPTZ
);

CREATE TABLE IF NOT EXISTS backtest_metric (
  run_id UUID REFERENCES backtest_run(id),
  name TEXT,
  value NUMERIC,
  PRIMARY KEY (run_id, name)
);
