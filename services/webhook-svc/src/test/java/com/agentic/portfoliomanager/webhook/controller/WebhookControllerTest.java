package com.agentic.portfoliomanager.webhook.controller;

import com.agentic.portfoliomanager.webhook.model.WebhookSimRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.OffsetDateTime;
import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(WebhookController.class)
public class WebhookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void receiveSimWebhook() throws Exception {
        WebhookSimRequest request = new WebhookSimRequest();
        request.setOrder_id(UUID.randomUUID());
        request.setSymbol("AAPL");
        request.setFilled_qty(100);
        request.setFill_price(150.0);
        request.setStatus("FILLED");
        request.setTs(OffsetDateTime.now());

        mockMvc.perform(post("/api/webhooks/sim")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk());
    }

    @Test
    void receiveBrokerWebhook() throws Exception {
        mockMvc.perform(post("/api/webhooks/broker"))
                .andExpect(status().isNotImplemented());
    }
}
