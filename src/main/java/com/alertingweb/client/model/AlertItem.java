package com.alertingweb.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.util.Date;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-20T01:35:55.506+01:00")
public class AlertItem   {
  
  private String id = null;
  private String topicName = null;
  private String alertStreamId = null;
  private String summary = null;
  private Date deadline = null;
  private Map<String, Object> payload = new HashMap<String, Object>();
  private Date createdAt = null;


  public enum StatusEnum {
    NEW("NEW"),
    WIP("WIP"),
    SCHEDULED("SCHEDULED"),
    SEND_TO_EXECUTION("SEND_TO_EXECUTION"),
    ERROR("ERROR"),
    COMPLETED("COMPLETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status = null;
  private String applicationId = null;

  
  /**
   **/
  public AlertItem id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Name of the topic to send Alert Item and run Alert Definition(s) defined for the topic
   **/
  public AlertItem topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "Name of the topic to send Alert Item and run Alert Definition(s) defined for the topic")
  @JsonProperty("topicName")
  public String getTopicName() {
    return topicName;
  }
  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  
  /**
   * Each Alert Item request will have assigned stream Id that will uniquely identify the Alert Item
   **/
  public AlertItem alertStreamId(String alertStreamId) {
    this.alertStreamId = alertStreamId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Each Alert Item request will have assigned stream Id that will uniquely identify the Alert Item")
  @JsonProperty("alertStreamId")
  public String getAlertStreamId() {
    return alertStreamId;
  }
  public void setAlertStreamId(String alertStreamId) {
    this.alertStreamId = alertStreamId;
  }

  
  /**
   * It will be used as title for the Alert Item. If not provided we'll try to resolve it from Payload field (if title, name or summary exists in payload)
   **/
  public AlertItem summary(String summary) {
    this.summary = summary;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "It will be used as title for the Alert Item. If not provided we'll try to resolve it from Payload field (if title, name or summary exists in payload)")
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }
  public void setSummary(String summary) {
    this.summary = summary;
  }

  
  /**
   * Target Date that will be used to calcuate schedule info. If Alert Definition contains
   **/
  public AlertItem deadline(Date deadline) {
    this.deadline = deadline;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Target Date that will be used to calcuate schedule info. If Alert Definition contains")
  @JsonProperty("deadline")
  public Date getDeadline() {
    return deadline;
  }
  public void setDeadline(Date deadline) {
    this.deadline = deadline;
  }

  
  /**
   * Object payload contains any kind of data prepared by client that will be rendered against Template in message (subject and/or body).| Payload field can contain Alert Defintion to override existing, but there needs to be one Alert Definition defined for specified TopicName.
   **/
  public AlertItem payload(Map<String, Object> payload) {
    this.payload = payload;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Object payload contains any kind of data prepared by client that will be rendered against Template in message (subject and/or body).| Payload field can contain Alert Defintion to override existing, but there needs to be one Alert Definition defined for specified TopicName.")
  @JsonProperty("payload")
  public Map<String, Object> getPayload() {
    return payload;
  }
  public void setPayload(Map<String, Object> payload) {
    this.payload = payload;
  }

  
  /**
   * Created when new item submitted
   **/
  public AlertItem createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Created when new item submitted")
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  
  /**
   * Handled by the system. No need to be provided
   **/
  public AlertItem status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Handled by the system. No need to be provided")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Application id for reference - it is related to AppKey/AppSecret/appToken that is used during the execution and used additional Application configuration - No need to be provided - handled by the system
   **/
  public AlertItem applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Application id for reference - it is related to AppKey/AppSecret/appToken that is used during the execution and used additional Application configuration - No need to be provided - handled by the system")
  @JsonProperty("applicationId")
  public String getApplicationId() {
    return applicationId;
  }
  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertItem alertItem = (AlertItem) o;
    return Objects.equals(this.id, alertItem.id) &&
        Objects.equals(this.topicName, alertItem.topicName) &&
        Objects.equals(this.alertStreamId, alertItem.alertStreamId) &&
        Objects.equals(this.summary, alertItem.summary) &&
        Objects.equals(this.deadline, alertItem.deadline) &&
        Objects.equals(this.payload, alertItem.payload) &&
        Objects.equals(this.createdAt, alertItem.createdAt) &&
        Objects.equals(this.status, alertItem.status) &&
        Objects.equals(this.applicationId, alertItem.applicationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, topicName, alertStreamId, summary, deadline, payload, createdAt, status, applicationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    alertStreamId: ").append(toIndentedString(alertStreamId)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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

