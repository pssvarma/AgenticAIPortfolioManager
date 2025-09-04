package com.agentic.portfoliomanager.executionsim.model;

import java.util.List;
import java.util.UUID;

public class OrderRequest {
    private UUID portfolio_id;
    private List<Order> orders;

    public UUID getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(UUID portfolio_id) {
        this.portfolio_id = portfolio_id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}