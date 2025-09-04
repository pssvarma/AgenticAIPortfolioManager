package com.agentic.portfoliomanager.executionsim.model;

import java.util.List;
import java.util.UUID;

public class RebalanceRequest {
    private UUID portfolio_id;
    private List<Target> targets;

    public UUID getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(UUID portfolio_id) {
        this.portfolio_id = portfolio_id;
    }

    public List<Target> getTargets() {
        return targets;
    }

    public void setTargets(List<Target> targets) {
        this.targets = targets;
    }
}