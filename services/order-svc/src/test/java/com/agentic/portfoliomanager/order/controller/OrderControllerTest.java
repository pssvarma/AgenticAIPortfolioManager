package com.agentic.portfoliomanager.order.controller;

import com.agentic.portfoliomanager.order.model.Order;
import com.agentic.portfoliomanager.order.model.OrderDetail;
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

@WebMvcTest(OrderController.class)
public class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void createOrderIntents() throws Exception {
        Order order = new Order();
        order.setPortfolio_id(UUID.randomUUID());
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setSymbol("AAPL");
        orderDetail.setSide("BUY");
        orderDetail.setQty(100);
        orderDetail.setOrder_type("MARKET");
        order.setOrders(Collections.singletonList(orderDetail));

        mockMvc.perform(post("/api/orders")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(order)))
                .andExpect(status().isAccepted());
    }

    @Test
    void listOrderIntents() throws Exception {
        mockMvc.perform(get("/api/orders")
                        .param("portfolio_id", UUID.randomUUID().toString()))
                .andExpect(status().isOk());
    }

    @Test
    void getOrderIntent() throws Exception {
        mockMvc.perform(get("/api/orders/{id}", UUID.randomUUID()))
                .andExpect(status().isOk());
    }
}
