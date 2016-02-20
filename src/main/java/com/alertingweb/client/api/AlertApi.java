package com.alertingweb.client.api;

import com.sun.jersey.api.client.GenericType;

import com.alertingweb.client.ApiException;
import com.alertingweb.client.ApiClient;
import com.alertingweb.client.Configuration;
import com.alertingweb.client.Pair;

import com.alertingweb.client.model.PagedAlertDefinitions;
import com.alertingweb.client.model.Error;
import java.math.BigDecimal;
import com.alertingweb.client.model.AlertDefinition;
import com.alertingweb.client.model.PagedAlertItems;
import com.alertingweb.client.model.AlertItem;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-20T01:35:55.506+01:00")
public class AlertApi {
  private ApiClient apiClient;

  public AlertApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AlertApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get Alert Definitions
   * Gets &#39;AlertDefinition&#39; objects.\n##### Optional parameters\n`page`, `size`, `sort` allows paging over items
   * @param page Paging number (current page number).
   * @param size 
   * @param sort 
   * @return PagedAlertDefinitions
   */
  public PagedAlertDefinitions getAlertDefinitions(BigDecimal page, BigDecimal size, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/alertdefinition".replaceAll("\\{format\\}","json");

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

    
    GenericType<PagedAlertDefinitions> returnType = new GenericType<PagedAlertDefinitions>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Create Alert Definition
   * Create new Alert Definition object
   * @param alertDefinition 
   * @return AlertDefinition
   */
  public AlertDefinition createAlertDefinition(AlertDefinition alertDefinition) throws ApiException {
    Object postBody = alertDefinition;
    
     // verify the required parameter 'alertDefinition' is set
     if (alertDefinition == null) {
        throw new ApiException(400, "Missing the required parameter 'alertDefinition' when calling createAlertDefinition");
     }
     
    // create path and map variables
    String path = "/alertdefinition".replaceAll("\\{format\\}","json");

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

    
    GenericType<AlertDefinition> returnType = new GenericType<AlertDefinition>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get Count of Alert Definitions
   * Get total count of Alert definitions
   * @return BigDecimal
   */
  public BigDecimal getAlertDefinitionCount() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/alertdefinition/count".replaceAll("\\{format\\}","json");

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
   * Get Alert Definition
   * Get single definition by Id
   * @param alertDefinitionId 
   * @return AlertDefinition
   */
  public AlertDefinition getAlertDefinition(String alertDefinitionId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'alertDefinitionId' is set
     if (alertDefinitionId == null) {
        throw new ApiException(400, "Missing the required parameter 'alertDefinitionId' when calling getAlertDefinition");
     }
     
    // create path and map variables
    String path = "/alertdefinition/{alertDefinitionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "alertDefinitionId" + "\\}", apiClient.escapeString(alertDefinitionId.toString()));

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

    
    GenericType<AlertDefinition> returnType = new GenericType<AlertDefinition>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Update Alert Definition
   * Update single Alert Definition item
   * @param alertDefinitionId 
   * @param alertDefinition 
   * @return AlertDefinition
   */
  public AlertDefinition updateAlertDefinition(String alertDefinitionId, AlertDefinition alertDefinition) throws ApiException {
    Object postBody = alertDefinition;
    
     // verify the required parameter 'alertDefinitionId' is set
     if (alertDefinitionId == null) {
        throw new ApiException(400, "Missing the required parameter 'alertDefinitionId' when calling updateAlertDefinition");
     }
     
     // verify the required parameter 'alertDefinition' is set
     if (alertDefinition == null) {
        throw new ApiException(400, "Missing the required parameter 'alertDefinition' when calling updateAlertDefinition");
     }
     
    // create path and map variables
    String path = "/alertdefinition/{alertDefinitionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "alertDefinitionId" + "\\}", apiClient.escapeString(alertDefinitionId.toString()));

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

    
    GenericType<AlertDefinition> returnType = new GenericType<AlertDefinition>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete Alert Definition
   * Delete single Alert Definition item
   * @param alertDefinitionId 
   * @return String
   */
  public String deleteAlertDefinition(String alertDefinitionId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'alertDefinitionId' is set
     if (alertDefinitionId == null) {
        throw new ApiException(400, "Missing the required parameter 'alertDefinitionId' when calling deleteAlertDefinition");
     }
     
    // create path and map variables
    String path = "/alertdefinition/{alertDefinitionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "alertDefinitionId" + "\\}", apiClient.escapeString(alertDefinitionId.toString()));

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
  
  /**
   * Get Alert Items
   * Get &#39;AlertItem&#39; objects\n##### Optional parameters\n`page`, `size`, `sort` allows paging over items
   * @param page Paging number (current page number).
   * @param size 
   * @param sort 
   * @return PagedAlertItems
   */
  public PagedAlertItems getAlertItems(BigDecimal page, BigDecimal size, String sort) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/alertitem".replaceAll("\\{format\\}","json");

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

    
    GenericType<PagedAlertItems> returnType = new GenericType<PagedAlertItems>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Create Alert Item
   * Create new Alert Item object.\n##### Simple example\nProvided `topicName` is required to exists in `AlertDefinition` collection prior to submit new `AlertItem`.\n\n`deadline` has to be in ISO8601 UTC format.\n```JSON\n{\n  \&quot;topicName\&quot;:\&quot;Emergency Incidents\&quot;,\n  \&quot;deadline\&quot;:\&quot;2016-01-21T14:23:56\&quot;,\n  \&quot;payload\&quot;:{\n    \&quot;incidentId\&quot;:\&quot;f11411f1f1\&quot;,\n    \&quot;title\&quot;:\&quot;This will be summary of AlertItem as well\&quot;,\n    \&quot;priority\&quot;: \&quot;E1\&quot;\n  }\n}\n```\n##### Complex example\nIt is possible to override `AlertDefinition` in `payload` field and this `AlertDefinition` will be used.\n```JSON\n{\n	\&quot;type\&quot;: \&quot;incident\&quot;,\n	\&quot;title\&quot;: \&quot;Phone doesn&#39;t work\&quot;,\n	\&quot;incidentId\&quot;: \&quot;12415324234\&quot;,\n	\&quot;customer\&quot;: \&quot;Coca Cola\&quot;,\n	\&quot;customerUserName\&quot;: \&quot;John Doe\&quot;,\n	\&quot;createdDate\&quot;: \&quot;2016/01/24T17:23:54\&quot;,\n	\&quot;status\&quot;: \&quot;NEW\&quot;,\n	\&quot;priority\&quot;: \&quot;EMERGENCY\&quot;,\n	\&quot;assignedGroup\&quot;: \&quot;Phone Support\&quot;,\n	\&quot;assignedEngineer\&quot;: \&quot;Will Hohne\&quot;,\n	\&quot;images\&quot;: [\n		{\n			\&quot;title\&quot;: \&quot;Phone1\&quot;,\n			\&quot;url\&quot;: \&quot;http://s.tmocache.com/content/dam/tmo/en-g/q1%202016/browse-mq-cpo-samsung.jpg\&quot;\n		},\n		{\n			\&quot;title\&quot;: \&quot;Phone2\&quot;,\n			\&quot;url\&quot;: \&quot;http://ecx.images-amazon.com/images/I/41s3UUuGh8L._SL133_.jpg\&quot;\n		},\n		{\n			\&quot;title\&quot;: \&quot;Phone3\&quot;,\n			\&quot;url\&quot;: \&quot;http://ecx.images-amazon.com/images/I/41uvCd6%2BPVL._SL133_.jpg\&quot;\n		}\n	],\n	\&quot;alertDefinition\&quot;: {\n		\&quot;schedules\&quot;: [\n			{\n				\&quot;alertSubjectTemplate\&quot;: \&quot;This is custom subject for the email {{ payload.incidentId }}\&quot;,\n				\&quot;alertBodyTemplate\&quot;: \&quot;This is &lt;b&gt;custom&lt;/b&gt; body for the email images: {{ payload.images.[0].title }} &lt;img src=\\&quot;{{ payload.images.[0].url }}\\&quot;&gt; sent for Customer: {{ payload.customer }}, createdDate: {{ payload.createdDate }} with status: {{ payload.status }} from assigned Engineer: {{ payload.assignedEngineer }}. &lt;hr /&gt; This: &lt;pre&gt;{{json this }}&lt;/pre&gt;\&quot;,\n				\&quot;sendTo\&quot;: [\n					{\n						\&quot;receiverType\&quot;: \&quot;EMAILS\&quot;,\n						\&quot;receiverValue\&quot;: \&quot;john@example.com\&quot;,\n						\&quot;alertProtocol\&quot;: \&quot;EMAIL\&quot;\n					}\n				]\n			}\n		]\n	}\n}        \n```
   * @param alertItem 
   * @return AlertItem
   */
  public AlertItem createAlertItem(AlertItem alertItem) throws ApiException {
    Object postBody = alertItem;
    
     // verify the required parameter 'alertItem' is set
     if (alertItem == null) {
        throw new ApiException(400, "Missing the required parameter 'alertItem' when calling createAlertItem");
     }
     
    // create path and map variables
    String path = "/alertitem".replaceAll("\\{format\\}","json");

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

    
    GenericType<AlertItem> returnType = new GenericType<AlertItem>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get Count of Alert Items
   * Get total count of Alert Items
   * @return BigDecimal
   */
  public BigDecimal getAlertItemCount() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/alertitem/count".replaceAll("\\{format\\}","json");

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
   * Get Alert Item
   * Get single item by Id
   * @param id 
   * @return AlertItem
   */
  public AlertItem getAlertItem(String id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getAlertItem");
     }
     
    // create path and map variables
    String path = "/alertitem/{id}".replaceAll("\\{format\\}","json")
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

    
    GenericType<AlertItem> returnType = new GenericType<AlertItem>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete Alert Item
   * Delete single Alert Item
   * @param id 
   * @return String
   */
  public String deleteAlertItem(String id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAlertItem");
     }
     
    // create path and map variables
    String path = "/alertitem/{id}".replaceAll("\\{format\\}","json")
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
