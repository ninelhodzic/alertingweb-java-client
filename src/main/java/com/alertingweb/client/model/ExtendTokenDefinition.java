package com.alertingweb.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-20T01:35:55.506+01:00")
public class ExtendTokenDefinition   {
  
  private String appKey = null;
  private String appSecret = null;

  
  /**
   **/
  public ExtendTokenDefinition appKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("appKey")
  public String getAppKey() {
    return appKey;
  }
  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  
  /**
   **/
  public ExtendTokenDefinition appSecret(String appSecret) {
    this.appSecret = appSecret;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("appSecret")
  public String getAppSecret() {
    return appSecret;
  }
  public void setAppSecret(String appSecret) {
    this.appSecret = appSecret;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendTokenDefinition extendTokenDefinition = (ExtendTokenDefinition) o;
    return Objects.equals(this.appKey, extendTokenDefinition.appKey) &&
        Objects.equals(this.appSecret, extendTokenDefinition.appSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appKey, appSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendTokenDefinition {\n");
    
    sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
    sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
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

