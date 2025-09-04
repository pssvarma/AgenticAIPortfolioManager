package com.agentic.portfoliomanager.marketdata.model;

import java.time.OffsetDateTime;

public class Candle {
    private OffsetDateTime ts;
    private double open;
    private double high;
    private double low;
    private double close;
    private double volume;
    private String symbol;
    private String tf;
    private String venue;

    // Getters and setters

    public OffsetDateTime getTs() {
        return ts;
    }

    public void setTs(OffsetDateTime ts) {
        this.ts = ts;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

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

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
}