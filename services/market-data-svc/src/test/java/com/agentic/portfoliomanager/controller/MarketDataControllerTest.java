package com.agentic.portfoliomanager.controller;

import com.agentic.portfoliomanager.entity.Candle;
import com.agentic.portfoliomanager.entity.CandleId;
import com.agentic.portfoliomanager.repository.CandleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MarketDataController.class)
class MarketDataControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CandleRepository candleRepository;

    @Test
    void apiMarketCandlesGet() throws Exception {
        CandleId candleId = new CandleId();
        candleId.setSymbol("AAPL");
        candleId.setTf("1d");
        candleId.setVenue("NASDAQ");
        candleId.setTs(OffsetDateTime.now());

        Candle candle = new Candle();
        candle.setId(candleId);
        candle.setOpen(new BigDecimal("150.0"));
        candle.setHigh(new BigDecimal("155.0"));
        candle.setLow(new BigDecimal("149.0"));
        candle.setClose(new BigDecimal("154.0"));
        candle.setVolume(new BigDecimal("1000000"));

        when(candleRepository.findById_SymbolAndId_TfAndId_TsBetween(anyString(), anyString(), any(), any()))
                .thenReturn(Collections.singletonList(candle));

        mockMvc.perform(get("/api/market/candles")
                .param("symbol", "AAPL")
                .param("tf", "1d")
                .param("from", OffsetDateTime.now().minusDays(1).toString())
                .param("to", OffsetDateTime.now().plusDays(1).toString()))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].symbol").value("AAPL"));
    }

    @Test
    void apiMarketSymbolsGet() throws Exception {
        when(candleRepository.findDistinctSymbols()).thenReturn(List.of("AAPL", "GOOGL"));

        mockMvc.perform(get("/api/market/symbols"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0]").value("AAPL"))
                .andExpect(jsonPath("$[1]").value("GOOGL"));
    }
}
