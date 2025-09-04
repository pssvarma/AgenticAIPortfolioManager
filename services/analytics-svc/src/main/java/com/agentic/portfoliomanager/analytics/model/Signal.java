package com.agentic.portfoliomanager.analytics.model;

import java.time.OffsetDateTime;

public class Signal {
    private String symbol;
    private String tf;
    private String strategy;
    private String direction;
    private double score;
    private Object reason;
    private OffsetDateTime generated_at;

    // Getters and setters

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getTf() {
        return tf;
    }

    public void setTf(String tf) {
        this.tf = tf;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Object getReason() {
        return reason;
    }

    public void setReason(Object reason) {
        this.reason = reason;
    }

    public OffsetDateTime getGenerated_at() {
        return generated_at;
    }

    public void setGenerated_at(OffsetDateTime generated_at) {
        this.generated_at = generated_at;
    }
}