package com.alertingweb.client.api;

import com.sun.jersey.api.client.GenericType;

import com.alertingweb.client.ApiException;
import com.alertingweb.client.ApiClient;
import com.alertingweb.client.Configuration;
import com.alertingweb.client.Pair;

import com.alertingweb.client.model.ExtendTokenDefinition;
import com.alertingweb.client.model.Error;
import com.alertingweb.client.model.TokenTransfer;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-20T01:35:55.506+01:00")
public class ApplicationApi {
  private ApiClient apiClient;

  public ApplicationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ApplicationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Extend API call token
   * Extend API call token by providing AppKey and AppSecret. User should create new Application via GUI and use AppSecret and AppKey to extend token. Each call to extend token will extend it for 24 hours. It is possible to get longer Token by generating via GUI
   * @param appDefinition 
   * @return TokenTransfer
   */
  public TokenTransfer extendToken(ExtendTokenDefinition appDefinition) throws ApiException {
    Object postBody = appDefinition;
    
    // create path and map variables
    String path = "/token/extend/".replaceAll("\\{format\\}","json");

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

    
    GenericType<TokenTransfer> returnType = new GenericType<TokenTransfer>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
