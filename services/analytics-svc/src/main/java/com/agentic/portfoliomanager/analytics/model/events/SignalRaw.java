package com.agentic.portfoliomanager.analytics.model.events;

public class SignalRaw {
    private String symbol;
    private String tf;
    private String strategy;
    private Direction direction;
    private double score;
    private String reason;
    private long generated_at;

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

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public long getGenerated_at() {
        return generated_at;
    }

    public void setGenerated_at(long generated_at) {
        this.generated_at = generated_at;
    }
}