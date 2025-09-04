package com.agentic.portfoliomanager.portfolio.model;

public class KPI {
    private double pnl;
    private double sharpe;
    private double drawdown;
    private double gross;
    private double net;

    // Getters and setters

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }

    public double getSharpe() {
        return sharpe;
    }

    public void setSharpe(double sharpe) {
        this.sharpe = sharpe;
    }

    public double getDrawdown() {
        return drawdown;
    }

    public void setDrawdown(double drawdown) {
        this.drawdown = drawdown;
    }

    public double getGross() {
        return gross;
    }

    public void setGross(double gross) {
        this.gross = gross;
    }

    public double getNet() {
        return net;
    }

    public void setNet(double net) {
        this.net = net;
    }
}