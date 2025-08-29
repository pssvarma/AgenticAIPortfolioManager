# UI Wireframes (Low‑Fidelity, Mermaid)

This document outlines low‑fidelity UI wireframes for the **Agentic AI Portfolio Manager (Multi‑Asset)**. Each screen is represented as a Mermaid diagram for inclusion in documentation or design reviews.

---

## 1. Dashboard
```mermaid
flowchart LR
  subgraph Sidebar[Sidebar]
    SB1[Dashboard]
    SB2[Portfolios]
    SB3[Watchlists]
    SB4[Signals]
    SB5[Backtests]
    SB6[Reports]
    SB7[Settings]
  end

  subgraph Main[Dashboard]
    subgraph KPIs[Header KPIs]
      K1[PNL]
      K2[Sharpe]
      K3[Drawdown]
      K4[Exposure]
    end
    EQ[Equity Curve Chart]
    ALLOC[Allocation Pie/Bar]
    ALERTS[Recent Alerts List]
  end

  Sidebar --> KPIs
  KPIs --> EQ --> ALLOC --> ALERTS
```

---

## 2. Portfolio Detail
```mermaid
flowchart TB
  HDR[Portfolio Header: Name | Base CCY | Created]
  TABS{Tabs}
  OV[Overview]
  ORD[Orders]
  KPI[KPIs]
  ALLOC[Allocation by Asset Chart]
  POS[Positions Table]
  OOPEN[Open Orders Table]
  OHIST[Historical Orders Table]
  PNL[PnL Line Chart]
  RISK[Risk Metrics Table]

  HDR --> TABS
  TABS -->|Overview| OV
  TABS -->|Orders| ORD
  TABS -->|KPIs| KPI

  OV --> ALLOC
  OV --> POS
  ORD --> OOPEN
  ORD --> OHIST
  KPI --> PNL
  KPI --> RISK
```

---

## 3. Watchlist Detail
```mermaid
flowchart TB
  WHDR[Watchlist Header: Name | Count]
  WTOOLS[Actions: Add Symbol | Remove | Save]
  WTABLE[Symbols Table: Symbol | Price | %Chg | Last Signal | Vol | Add→]
  WSPARK[Inline Sparklines per Symbol]

  WHDR --> WTOOLS --> WTABLE --> WSPARK
```

---

## 4. Signals Stream
```mermaid
flowchart TB
  FILTER[Filter Bar: Symbol | Strategy | TF | Score Range]
  STABLE[Signals Table: Symbol | TF | Strategy | Dir | Score | Time]
  MODAL[Signal Detail Modal: Chart + JSON Reason]

  FILTER --> STABLE
  STABLE -->|Row click| MODAL
```

---

## 5. Backtests
```mermaid
flowchart TB
  BLIST[Backtest Runs: Strategy | Period | Sharpe | HitRate | Status]
  BDETAIL[Backtest Detail]
  BEQ[Equity Curve Chart]
  BDD[Drawdown Chart]
  BMET[Metrics: Sharpe | Sortino | MaxDD | CAGR]
  BGRID[Param Config Grid]

  BLIST -->|Select run| BDETAIL
  BDETAIL --> BEQ
  BDETAIL --> BDD
  BDETAIL --> BMET
  BDETAIL --> BGRID
```

---

## 6. Settings
```mermaid
flowchart TB
  STABS{Settings Tabs}
  SSTRAT[Strategies: toggle + thresholds]
  SRISK[Risk Rules: MDD%, Exposure caps]
  SSIM[Simulation: Fill models, latency]
  SUSER[User: Notifications, Theme]

  STABS -->|Strategies| SSTRAT
  STABS -->|Risk Rules| SRISK
  STABS -->|Simulation| SSIM
  STABS -->|User| SUSER
```

---

## Notes
- These wireframes are **low‑fidelity** and focus on layout and flow, not styling.
- Intended for early‑stage review with stakeholders before building high‑fidelity mockups or React components.
- Can be rendered in Markdown tools that support Mermaid (e.g., GitHub, MkDocs, Obsidian).

