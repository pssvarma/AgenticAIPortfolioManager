package com.agentic.portfoliomanager.repository;

import com.agentic.portfoliomanager.entity.Candle;
import com.agentic.portfoliomanager.entity.CandleId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.util.List;

@Repository
public interface CandleRepository extends JpaRepository<Candle, CandleId> {

    List<Candle> findById_SymbolAndId_TfAndId_TsBetween(
        String symbol, String tf, OffsetDateTime from, OffsetDateTime to);

    @Query("SELECT DISTINCT c.id.symbol FROM Candle c")
    List<String> findDistinctSymbols();
}
