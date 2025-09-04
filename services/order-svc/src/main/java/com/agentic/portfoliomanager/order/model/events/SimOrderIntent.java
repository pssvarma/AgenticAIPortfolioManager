package com.agentic.portfoliomanager.order.model.events;

import java.util.List;

public class SimOrderIntent {
    private String portfolio_id;
    private List<Order> orders;
    private long requested_at;

    public String getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(String portfolio_id) {
        this.portfolio_id = portfolio_id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public long getRequested_at() {
        return requested_at;
    }

    public void setRequested_at(long requested_at) {
        this.requested_at = requested_at;
    }
}