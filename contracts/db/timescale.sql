
-- TimescaleDB schema for OHLCV candles
CREATE TABLE IF NOT EXISTS candle (
  symbol TEXT NOT NULL,
  venue  TEXT NOT NULL,
  tf     TEXT NOT NULL,
  ts     TIMESTAMPTZ NOT NULL,
  open   NUMERIC,
  high   NUMERIC,
  low    NUMERIC,
  close  NUMERIC,
  volume NUMERIC,
  PRIMARY KEY(symbol, venue, tf, ts)
);
SELECT create_hypertable('candle','ts', if_not_exists => TRUE);
CREATE INDEX IF NOT EXISTS candle_symbol_tf_ts_idx ON candle(symbol, tf, ts DESC);
-- Optional: compression after 30d
ALTER TABLE candle SET (timescaledb.compress, timescaledb.compress_segmentby = 'symbol,tf');
SELECT add_compression_policy('candle', INTERVAL '30 days');
