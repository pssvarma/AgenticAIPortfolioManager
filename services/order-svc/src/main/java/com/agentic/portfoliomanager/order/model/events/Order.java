package com.agentic.portfoliomanager.order.model.events;

public class Order {
    private String symbol;
    private Side side;
    private double qty;
    private OrderType order_type;
    private Double limit_price;
    private String tif;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public OrderType getOrder_type() {
        return order_type;
    }

    public void setOrder_type(OrderType order_type) {
        this.order_type = order_type;
    }

    public Double getLimit_price() {
        return limit_price;
    }

    public void setLimit_price(Double limit_price) {
        this.limit_price = limit_price;
    }

    public String getTif() {
        return tif;
    }

    public void setTif(String tif) {
        this.tif = tif;
    }
}