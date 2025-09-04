package com.agentic.portfoliomanager.executionsim.controller;

import com.agentic.portfoliomanager.executionsim.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ExecutionSimController.class)
public class ExecutionSimControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void rebalance() throws Exception {
        RebalanceRequest rebalanceRequest = new RebalanceRequest();
        rebalanceRequest.setPortfolio_id(UUID.randomUUID());
        Target target = new Target();
        target.setSymbol("AAPL");
        target.setWeight(0.5);
        rebalanceRequest.setTargets(Collections.singletonList(target));

        mockMvc.perform(post("/api/simulate/rebalance")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(rebalanceRequest)))
                .andExpect(status().isAccepted());
    }

    @Test
    void submitOrders() throws Exception {
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setPortfolio_id(UUID.randomUUID());
        Order order = new Order();
        order.setSymbol("AAPL");
        order.setSide("BUY");
        order.setQty(100);
        order.setOrder_type("MARKET");
        orderRequest.setOrders(Collections.singletonList(order));

        mockMvc.perform(post("/api/simulate/orders")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(orderRequest)))
                .andExpect(status().isAccepted());
    }

    @Test
    void getLedger() throws Exception {
        mockMvc.perform(get("/api/sim/ledger"))
                .andExpect(status().isOk());
    }

    @Test
    void configureFillModel() throws Exception {
        FillModel fillModel = new FillModel();
        fillModel.setName("MarketMid");

        mockMvc.perform(post("/api/fill-models")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(fillModel)))
                .andExpect(status().isOk());
    }
}
