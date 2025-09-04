package com.agentic.portfoliomanager.riskcompliance.controller;

import com.agentic.portfoliomanager.riskcompliance.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(RiskComplianceController.class)
public class RiskComplianceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void getRules() throws Exception {
        mockMvc.perform(get("/api/risk/rules"))
                .andExpect(status().isOk());
    }

    @Test
    void createOrUpdateRule() throws Exception {
        Rule rule = new Rule();
        rule.setName("Max Position Size");
        rule.setConfig(new HashMap<>());
        rule.setEnabled(true);

        mockMvc.perform(post("/api/risk/rules")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(rule)))
                .andExpect(status().isOk());
    }

    @Test
    void checkRisk() throws Exception {
        RiskCheckRequest request = new RiskCheckRequest();
        request.setPortfolio_id(UUID.randomUUID());
        Intent intent = new Intent();
        intent.setSymbol("AAPL");
        intent.setSide("BUY");
        intent.setQty(100);
        intent.setNotional(20000);
        request.setIntents(Collections.singletonList(intent));

        mockMvc.perform(post("/api/risk/check")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk());
    }

    @Test
    void getBlacklist() throws Exception {
        mockMvc.perform(get("/api/compliance/blacklist"))
                .andExpect(status().isOk());
    }

    @Test
    void updateBlacklist() throws Exception {
        Blacklist blacklist = new Blacklist();
        blacklist.setSymbols(Collections.singletonList("BAD_STOCK"));

        mockMvc.perform(post("/api/compliance/blacklist")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(blacklist)))
                .andExpect(status().isOk());
    }

    @Test
    void createAttestation() throws Exception {
        Attestation attestation = new Attestation();
        attestation.setPortfolio_id(UUID.randomUUID());
        attestation.setMessage("All trades compliant");

        mockMvc.perform(post("/api/compliance/attestations")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(attestation)))
                .andExpect(status().isCreated());
    }
}
