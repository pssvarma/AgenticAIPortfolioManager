package com.agentic.portfoliomanager.analytics.model.events;

import java.util.List;

public class SignalEnsemble {
    private String portfolio_id;
    private List<Target> targets;
    private String method;
    private String metrics;
    private long asof;

    public String getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(String portfolio_id) {
        this.portfolio_id = portfolio_id;
    }

    public List<Target> getTargets() {
        return targets;
    }

    public void setTargets(List<Target> targets) {
        this.targets = targets;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getMetrics() {
        return metrics;
    }

    public void setMetrics(String metrics) {
        this.metrics = metrics;
    }

    public long getAsof() {
        return asof;
    }

    public void setAsof(long asof) {
        this.asof = asof;
    }
}