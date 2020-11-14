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
 * Transaction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-14T16:51:04.795362+01:00[Europe/Madrid]")
public class Transaction   {
  @JsonProperty("reference")
  private Integer reference = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("transaction_date")
  private String transactionDate = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("fee")
  private BigDecimal fee = null;

  @JsonProperty("description")
  private String description = null;

  public Transaction reference(Integer reference) {
    this.reference = reference;
    return this;
  }

  /**
   * The transaction unique reference number in our system
   * @return reference
  **/
  @ApiModelProperty(value = "The transaction unique reference number in our system")
  
    public Integer getReference() {
    return reference;
  }

  public void setReference(Integer reference) {
    this.reference = reference;
  }

  public Transaction iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * The IBAN number of the account where the transaction has happened.
   * @return iban
  **/
  @ApiModelProperty(value = "The IBAN number of the account where the transaction has happened.")
  
    public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public Transaction transactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

  /**
   * Date when the transaction took place
   * @return transactionDate
  **/
  @ApiModelProperty(value = "Date when the transaction took place")
  
    public String getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }

  public Transaction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * If positive the transaction is a credit (add money) to the account
   * @return amount
  **/
  @ApiModelProperty(value = "If positive the transaction is a credit (add money) to the account")
  
    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Transaction fee(BigDecimal fee) {
    this.fee = fee;
    return this;
  }

  /**
   * Fee that will be deducted from the amount
   * @return fee
  **/
  @ApiModelProperty(value = "Fee that will be deducted from the amount")
  
    @Valid
    public BigDecimal getFee() {
    return fee;
  }

  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  public Transaction description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the transaction
   * @return description
  **/
  @ApiModelProperty(value = "The description of the transaction")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.reference, transaction.reference) &&
        Objects.equals(this.iban, transaction.iban) &&
        Objects.equals(this.transactionDate, transaction.transactionDate) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.fee, transaction.fee) &&
        Objects.equals(this.description, transaction.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, iban, transactionDate, amount, fee, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
