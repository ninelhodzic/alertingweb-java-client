package com.alertingweb.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-20T01:35:55.506+01:00")
public class SendMetadata   {
  


  public enum ReceiverTypeEnum {
    EMAILS("EMAILS"),
    PHONES("PHONES"),
    GROUP("GROUP"),
    EXTERNAL("EXTERNAL");

    private String value;

    ReceiverTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ReceiverTypeEnum receiverType = null;
  private String receiverValue = null;
  private String receiverCcValue = null;
  private String receiverBccValue = null;


  public enum AlertProtocolEnum {
    EMAIL("EMAIL"),
    SMS("SMS"),
    EXTERNAL("EXTERNAL");

    private String value;

    AlertProtocolEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private AlertProtocolEnum alertProtocol = null;

  
  /**
   * Type of receiver such as Emails, Phones, Group, ExternalAPI
   **/
  public SendMetadata receiverType(ReceiverTypeEnum receiverType) {
    this.receiverType = receiverType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Type of receiver such as Emails, Phones, Group, ExternalAPI")
  @JsonProperty("receiverType")
  public ReceiverTypeEnum getReceiverType() {
    return receiverType;
  }
  public void setReceiverType(ReceiverTypeEnum receiverType) {
    this.receiverType = receiverType;
  }

  
  /**
   * Value of receivers such as comma separated list of emails, sms numbers, groups, externalApi url
   **/
  public SendMetadata receiverValue(String receiverValue) {
    this.receiverValue = receiverValue;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "Value of receivers such as comma separated list of emails, sms numbers, groups, externalApi url")
  @JsonProperty("receiverValue")
  public String getReceiverValue() {
    return receiverValue;
  }
  public void setReceiverValue(String receiverValue) {
    this.receiverValue = receiverValue;
  }

  
  /**
   * Used with EMAIL protocol
   **/
  public SendMetadata receiverCcValue(String receiverCcValue) {
    this.receiverCcValue = receiverCcValue;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Used with EMAIL protocol")
  @JsonProperty("receiverCcValue")
  public String getReceiverCcValue() {
    return receiverCcValue;
  }
  public void setReceiverCcValue(String receiverCcValue) {
    this.receiverCcValue = receiverCcValue;
  }

  
  /**
   * Used with EMAIL protocol
   **/
  public SendMetadata receiverBccValue(String receiverBccValue) {
    this.receiverBccValue = receiverBccValue;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Used with EMAIL protocol")
  @JsonProperty("receiverBccValue")
  public String getReceiverBccValue() {
    return receiverBccValue;
  }
  public void setReceiverBccValue(String receiverBccValue) {
    this.receiverBccValue = receiverBccValue;
  }

  
  /**
   * Protocol of sending - related to receiver Type. Can be email, sms, externalApi
   **/
  public SendMetadata alertProtocol(AlertProtocolEnum alertProtocol) {
    this.alertProtocol = alertProtocol;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Protocol of sending - related to receiver Type. Can be email, sms, externalApi")
  @JsonProperty("alertProtocol")
  public AlertProtocolEnum getAlertProtocol() {
    return alertProtocol;
  }
  public void setAlertProtocol(AlertProtocolEnum alertProtocol) {
    this.alertProtocol = alertProtocol;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendMetadata sendMetadata = (SendMetadata) o;
    return Objects.equals(this.receiverType, sendMetadata.receiverType) &&
        Objects.equals(this.receiverValue, sendMetadata.receiverValue) &&
        Objects.equals(this.receiverCcValue, sendMetadata.receiverCcValue) &&
        Objects.equals(this.receiverBccValue, sendMetadata.receiverBccValue) &&
        Objects.equals(this.alertProtocol, sendMetadata.alertProtocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receiverType, receiverValue, receiverCcValue, receiverBccValue, alertProtocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendMetadata {\n");
    
    sb.append("    receiverType: ").append(toIndentedString(receiverType)).append("\n");
    sb.append("    receiverValue: ").append(toIndentedString(receiverValue)).append("\n");
    sb.append("    receiverCcValue: ").append(toIndentedString(receiverCcValue)).append("\n");
    sb.append("    receiverBccValue: ").append(toIndentedString(receiverBccValue)).append("\n");
    sb.append("    alertProtocol: ").append(toIndentedString(alertProtocol)).append("\n");
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

