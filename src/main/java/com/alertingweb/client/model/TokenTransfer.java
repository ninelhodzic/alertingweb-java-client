package com.alertingweb.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-20T01:35:55.506+01:00")
public class TokenTransfer   {
  
  private String token = null;
  private Date nextExpirationDate = null;

  
  /**
   **/
  public TokenTransfer token(String token) {
    this.token = token;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   **/
  public TokenTransfer nextExpirationDate(Date nextExpirationDate) {
    this.nextExpirationDate = nextExpirationDate;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nextExpirationDate")
  public Date getNextExpirationDate() {
    return nextExpirationDate;
  }
  public void setNextExpirationDate(Date nextExpirationDate) {
    this.nextExpirationDate = nextExpirationDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenTransfer tokenTransfer = (TokenTransfer) o;
    return Objects.equals(this.token, tokenTransfer.token) &&
        Objects.equals(this.nextExpirationDate, tokenTransfer.nextExpirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, nextExpirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenTransfer {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    nextExpirationDate: ").append(toIndentedString(nextExpirationDate)).append("\n");
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

