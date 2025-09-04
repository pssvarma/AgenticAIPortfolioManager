package com.agentic.portfoliomanager.riskcompliance.model;

import java.util.List;

public class RiskCheckResponse {
    private String status;
    private List<String> reasons;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getReasons() {
        return reasons;
    }

    public void setReasons(List<String> reasons) {
        this.reasons = reasons;
    }
}