package com.agentic.portfoliomanager.executionsim.model.events;

public class SimOrderFilled {
    private String order_id;
    private String symbol;
    private double filled_qty;
    private double fill_price;
    private long ts;
    private String model;
    private Double slippage_bps;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getFilled_qty() {
        return filled_qty;
    }

    public void setFilled_qty(double filled_qty) {
        this.filled_qty = filled_qty;
    }

    public double getFill_price() {
        return fill_price;
    }

    public void setFill_price(double fill_price) {
        this.fill_price = fill_price;
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getSlippage_bps() {
        return slippage_bps;
    }

    public void setSlippage_bps(Double slippage_bps) {
        this.slippage_bps = slippage_bps;
    }
}