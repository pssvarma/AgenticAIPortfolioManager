package com.agentic.portfoliomanager.order.controller;

import com.agentic.portfoliomanager.order.model.Order;
import com.agentic.portfoliomanager.order.model.OrderIntent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @PostMapping
    public ResponseEntity<Void> createOrderIntents(@RequestBody Order order) {
        // Dummy implementation
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @GetMapping
    public ResponseEntity<List<OrderIntent>> listOrderIntents(@RequestParam("portfolio_id") UUID portfolioId) {
        // Dummy implementation
        return ResponseEntity.ok(Collections.emptyList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderIntent> getOrderIntent(@PathVariable("id") UUID id) {
        // Dummy implementation
        return ResponseEntity.ok(new OrderIntent());
    }
}