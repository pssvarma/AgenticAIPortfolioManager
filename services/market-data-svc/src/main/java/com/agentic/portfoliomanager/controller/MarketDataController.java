package com.agentic.portfoliomanager.controller;

import com.agentic.portfoliomanager.api.ApiApi;
import com.agentic.portfoliomanager.model.Candle;
import com.agentic.portfoliomanager.repository.CandleRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MarketDataController implements ApiApi {

    private final CandleRepository candleRepository;

    public MarketDataController(CandleRepository candleRepository) {
        this.candleRepository = candleRepository;
    }

    @Override
    public ResponseEntity<List<Candle>> apiMarketCandlesGet(String symbol, String tf, OffsetDateTime from, OffsetDateTime to) {
        List<com.agentic.portfoliomanager.entity.Candle> entities = 
            candleRepository.findById_SymbolAndId_TfAndId_TsBetween(symbol, tf, from, to);

        List<Candle> dtos = entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());

        return ResponseEntity.ok(dtos);
    }

    @Override
    public ResponseEntity<List<String>> apiMarketSymbolsGet() {
        return ResponseEntity.ok(candleRepository.findDistinctSymbols());
    }

    private Candle toDto(com.agentic.portfoliomanager.entity.Candle entity) {
        Candle dto = new Candle();
        dto.setSymbol(entity.getId().getSymbol());
        dto.setTf(entity.getId().getTf());
        dto.setVenue(entity.getId().getVenue());
        dto.setTs(entity.getId().getTs());
        dto.setOpen(entity.getOpen());
        dto.setHigh(entity.getHigh());
        dto.setLow(entity.getLow());
        dto.setClose(entity.getClose());
        dto.setVolume(entity.getVolume());
        return dto;
    }
}
