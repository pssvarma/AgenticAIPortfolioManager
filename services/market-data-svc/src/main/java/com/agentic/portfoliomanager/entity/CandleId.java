package com.agentic.portfoliomanager.entity;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;

@Embeddable
public class CandleId implements Serializable {

    private String symbol;
    private String venue;
    private String tf;
    private OffsetDateTime ts;

    // Getters, setters, equals, and hashCode

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getTf() {
        return tf;
    }

    public void setTf(String tf) {
        this.tf = tf;
    }

    public OffsetDateTime getTs() {
        return ts;
    }

    public void setTs(OffsetDateTime ts) {
        this.ts = ts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandleId candleId = (CandleId) o;
        return Objects.equals(symbol, candleId.symbol) &&
                Objects.equals(venue, candleId.venue) &&
                Objects.equals(tf, candleId.tf) &&
                Objects.equals(ts, candleId.ts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, venue, tf, ts);
    }
}
