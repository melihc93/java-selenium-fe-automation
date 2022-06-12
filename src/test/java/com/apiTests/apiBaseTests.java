package com.apiTests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class apiBaseTests {

    public apiBaseTests(){
    }

    requestSender requestSender = new requestSender();


    @Test
    public void apiEndpointCheck(){
        Integer statusCode = requestSender.getStatusCode("GET");
        Assert.assertEquals(requestSender.HTTP_SUCCESS, statusCode);


    }
    
}
