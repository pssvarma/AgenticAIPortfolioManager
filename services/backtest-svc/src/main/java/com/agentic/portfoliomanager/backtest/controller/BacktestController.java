package com.agentic.portfoliomanager.backtest.controller;

import com.agentic.portfoliomanager.backtest.model.BacktestRun;
import com.agentic.portfoliomanager.backtest.model.BacktestRunDetail;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/backtest")
public class BacktestController {

    @GetMapping("/runs")
    public ResponseEntity<List<BacktestRun>> listBacktestRuns() {
        // Dummy implementation
        return ResponseEntity.ok(Collections.emptyList());
    }

    @PostMapping("/runs")
    public ResponseEntity<Void> startBacktestRun(@RequestBody Object backtestRun) {
        // Dummy implementation
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @GetMapping("/runs/{id}")
    public ResponseEntity<BacktestRunDetail> getBacktestRunDetail(@PathVariable("id") UUID id) {
        // Dummy implementation
        return ResponseEntity.ok(new BacktestRunDetail());
    }
}