package com.agentic.portfoliomanager.riskcompliance.model;

import java.util.List;
import java.util.UUID;

public class RiskCheckRequest {
    private UUID portfolio_id;
    private List<Intent> intents;
    private Object exposures;

    public UUID getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(UUID portfolio_id) {
        this.portfolio_id = portfolio_id;
    }

    public List<Intent> getIntents() {
        return intents;
    }

    public void setIntents(List<Intent> intents) {
        this.intents = intents;
    }

    public Object getExposures() {
        return exposures;
    }

    public void setExposures(Object exposures) {
        this.exposures = exposures;
    }
}