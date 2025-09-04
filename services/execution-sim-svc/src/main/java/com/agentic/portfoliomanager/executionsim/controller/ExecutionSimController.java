package com.agentic.portfoliomanager.executionsim.controller;

import com.agentic.portfoliomanager.executionsim.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class ExecutionSimController {

    @PostMapping("/simulate/rebalance")
    public ResponseEntity<Void> rebalance(@RequestBody RebalanceRequest rebalanceRequest) {
        // Dummy implementation
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @PostMapping("/simulate/orders")
    public ResponseEntity<Void> submitOrders(@RequestBody OrderRequest orderRequest) {
        // Dummy implementation
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @GetMapping("/sim/ledger")
    public ResponseEntity<List<LedgerEntry>> getLedger(
            @RequestParam(required = false) UUID portfolio_id,
            @RequestParam(required = false) String window) {
        // Dummy implementation
        return ResponseEntity.ok(Collections.emptyList());
    }

    @PostMapping("/fill-models")
    public ResponseEntity<Void> configureFillModel(@RequestBody FillModel fillModel) {
        // Dummy implementation
        return ResponseEntity.ok().build();
    }
}