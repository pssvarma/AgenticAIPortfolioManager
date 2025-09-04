package com.agentic.portfoliomanager.riskcompliance.model;

public class Intent {
    private String symbol;
    private String side;
    private double qty;
    private double notional;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getNotional() {
        return notional;
    }

    public void setNotional(double notional) {
        this.notional = notional;
    }
}