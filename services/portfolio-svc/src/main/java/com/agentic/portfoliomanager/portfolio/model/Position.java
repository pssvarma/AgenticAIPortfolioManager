package com.agentic.portfoliomanager.portfolio.model;

import java.time.OffsetDateTime;

public class Position {
    private String symbol;
    private double qty;
    private double avg_price;
    private String side;
    private OffsetDateTime opened_at;
    private OffsetDateTime updated_at;

    // Getters and setters

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getAvg_price() {
        return avg_price;
    }

    public void setAvg_price(double avg_price) {
        this.avg_price = avg_price;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public OffsetDateTime getOpened_at() {
        return opened_at;
    }

    public void setOpened_at(OffsetDateTime opened_at) {
        this.opened_at = opened_at;
    }

    public OffsetDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(OffsetDateTime updated_at) {
        this.updated_at = updated_at;
    }
}