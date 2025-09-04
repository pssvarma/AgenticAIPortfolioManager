package com.agentic.portfoliomanager.riskcompliance.model;

import java.util.List;

public class Blacklist {
    private List<String> symbols;

    public List<String> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<String> symbols) {
        this.symbols = symbols;
    }
}