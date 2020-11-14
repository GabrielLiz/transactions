package io.lizbank.transactionapi.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Filters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-14T17:29:58.631+01:00[Europe/Madrid]")
public class Filters   {
  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("sortByAmount")
  private String sortByAmount = null;

  public Filters iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * IBAN
   * @return iban
  **/
  @ApiModelProperty(example = "ES9820385778983000760236", value = "IBAN")
  
    public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public Filters sortByAmount(String sortByAmount) {
    this.sortByAmount = sortByAmount;
    return this;
  }

  /**
   * Sort by amount (ascending/descending)
   * @return sortByAmount
  **/
  @ApiModelProperty(example = "ASC/DESC", value = "Sort by amount (ascending/descending)")
  
    public String getSortByAmount() {
    return sortByAmount;
  }

  public void setSortByAmount(String sortByAmount) {
    this.sortByAmount = sortByAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filters filters = (Filters) o;
    return Objects.equals(this.iban, filters.iban) &&
        Objects.equals(this.sortByAmount, filters.sortByAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, sortByAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filters {\n");
    
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    sortByAmount: ").append(toIndentedString(sortByAmount)).append("\n");
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
