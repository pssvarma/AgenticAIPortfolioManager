package com.agentic.portfoliomanager.order.model;

public class OrderDetail {
    private String symbol;
    private String side;
    private double qty;
    private String order_type;
    private double limit_price;

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

    public String getOrder_type() {
        return order_type;
    }

    public void setOrder_type(String order_type) {
        this.order_type = order_type;
    }

    public double getLimit_price() {
        return limit_price;
    }

    public void setLimit_price(double limit_price) {
        this.limit_price = limit_price;
    }
}