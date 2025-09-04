package com.agentic.portfoliomanager.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Candle
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-04T16:27:30.013721700-07:00[America/Los_Angeles]")
public class Candle {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime ts;

  private BigDecimal open;

  private BigDecimal high;

  private BigDecimal low;

  private BigDecimal close;

  private BigDecimal volume;

  private String symbol;

  private String tf;

  private String venue;

  public Candle() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Candle(OffsetDateTime ts, BigDecimal open, BigDecimal high, BigDecimal low, BigDecimal close, BigDecimal volume, String symbol, String tf, String venue) {
    this.ts = ts;
    this.open = open;
    this.high = high;
    this.low = low;
    this.close = close;
    this.volume = volume;
    this.symbol = symbol;
    this.tf = tf;
    this.venue = venue;
  }

  public Candle ts(OffsetDateTime ts) {
    this.ts = ts;
    return this;
  }

  /**
   * Get ts
   * @return ts
  */
  @NotNull @Valid 
  @Schema(name = "ts", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ts")
  public OffsetDateTime getTs() {
    return ts;
  }

  public void setTs(OffsetDateTime ts) {
    this.ts = ts;
  }

  public Candle open(BigDecimal open) {
    this.open = open;
    return this;
  }

  /**
   * Get open
   * @return open
  */
  @NotNull @Valid 
  @Schema(name = "open", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("open")
  public BigDecimal getOpen() {
    return open;
  }

  public void setOpen(BigDecimal open) {
    this.open = open;
  }

  public Candle high(BigDecimal high) {
    this.high = high;
    return this;
  }

  /**
   * Get high
   * @return high
  */
  @NotNull @Valid 
  @Schema(name = "high", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("high")
  public BigDecimal getHigh() {
    return high;
  }

  public void setHigh(BigDecimal high) {
    this.high = high;
  }

  public Candle low(BigDecimal low) {
    this.low = low;
    return this;
  }

  /**
   * Get low
   * @return low
  */
  @NotNull @Valid 
  @Schema(name = "low", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("low")
  public BigDecimal getLow() {
    return low;
  }

  public void setLow(BigDecimal low) {
    this.low = low;
  }

  public Candle close(BigDecimal close) {
    this.close = close;
    return this;
  }

  /**
   * Get close
   * @return close
  */
  @NotNull @Valid 
  @Schema(name = "close", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("close")
  public BigDecimal getClose() {
    return close;
  }

  public void setClose(BigDecimal close) {
    this.close = close;
  }

  public Candle volume(BigDecimal volume) {
    this.volume = volume;
    return this;
  }

  /**
   * Get volume
   * @return volume
  */
  @NotNull @Valid 
  @Schema(name = "volume", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("volume")
  public BigDecimal getVolume() {
    return volume;
  }

  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }

  public Candle symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Get symbol
   * @return symbol
  */
  @NotNull 
  @Schema(name = "symbol", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("symbol")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Candle tf(String tf) {
    this.tf = tf;
    return this;
  }

  /**
   * Get tf
   * @return tf
  */
  @NotNull 
  @Schema(name = "tf", example = "1d", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tf")
  public String getTf() {
    return tf;
  }

  public void setTf(String tf) {
    this.tf = tf;
  }

  public Candle venue(String venue) {
    this.venue = venue;
    return this;
  }

  /**
   * Get venue
   * @return venue
  */
  @NotNull 
  @Schema(name = "venue", example = "NASDAQ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("venue")
  public String getVenue() {
    return venue;
  }

  public void setVenue(String venue) {
    this.venue = venue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Candle candle = (Candle) o;
    return Objects.equals(this.ts, candle.ts) &&
        Objects.equals(this.open, candle.open) &&
        Objects.equals(this.high, candle.high) &&
        Objects.equals(this.low, candle.low) &&
        Objects.equals(this.close, candle.close) &&
        Objects.equals(this.volume, candle.volume) &&
        Objects.equals(this.symbol, candle.symbol) &&
        Objects.equals(this.tf, candle.tf) &&
        Objects.equals(this.venue, candle.venue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ts, open, high, low, close, volume, symbol, tf, venue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Candle {\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    tf: ").append(toIndentedString(tf)).append("\n");
    sb.append("    venue: ").append(toIndentedString(venue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

