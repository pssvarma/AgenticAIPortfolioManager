package com.agentic.portfoliomanager.webhook.controller;

import com.agentic.portfoliomanager.webhook.model.WebhookSimRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/webhooks")
public class WebhookController {

    @PostMapping("/sim")
    public ResponseEntity<Void> receiveSimWebhook(@RequestBody WebhookSimRequest request) {
        // Dummy implementation
        return ResponseEntity.ok().build();
    }

    @PostMapping("/broker")
    public ResponseEntity<Void> receiveBrokerWebhook() {
        // Dummy implementation
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }
}