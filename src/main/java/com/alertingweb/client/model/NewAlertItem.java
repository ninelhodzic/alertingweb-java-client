package com.alertingweb.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.util.Date;
import java.util.Map;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-20T01:00:10.862+01:00")
public class NewAlertItem   {
  
  private String topicName = null;
  private String summary = null;
  private Date deadline = null;
  private Map<String, Object> payload = new HashMap<String, Object>();

  
  /**
   * Name of the topic to send Alert Item and run Alert Definition(s) defined for the topic
   **/
  public NewAlertItem topicName(String topicName) {
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
   * It will be used as title for the Alert Item. If not provided we'll try to resolve it from Payload field (if title, name or summary exists in payload)
   **/
  public NewAlertItem summary(String summary) {
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
  public NewAlertItem deadline(Date deadline) {
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
  public NewAlertItem payload(Map<String, Object> payload) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewAlertItem newAlertItem = (NewAlertItem) o;
    return Objects.equals(this.topicName, newAlertItem.topicName) &&
        Objects.equals(this.summary, newAlertItem.summary) &&
        Objects.equals(this.deadline, newAlertItem.deadline) &&
        Objects.equals(this.payload, newAlertItem.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topicName, summary, deadline, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewAlertItem {\n");
    
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

