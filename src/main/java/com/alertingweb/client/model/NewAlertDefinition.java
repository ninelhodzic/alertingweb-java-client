package com.alertingweb.client.model;

import java.util.Objects;
import com.alertingweb.client.model.AlertSchedule;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-20T01:00:10.862+01:00")
public class NewAlertDefinition   {
  
  private String name = null;
  private String description = null;
  private String topicName = null;
  private List<AlertSchedule> schedules = new ArrayList<AlertSchedule>();

  
  /**
   * Name of the Alert definition
   **/
  public NewAlertDefinition name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "Name of the Alert definition")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Description of the Alert definition
   **/
  public NewAlertDefinition description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Description of the Alert definition")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Name of the topic or namespace Alert Item to be sent and processed
   **/
  public NewAlertDefinition topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "Name of the topic or namespace Alert Item to be sent and processed")
  @JsonProperty("topicName")
  public String getTopicName() {
    return topicName;
  }
  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  
  /**
   **/
  public NewAlertDefinition schedules(List<AlertSchedule> schedules) {
    this.schedules = schedules;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schedules")
  public List<AlertSchedule> getSchedules() {
    return schedules;
  }
  public void setSchedules(List<AlertSchedule> schedules) {
    this.schedules = schedules;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewAlertDefinition newAlertDefinition = (NewAlertDefinition) o;
    return Objects.equals(this.name, newAlertDefinition.name) &&
        Objects.equals(this.description, newAlertDefinition.description) &&
        Objects.equals(this.topicName, newAlertDefinition.topicName) &&
        Objects.equals(this.schedules, newAlertDefinition.schedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, topicName, schedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewAlertDefinition {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
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

