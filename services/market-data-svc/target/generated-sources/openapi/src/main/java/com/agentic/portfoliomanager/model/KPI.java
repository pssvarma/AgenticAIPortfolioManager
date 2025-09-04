package com.agentic.portfoliomanager.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * KPI
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-04T16:27:30.013721700-07:00[America/Los_Angeles]")
public class KPI {

  private BigDecimal pnl;

  private BigDecimal sharpe;

  private BigDecimal drawdown;

  private BigDecimal gross;

  private BigDecimal net;

  public KPI pnl(BigDecimal pnl) {
    this.pnl = pnl;
    return this;
  }

  /**
   * Get pnl
   * @return pnl
  */
  @Valid 
  @Schema(name = "pnl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pnl")
  public BigDecimal getPnl() {
    return pnl;
  }

  public void setPnl(BigDecimal pnl) {
    this.pnl = pnl;
  }

  public KPI sharpe(BigDecimal sharpe) {
    this.sharpe = sharpe;
    return this;
  }

  /**
   * Get sharpe
   * @return sharpe
  */
  @Valid 
  @Schema(name = "sharpe", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sharpe")
  public BigDecimal getSharpe() {
    return sharpe;
  }

  public void setSharpe(BigDecimal sharpe) {
    this.sharpe = sharpe;
  }

  public KPI drawdown(BigDecimal drawdown) {
    this.drawdown = drawdown;
    return this;
  }

  /**
   * Get drawdown
   * @return drawdown
  */
  @Valid 
  @Schema(name = "drawdown", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drawdown")
  public BigDecimal getDrawdown() {
    return drawdown;
  }

  public void setDrawdown(BigDecimal drawdown) {
    this.drawdown = drawdown;
  }

  public KPI gross(BigDecimal gross) {
    this.gross = gross;
    return this;
  }

  /**
   * Get gross
   * @return gross
  */
  @Valid 
  @Schema(name = "gross", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gross")
  public BigDecimal getGross() {
    return gross;
  }

  public void setGross(BigDecimal gross) {
    this.gross = gross;
  }

  public KPI net(BigDecimal net) {
    this.net = net;
    return this;
  }

  /**
   * Get net
   * @return net
  */
  @Valid 
  @Schema(name = "net", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("net")
  public BigDecimal getNet() {
    return net;
  }

  public void setNet(BigDecimal net) {
    this.net = net;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KPI KPI = (KPI) o;
    return Objects.equals(this.pnl, KPI.pnl) &&
        Objects.equals(this.sharpe, KPI.sharpe) &&
        Objects.equals(this.drawdown, KPI.drawdown) &&
        Objects.equals(this.gross, KPI.gross) &&
        Objects.equals(this.net, KPI.net);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pnl, sharpe, drawdown, gross, net);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KPI {\n");
    sb.append("    pnl: ").append(toIndentedString(pnl)).append("\n");
    sb.append("    sharpe: ").append(toIndentedString(sharpe)).append("\n");
    sb.append("    drawdown: ").append(toIndentedString(drawdown)).append("\n");
    sb.append("    gross: ").append(toIndentedString(gross)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
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

