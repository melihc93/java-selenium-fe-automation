package com.apiTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class requestSender extends apiSettings{

    public requestSender(){
        super();
    }

    public void getResponseObject(){
        
        
        
    }

    public Response sendRequest(String _requestType){
        Response response = null;
        String testUrl = this.urlMaker(myRequestUrl,getBoardInfo,queryParams.get("myBoardID"),queryParams.get("key"),queryParams.get("apiToken"));
        if ( _requestType == "GET"){
            response = RestAssured.get(testUrl);
        }
        else if ( _requestType == "POST"){
            response = RestAssured.post();

        }
        else{
            System.out.println("Invalid request type!");;
        }

        return response;
    }

    public String urlMaker(String baseUrl, String urlPath, String ID, String keyPath, String tokenPath){
        String returnUrl;
        returnUrl = baseUrl + urlPath + ID + "?" + "key=" + keyPath + "&token=" +tokenPath;
        return returnUrl;
    }

    public Integer getStatusCode(String requestType){
        Integer statusCode = null;
        Response response = sendRequest(requestType);
        statusCode = response.getStatusCode();
        return statusCode;
    }

    
}
