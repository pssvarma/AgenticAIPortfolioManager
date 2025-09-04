package com.agentic.portfoliomanager.analytics.controller;

import com.agentic.portfoliomanager.analytics.model.Signal;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AnalyticsController {

    @GetMapping("/signals")
    public ResponseEntity<List<Signal>> querySignals(
            @RequestParam(required = false) String symbol,
            @RequestParam(required = false) String tf,
            @RequestParam(required = false) String strategy,
            @RequestParam(required = false) OffsetDateTime from,
            @RequestParam(required = false) OffsetDateTime to) {
        // Dummy implementation
        return ResponseEntity.ok(Collections.emptyList());
    }

    @PostMapping("/signals")
    public ResponseEntity<Void> ingestSignal(@RequestBody Signal signal) {
        // Dummy implementation
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @PostMapping("/reports/eod")
    public ResponseEntity<Void> generateEodReport() {
        // Dummy implementation
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}