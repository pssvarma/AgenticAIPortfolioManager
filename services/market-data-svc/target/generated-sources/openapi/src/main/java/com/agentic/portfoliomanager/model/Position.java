package com.agentic.portfoliomanager.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * Position
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-04T16:27:30.013721700-07:00[America/Los_Angeles]")
public class Position {

  private String symbol;

  private BigDecimal qty;

  private BigDecimal avgPrice;

  /**
   * Gets or Sets side
   */
  public enum SideEnum {
    LONG("LONG"),
    
    SHORT("SHORT");

    private String value;

    SideEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SideEnum fromValue(String value) {
      for (SideEnum b : SideEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SideEnum side;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime openedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public Position symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Get symbol
   * @return symbol
  */
  
  @Schema(name = "symbol", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("symbol")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Position qty(BigDecimal qty) {
    this.qty = qty;
    return this;
  }

  /**
   * Get qty
   * @return qty
  */
  @Valid 
  @Schema(name = "qty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("qty")
  public BigDecimal getQty() {
    return qty;
  }

  public void setQty(BigDecimal qty) {
    this.qty = qty;
  }

  public Position avgPrice(BigDecimal avgPrice) {
    this.avgPrice = avgPrice;
    return this;
  }

  /**
   * Get avgPrice
   * @return avgPrice
  */
  @Valid 
  @Schema(name = "avg_price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avg_price")
  public BigDecimal getAvgPrice() {
    return avgPrice;
  }

  public void setAvgPrice(BigDecimal avgPrice) {
    this.avgPrice = avgPrice;
  }

  public Position side(SideEnum side) {
    this.side = side;
    return this;
  }

  /**
   * Get side
   * @return side
  */
  
  @Schema(name = "side", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("side")
  public SideEnum getSide() {
    return side;
  }

  public void setSide(SideEnum side) {
    this.side = side;
  }

  public Position openedAt(OffsetDateTime openedAt) {
    this.openedAt = openedAt;
    return this;
  }

  /**
   * Get openedAt
   * @return openedAt
  */
  @Valid 
  @Schema(name = "opened_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("opened_at")
  public OffsetDateTime getOpenedAt() {
    return openedAt;
  }

  public void setOpenedAt(OffsetDateTime openedAt) {
    this.openedAt = openedAt;
  }

  public Position updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid 
  @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Position position = (Position) o;
    return Objects.equals(this.symbol, position.symbol) &&
        Objects.equals(this.qty, position.qty) &&
        Objects.equals(this.avgPrice, position.avgPrice) &&
        Objects.equals(this.side, position.side) &&
        Objects.equals(this.openedAt, position.openedAt) &&
        Objects.equals(this.updatedAt, position.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, qty, avgPrice, side, openedAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Position {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    avgPrice: ").append(toIndentedString(avgPrice)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    openedAt: ").append(toIndentedString(openedAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

