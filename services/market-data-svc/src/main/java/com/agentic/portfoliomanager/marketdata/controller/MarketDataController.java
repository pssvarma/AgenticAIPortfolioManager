package com.agentic.portfoliomanager.marketdata.controller;

import com.agentic.portfoliomanager.marketdata.model.Candle;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/market")
public class MarketDataController {

    @GetMapping("/candles")
    public ResponseEntity<List<Candle>> getCandles(
            @RequestParam String symbol,
            @RequestParam String tf,
            @RequestParam(required = false) OffsetDateTime from,
            @RequestParam(required = false) OffsetDateTime to) {
        // Dummy implementation
        return ResponseEntity.ok(Collections.emptyList());
    }

    @GetMapping("/symbols")
    public ResponseEntity<List<String>> getSymbols() {
        // Dummy implementation
        return ResponseEntity.ok(Collections.emptyList());
    }
}