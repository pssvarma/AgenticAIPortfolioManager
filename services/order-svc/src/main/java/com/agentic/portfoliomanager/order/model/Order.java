package com.agentic.portfoliomanager.order.model;

import java.util.List;
import java.util.UUID;

public class Order {
    private UUID portfolio_id;
    private List<OrderDetail> orders;

    public UUID getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(UUID portfolio_id) {
        this.portfolio_id = portfolio_id;
    }

    public List<OrderDetail> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDetail> orders) {
        this.orders = orders;
    }
}