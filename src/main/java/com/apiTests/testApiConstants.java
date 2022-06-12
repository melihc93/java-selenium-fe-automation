package com.apiTests;

import java.util.Hashtable;

public class testApiConstants {

    public testApiConstants(){
        api_headers.put("Accept","application/json");
        queryParams.put("idList","");
        queryParams.put("key", "7701836f5f2d45f7dc0dd61b0d890a4a");
        queryParams.put("apiToken", "775ddd6343317e786ff8e02f9518f5fd5be6d6675ef7c945c770caa0e940aba9");
        queryParams.put("myBoardID","62a45366d7a1077db7df549e");
    }

    public final String myRequestUrl = "https://api.trello.com/";
    public final String getBoardInfo = "1/boards/";
    public final String boardCreatePath = "";
    public final String cardCreatorPath = "";
    public final String cardUpdatePath = "";
    public final String cardDeletePath = "";
    public final String boardDeletePath = "";
    public final String myBoardID = "62a45366d7a1077db7df549e";
    Hashtable<String, String> queryParams = new Hashtable<String, String>();
    Hashtable<String, String> api_headers = new Hashtable<String, String>();
    public final Integer HTTP_SUCCESS = 200;

}
    
