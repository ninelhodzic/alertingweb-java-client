package com.alertingweb.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-20T01:00:10.862+01:00")
public class NewAlertUser   {
  
  private String name = null;
  private List<String> groups = new ArrayList<String>();
  private String email = null;
  private String phone = null;
  private String twitter = null;
  private String facebook = null;

  
  /**
   * Name of group Account
   **/
  public NewAlertUser name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "Name of group Account")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public NewAlertUser groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("groups")
  public List<String> getGroups() {
    return groups;
  }
  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  
  /**
   * Email of the account
   **/
  public NewAlertUser email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Email of the account")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Account phone
   **/
  public NewAlertUser phone(String phone) {
    this.phone = phone;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Account phone")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   * Twitter account username
   **/
  public NewAlertUser twitter(String twitter) {
    this.twitter = twitter;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Twitter account username")
  @JsonProperty("twitter")
  public String getTwitter() {
    return twitter;
  }
  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }

  
  /**
   * Facebook account username
   **/
  public NewAlertUser facebook(String facebook) {
    this.facebook = facebook;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Facebook account username")
  @JsonProperty("facebook")
  public String getFacebook() {
    return facebook;
  }
  public void setFacebook(String facebook) {
    this.facebook = facebook;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewAlertUser newAlertUser = (NewAlertUser) o;
    return Objects.equals(this.name, newAlertUser.name) &&
        Objects.equals(this.groups, newAlertUser.groups) &&
        Objects.equals(this.email, newAlertUser.email) &&
        Objects.equals(this.phone, newAlertUser.phone) &&
        Objects.equals(this.twitter, newAlertUser.twitter) &&
        Objects.equals(this.facebook, newAlertUser.facebook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, groups, email, phone, twitter, facebook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewAlertUser {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    facebook: ").append(toIndentedString(facebook)).append("\n");
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

