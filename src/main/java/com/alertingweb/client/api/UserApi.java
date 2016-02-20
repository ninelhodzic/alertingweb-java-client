package com.alertingweb.client.api;

import com.sun.jersey.api.client.GenericType;

import com.alertingweb.client.ApiException;
import com.alertingweb.client.ApiClient;
import com.alertingweb.client.Configuration;
import com.alertingweb.client.Pair;

import com.alertingweb.client.model.PagedAlertUsers;
import com.alertingweb.client.model.Error;
import java.math.BigDecimal;
import com.alertingweb.client.model.AlertUser;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-20T01:35:55.506+01:00")
public class UserApi {
  private ApiClient apiClient;

  public UserApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get Alert User
   * Gets &#39;AlertUser&#39; objects.\n##### Optional parameters\n`page`, `size`, `sort` allows paging over items
   * @param page Paging number (current page number).
   * @param size 
   * @param sort 
   * @return PagedAlertUsers
   */
  public PagedAlertUsers getAlertUsers(BigDecimal page, BigDecimal size, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/alertuser".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "size", size));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "headerToken" };

    
    GenericType<PagedAlertUsers> returnType = new GenericType<PagedAlertUsers>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Create Alert User
   * Create new Alert User object
   * @param alertUser 
   * @return AlertUser
   */
  public AlertUser createAlertUser(AlertUser alertUser) throws ApiException {
    Object postBody = alertUser;
    
     // verify the required parameter 'alertUser' is set
     if (alertUser == null) {
        throw new ApiException(400, "Missing the required parameter 'alertUser' when calling createAlertUser");
     }
     
    // create path and map variables
    String path = "/alertuser".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "headerToken" };

    
    GenericType<AlertUser> returnType = new GenericType<AlertUser>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get Count of Alert Users
   * Get total count of Alert Users
   * @return BigDecimal
   */
  public BigDecimal getAlertUserCount() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/alertuser/count".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "headerToken" };

    
    GenericType<BigDecimal> returnType = new GenericType<BigDecimal>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get Alert User
   * Get single definition by Id
   * @param id 
   * @return AlertUser
   */
  public AlertUser getAlertUser(String id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getAlertUser");
     }
     
    // create path and map variables
    String path = "/alertuser/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "headerToken" };

    
    GenericType<AlertUser> returnType = new GenericType<AlertUser>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Update Alert User
   * Update single Alert User item
   * @param id 
   * @param alertUser 
   * @return AlertUser
   */
  public AlertUser updateAlertUser(String id, AlertUser alertUser) throws ApiException {
    Object postBody = alertUser;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateAlertUser");
     }
     
    // create path and map variables
    String path = "/alertuser/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "headerToken" };

    
    GenericType<AlertUser> returnType = new GenericType<AlertUser>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete Alert User
   * Delete single Alert User item
   * @param id 
   * @return String
   */
  public String deleteAlertUser(String id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAlertUser");
     }
     
    // create path and map variables
    String path = "/alertuser/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "headerToken" };

    
    GenericType<String> returnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
