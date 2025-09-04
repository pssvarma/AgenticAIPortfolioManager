package com.agentic.portfoliomanager.analytics.controller;

import com.agentic.portfoliomanager.analytics.model.Signal;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.OffsetDateTime;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AnalyticsController.class)
public class AnalyticsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void querySignals() throws Exception {
        mockMvc.perform(get("/api/signals"))
                .andExpect(status().isOk());
    }

    @Test
    void ingestSignal() throws Exception {
        Signal signal = new Signal();
        signal.setSymbol("AAPL");
        signal.setTf("1d");
        signal.setStrategy("ema_rsi_v1");
        signal.setDirection("LONG");
        signal.setScore(0.75);
        signal.setGenerated_at(OffsetDateTime.now());

        mockMvc.perform(post("/api/signals")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(signal)))
                .andExpect(status().isAccepted());
    }

    @Test
    void generateEodReport() throws Exception {
        mockMvc.perform(post("/api/reports/eod"))
                .andExpect(status().isAccepted());
    }
}
