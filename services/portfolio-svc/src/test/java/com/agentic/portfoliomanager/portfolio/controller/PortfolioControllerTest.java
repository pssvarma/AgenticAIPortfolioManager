package com.agentic.portfoliomanager.portfolio.controller;

import com.agentic.portfoliomanager.portfolio.model.KPI;
import com.agentic.portfoliomanager.portfolio.model.Position;
import com.agentic.portfoliomanager.portfolio.model.Watchlist;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PortfolioController.class)
public class PortfolioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    // Mocking the service layer, but since we don't have a service layer yet, we can mock the controller's dependencies.
    // For now, the controller is self-contained, so we don't need to mock anything.

    @Test
    void listPortfolios() throws Exception {
        mockMvc.perform(get("/api/portfolio"))
                .andExpect(status().isOk());
    }

    @Test
    void createPortfolio() throws Exception {
        Map<String, String> portfolio = new HashMap<>();
        portfolio.put("name", "My Portfolio");
        portfolio.put("base_ccy", "USD");
        mockMvc.perform(post("/api/portfolio")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(portfolio)))
                .andExpect(status().isCreated());
    }

    @Test
    void getPositionsForPortfolio() throws Exception {
        UUID portfolioId = UUID.randomUUID();
        mockMvc.perform(get("/api/portfolio/{id}/positions", portfolioId))
                .andExpect(status().isOk());
    }

    @Test
    void getKpisForPortfolio() throws Exception {
        UUID portfolioId = UUID.randomUUID();
        mockMvc.perform(get("/api/portfolio/{id}/kpis", portfolioId))
                .andExpect(status().isOk());
    }

    @Test
    void listWatchlists() throws Exception {
        mockMvc.perform(get("/api/watchlists"))
                .andExpect(status().isOk());
    }

    @Test
    void createWatchlist() throws Exception {
        Watchlist watchlist = new Watchlist();
        watchlist.setName("My Watchlist");
        mockMvc.perform(post("/api/watchlists")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(watchlist)))
                .andExpect(status().isCreated());
    }

    @Test
    void getWatchlist() throws Exception {
        UUID watchlistId = UUID.randomUUID();
        mockMvc.perform(get("/api/watchlists/{id}", watchlistId))
                .andExpect(status().isOk());
    }

    @Test
    void listSymbolsInWatchlist() throws Exception {
        UUID watchlistId = UUID.randomUUID();
        mockMvc.perform(get("/api/watchlists/{id}/symbols", watchlistId))
                .andExpect(status().isOk());
    }

    @Test
    void addSymbolsToWatchlist() throws Exception {
        UUID watchlistId = UUID.randomUUID();
        Map<String, List<String>> symbols = new HashMap<>();
        symbols.put("symbols", Collections.singletonList("AAPL"));
        mockMvc.perform(post("/api/watchlists/{id}/symbols", watchlistId)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(symbols)))
                .andExpect(status().isOk());
    }
}
