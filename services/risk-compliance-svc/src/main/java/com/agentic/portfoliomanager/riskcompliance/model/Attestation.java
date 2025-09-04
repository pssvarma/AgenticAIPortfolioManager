package com.agentic.portfoliomanager.riskcompliance.model;

import java.util.UUID;

public class Attestation {
    private UUID portfolio_id;
    private String message;

    public UUID getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(UUID portfolio_id) {
        this.portfolio_id = portfolio_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}