package com.apiTests;

import java.util.Hashtable;

public class apiConstants {

    public apiConstants(){
    }

    public final String requestUrl = "https://api.trello.com";
    public final String boardCreatePath = "";
    public final String cardCreatorPath = "";
    public final String cardUpdatePath = "";
    public final String cardDeletePath = "";
    public final String boardDeletePath = "";



    public void Headers(){

        Hashtable<String, String> api_headers = new Hashtable<String, String>();

        api_headers.put("Accept","application/json");

    }

    public void queryStrings(){

        Hashtable<String, String> queryParams = new Hashtable<String, String>();

        queryParams.put("idList","");
                

    }
}
    
