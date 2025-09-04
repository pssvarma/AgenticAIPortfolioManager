package com.agentic.portfoliomanager.backtest.model;

import java.util.UUID;

public class BacktestRun {
    private UUID id;
    private String strategy;
    private String period;
    private String status;
    private double sharpe;

    // Getters and setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getSharpe() {
        return sharpe;
    }

    public void setSharpe(double sharpe) {
        this.sharpe = sharpe;
    }
}