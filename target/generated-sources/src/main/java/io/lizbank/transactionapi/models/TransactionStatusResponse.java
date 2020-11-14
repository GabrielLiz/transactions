package io.lizbank.transactionapi.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransactionStatusResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-14T16:51:04.795362+01:00[Europe/Madrid]")
public class TransactionStatusResponse   {
  @JsonProperty("reference")
  private Integer reference = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("fee")
  private BigDecimal fee = null;

  public TransactionStatusResponse reference(Integer reference) {
    this.reference = reference;
    return this;
  }

  /**
   * The transaction reference number
   * @return reference
  **/
  @ApiModelProperty(value = "The transaction reference number")
  
    public Integer getReference() {
    return reference;
  }

  public void setReference(Integer reference) {
    this.reference = reference;
  }

  public TransactionStatusResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the transaction
   * @return status
  **/
  @ApiModelProperty(example = "PENDING", value = "The status of the transaction")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TransactionStatusResponse amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * the amount of the transaction.
   * @return amount
  **/
  @ApiModelProperty(example = "193.38", value = "the amount of the transaction.")
  
    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public TransactionStatusResponse fee(BigDecimal fee) {
    this.fee = fee;
    return this;
  }

  /**
   * The fee applied to the transaction.
   * @return fee
  **/
  @ApiModelProperty(example = "3.18", value = "The fee applied to the transaction.")
  
    @Valid
    public BigDecimal getFee() {
    return fee;
  }

  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionStatusResponse transactionStatusResponse = (TransactionStatusResponse) o;
    return Objects.equals(this.reference, transactionStatusResponse.reference) &&
        Objects.equals(this.status, transactionStatusResponse.status) &&
        Objects.equals(this.amount, transactionStatusResponse.amount) &&
        Objects.equals(this.fee, transactionStatusResponse.fee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, status, amount, fee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionStatusResponse {\n");
    
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
