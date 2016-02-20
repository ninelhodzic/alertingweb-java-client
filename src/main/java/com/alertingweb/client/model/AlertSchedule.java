package com.alertingweb.client.model;

import java.util.Objects;
import com.alertingweb.client.model.SendMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-20T01:35:55.506+01:00")
public class AlertSchedule   {
  


  public enum ScheduleTypeEnum {
    BEFORE("BEFORE"),
    AFTER("AFTER");

    private String value;

    ScheduleTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ScheduleTypeEnum scheduleType = null;
  private BigDecimal scheduleTypeValue = null;
  private String scheduleTypeField = null;
  private String alertSubjectTemplate = null;
  private String alertBodyTemplate = null;


  public enum AlertTemplateEngineEnum {
    HANDLERBARS("HANDLERBARS");

    private String value;

    AlertTemplateEngineEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private AlertTemplateEngineEnum alertTemplateEngine = null;
  private List<SendMetadata> sendTo = new ArrayList<SendMetadata>();

  
  /**
   * Type of Schedule - could be 'after' or 'before'
   **/
  public AlertSchedule scheduleType(ScheduleTypeEnum scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Type of Schedule - could be 'after' or 'before'")
  @JsonProperty("scheduleType")
  public ScheduleTypeEnum getScheduleType() {
    return scheduleType;
  }
  public void setScheduleType(ScheduleTypeEnum scheduleType) {
    this.scheduleType = scheduleType;
  }

  
  /**
   * Value in seconds related to 'Schedule Type' - '0' means to run imediatelly
   **/
  public AlertSchedule scheduleTypeValue(BigDecimal scheduleTypeValue) {
    this.scheduleTypeValue = scheduleTypeValue;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Value in seconds related to 'Schedule Type' - '0' means to run imediatelly")
  @JsonProperty("scheduleTypeValue")
  public BigDecimal getScheduleTypeValue() {
    return scheduleTypeValue;
  }
  public void setScheduleTypeValue(BigDecimal scheduleTypeValue) {
    this.scheduleTypeValue = scheduleTypeValue;
  }

  
  /**
   * If defined this fieldName will be used for scheduling (as Target date). It should be provided within Payload in AlertItem. Default value is \"deadline\" that should be provided with Alert Item
   **/
  public AlertSchedule scheduleTypeField(String scheduleTypeField) {
    this.scheduleTypeField = scheduleTypeField;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "If defined this fieldName will be used for scheduling (as Target date). It should be provided within Payload in AlertItem. Default value is \"deadline\" that should be provided with Alert Item")
  @JsonProperty("scheduleTypeField")
  public String getScheduleTypeField() {
    return scheduleTypeField;
  }
  public void setScheduleTypeField(String scheduleTypeField) {
    this.scheduleTypeField = scheduleTypeField;
  }

  
  /**
   * Template of the subject message. In case od EMAIL protocol it will be used as email subject, for SMS it will be used as message. Value will be rendered using defined Template engine and provided Alert Item values
   **/
  public AlertSchedule alertSubjectTemplate(String alertSubjectTemplate) {
    this.alertSubjectTemplate = alertSubjectTemplate;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "Template of the subject message. In case od EMAIL protocol it will be used as email subject, for SMS it will be used as message. Value will be rendered using defined Template engine and provided Alert Item values")
  @JsonProperty("alertSubjectTemplate")
  public String getAlertSubjectTemplate() {
    return alertSubjectTemplate;
  }
  public void setAlertSubjectTemplate(String alertSubjectTemplate) {
    this.alertSubjectTemplate = alertSubjectTemplate;
  }

  
  /**
   * Template of the message body. It will not be used in SMS messages. Value will be rendered using defined Template engine and provided Alert Item values
   **/
  public AlertSchedule alertBodyTemplate(String alertBodyTemplate) {
    this.alertBodyTemplate = alertBodyTemplate;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Template of the message body. It will not be used in SMS messages. Value will be rendered using defined Template engine and provided Alert Item values")
  @JsonProperty("alertBodyTemplate")
  public String getAlertBodyTemplate() {
    return alertBodyTemplate;
  }
  public void setAlertBodyTemplate(String alertBodyTemplate) {
    this.alertBodyTemplate = alertBodyTemplate;
  }

  
  /**
   **/
  public AlertSchedule alertTemplateEngine(AlertTemplateEngineEnum alertTemplateEngine) {
    this.alertTemplateEngine = alertTemplateEngine;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alertTemplateEngine")
  public AlertTemplateEngineEnum getAlertTemplateEngine() {
    return alertTemplateEngine;
  }
  public void setAlertTemplateEngine(AlertTemplateEngineEnum alertTemplateEngine) {
    this.alertTemplateEngine = alertTemplateEngine;
  }

  
  /**
   **/
  public AlertSchedule sendTo(List<SendMetadata> sendTo) {
    this.sendTo = sendTo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sendTo")
  public List<SendMetadata> getSendTo() {
    return sendTo;
  }
  public void setSendTo(List<SendMetadata> sendTo) {
    this.sendTo = sendTo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertSchedule alertSchedule = (AlertSchedule) o;
    return Objects.equals(this.scheduleType, alertSchedule.scheduleType) &&
        Objects.equals(this.scheduleTypeValue, alertSchedule.scheduleTypeValue) &&
        Objects.equals(this.scheduleTypeField, alertSchedule.scheduleTypeField) &&
        Objects.equals(this.alertSubjectTemplate, alertSchedule.alertSubjectTemplate) &&
        Objects.equals(this.alertBodyTemplate, alertSchedule.alertBodyTemplate) &&
        Objects.equals(this.alertTemplateEngine, alertSchedule.alertTemplateEngine) &&
        Objects.equals(this.sendTo, alertSchedule.sendTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleType, scheduleTypeValue, scheduleTypeField, alertSubjectTemplate, alertBodyTemplate, alertTemplateEngine, sendTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertSchedule {\n");
    
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    scheduleTypeValue: ").append(toIndentedString(scheduleTypeValue)).append("\n");
    sb.append("    scheduleTypeField: ").append(toIndentedString(scheduleTypeField)).append("\n");
    sb.append("    alertSubjectTemplate: ").append(toIndentedString(alertSubjectTemplate)).append("\n");
    sb.append("    alertBodyTemplate: ").append(toIndentedString(alertBodyTemplate)).append("\n");
    sb.append("    alertTemplateEngine: ").append(toIndentedString(alertTemplateEngine)).append("\n");
    sb.append("    sendTo: ").append(toIndentedString(sendTo)).append("\n");
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

