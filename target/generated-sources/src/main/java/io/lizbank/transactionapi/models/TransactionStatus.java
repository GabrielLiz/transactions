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
 * TransactionStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-14T17:29:58.631+01:00[Europe/Madrid]")
public class TransactionStatus   {
  @JsonProperty("reference")
  private Integer reference = null;

  @JsonProperty("channel")
  private String channel = null;

  public TransactionStatus reference(Integer reference) {
    this.reference = reference;
    return this;
  }

  /**
   * The transaction reference number
   * @return reference
  **/
  @ApiModelProperty(example = "12345", value = "The transaction reference number")
  
    public Integer getReference() {
    return reference;
  }

  public void setReference(Integer reference) {
    this.reference = reference;
  }

  public TransactionStatus channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * The type of the channel that is asking for the status.
   * @return channel
  **/
  @ApiModelProperty(example = "CLIENT", value = "The type of the channel that is asking for the status.")
  
    public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionStatus transactionStatus = (TransactionStatus) o;
    return Objects.equals(this.reference, transactionStatus.reference) &&
        Objects.equals(this.channel, transactionStatus.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, channel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionStatus {\n");
    
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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
