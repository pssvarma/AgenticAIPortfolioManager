package com.agentic.portfoliomanager.executionsim.model;

import java.time.OffsetDateTime;
import java.util.UUID;

public class LedgerEntry {
    private UUID order_id;
    private String symbol;
    private double fill_price;
    private double filled_qty;
    private OffsetDateTime ts;

    public UUID getOrder_id() {
        return order_id;
    }

    public void setOrder_id(UUID order_id) {
        this.order_id = order_id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getFill_price() {
        return fill_price;
    }

    public void setFill_price(double fill_price) {
        this.fill_price = fill_price;
    }

    public double getFilled_qty() {
        return filled_qty;
    }

    public void setFilled_qty(double filled_qty) {
        this.filled_qty = filled_qty;
    }

    public OffsetDateTime getTs() {
        return ts;
    }

    public void setTs(OffsetDateTime ts) {
        this.ts = ts;
    }
}