package com.alertingweb.client.model;

import java.util.Objects;
import com.alertingweb.client.model.AlertItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-20T01:35:55.506+01:00")
public class PagedAlertItems   {
  
  private List<AlertItem> content = new ArrayList<AlertItem>();
  private Boolean last = null;
  private BigDecimal totalPages = null;
  private BigDecimal totalElements = null;
  private String sort = null;
  private Boolean first = null;
  private BigDecimal numberOfElements = null;
  private BigDecimal size = null;
  private BigDecimal number = null;

  
  /**
   **/
  public PagedAlertItems content(List<AlertItem> content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("content")
  public List<AlertItem> getContent() {
    return content;
  }
  public void setContent(List<AlertItem> content) {
    this.content = content;
  }

  
  /**
   * is this last page
   **/
  public PagedAlertItems last(Boolean last) {
    this.last = last;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "is this last page")
  @JsonProperty("last")
  public Boolean getLast() {
    return last;
  }
  public void setLast(Boolean last) {
    this.last = last;
  }

  
  /**
   **/
  public PagedAlertItems totalPages(BigDecimal totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalPages")
  public BigDecimal getTotalPages() {
    return totalPages;
  }
  public void setTotalPages(BigDecimal totalPages) {
    this.totalPages = totalPages;
  }

  
  /**
   **/
  public PagedAlertItems totalElements(BigDecimal totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalElements")
  public BigDecimal getTotalElements() {
    return totalElements;
  }
  public void setTotalElements(BigDecimal totalElements) {
    this.totalElements = totalElements;
  }

  
  /**
   **/
  public PagedAlertItems sort(String sort) {
    this.sort = sort;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sort")
  public String getSort() {
    return sort;
  }
  public void setSort(String sort) {
    this.sort = sort;
  }

  
  /**
   * is this first page
   **/
  public PagedAlertItems first(Boolean first) {
    this.first = first;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "is this first page")
  @JsonProperty("first")
  public Boolean getFirst() {
    return first;
  }
  public void setFirst(Boolean first) {
    this.first = first;
  }

  
  /**
   **/
  public PagedAlertItems numberOfElements(BigDecimal numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfElements")
  public BigDecimal getNumberOfElements() {
    return numberOfElements;
  }
  public void setNumberOfElements(BigDecimal numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  
  /**
   * size per page
   **/
  public PagedAlertItems size(BigDecimal size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "size per page")
  @JsonProperty("size")
  public BigDecimal getSize() {
    return size;
  }
  public void setSize(BigDecimal size) {
    this.size = size;
  }

  
  /**
   * page number
   **/
  public PagedAlertItems number(BigDecimal number) {
    this.number = number;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "page number")
  @JsonProperty("number")
  public BigDecimal getNumber() {
    return number;
  }
  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedAlertItems pagedAlertItems = (PagedAlertItems) o;
    return Objects.equals(this.content, pagedAlertItems.content) &&
        Objects.equals(this.last, pagedAlertItems.last) &&
        Objects.equals(this.totalPages, pagedAlertItems.totalPages) &&
        Objects.equals(this.totalElements, pagedAlertItems.totalElements) &&
        Objects.equals(this.sort, pagedAlertItems.sort) &&
        Objects.equals(this.first, pagedAlertItems.first) &&
        Objects.equals(this.numberOfElements, pagedAlertItems.numberOfElements) &&
        Objects.equals(this.size, pagedAlertItems.size) &&
        Objects.equals(this.number, pagedAlertItems.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, last, totalPages, totalElements, sort, first, numberOfElements, size, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedAlertItems {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

