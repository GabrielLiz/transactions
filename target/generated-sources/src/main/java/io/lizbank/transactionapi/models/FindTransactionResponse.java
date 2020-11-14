package io.lizbank.transactionapi.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.lizbank.transactionapi.models.Transaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FindTransactionResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-14T17:29:58.631+01:00[Europe/Madrid]")
public class FindTransactionResponse   {
  @JsonProperty("operations")
  @Valid
  private List<Transaction> operations = null;

  public FindTransactionResponse operations(List<Transaction> operations) {
    this.operations = operations;
    return this;
  }

  public FindTransactionResponse addOperationsItem(Transaction operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<Transaction>();
    }
    this.operations.add(operationsItem);
    return this;
  }

  /**
   * Get operations
   * @return operations
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<Transaction> getOperations() {
    return operations;
  }

  public void setOperations(List<Transaction> operations) {
    this.operations = operations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindTransactionResponse findTransactionResponse = (FindTransactionResponse) o;
    return Objects.equals(this.operations, findTransactionResponse.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindTransactionResponse {\n");
    
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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
