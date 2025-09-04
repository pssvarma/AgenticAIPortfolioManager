package com.agentic.portfoliomanager.backtest.controller;

import com.agentic.portfoliomanager.backtest.model.BacktestRun;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BacktestController.class)
public class BacktestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void listBacktestRuns() throws Exception {
        mockMvc.perform(get("/api/backtest/runs"))
                .andExpect(status().isOk());
    }

    @Test
    void startBacktestRun() throws Exception {
        Map<String, Object> backtestRun = new HashMap<>();
        backtestRun.put("strategy", "ema_rsi_v1");
        backtestRun.put("symbols", Collections.singletonList("AAPL"));
        backtestRun.put("tf", "1d");
        backtestRun.put("start", "2023-01-01");
        backtestRun.put("end", "2023-12-31");

        mockMvc.perform(post("/api/backtest/runs")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(backtestRun)))
                .andExpect(status().isAccepted());
    }

    @Test
    void getBacktestRunDetail() throws Exception {
        UUID runId = UUID.randomUUID();
        mockMvc.perform(get("/api/backtest/runs/{id}", runId))
                .andExpect(status().isOk());
    }
}
