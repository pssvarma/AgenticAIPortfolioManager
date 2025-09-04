package com.agentic.portfoliomanager.backtest.model;

import java.util.List;
import java.util.UUID;

public class BacktestRunDetail {
    private UUID id;
    private String status;
    private Object metrics;
    private List<String> artifacts;

    // Getters and setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getMetrics() {
        return metrics;
    }

    public void setMetrics(Object metrics) {
        this.metrics = metrics;
    }

    public List<String> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(List<String> artifacts) {
        this.artifacts = artifacts;
    }
}