package com.agentic.portfoliomanager.riskcompliance.model;

import java.util.UUID;

public class Rule {
    private UUID id;
    private String name;
    private Object config;
    private boolean enabled;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getConfig() {
        return config;
    }

    public void setConfig(Object config) {
        this.config = config;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}