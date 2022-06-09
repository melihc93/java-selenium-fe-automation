package com.webTests;

import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class SearchTest extends BaseTests{

    public SearchTest(){
        super();
    }

    @Test
    public void search_result_page_opens_successfully(){
        search.searchQuery(basePage.driver,searchQueryText);
        search.clickSearchButton(basePage.driver);
        String webURL = searchResultPage.getResultPageURL(basePage.driver);
        Assert.assertThat(webURL,StringContains.containsString(searchQueryText));
    }

    @Test
    public void search_field_typed_successfully(){
        search.searchQuery(basePage.driver,searchQueryText);
        String actualString = search.getSearchQueryFromField(basePage.driver);
        Assert.assertEquals(searchQueryText, actualString);
    }

    @Test
    public void second_page_of_search_results_opens_successfully(){
        search.searchQuery(basePage.driver,searchQueryText);
        search.clickSearchButton(basePage.driver);
        searchResultPage.clickSecondResultPageButton(basePage.driver);
        String resultURL = searchResultPage.getResultPageURL(basePage.driver);
        Assert.assertThat(resultURL, StringContains.containsString("sf=2"));
    }

    @Test
    public void second_page_first_product_infos_collected_successfully(){
        search.searchQuery(basePage.driver,searchQueryText);
        search.clickSearchButton(basePage.driver);
        searchResultPage.clickSecondResultPageButton(basePage.driver);
        searchResultPage.getFirstProductInfo(basePage.driver);
    }

    @Test
    public void second_page_adding_first_item_to_card(){
        search.searchQuery(basePage.driver,searchQueryText);
        search.clickSearchButton(basePage.driver);
        searchResultPage.clickSecondResultPageButton(basePage.driver);
        searchResultPage.clickAddToCartButtonOfFirstProduct(basePage.driver);
    }
    
    @Test
    public void second_page_clicking_cart_button_opens_cart_successfully(){
        search.searchQuery(basePage.driver,searchQueryText);
        search.clickSearchButton(basePage.driver);
        searchResultPage.clickSecondResultPageButton(basePage.driver);
        searchResultPage.clickAddToCartButtonOfFirstProduct(basePage.driver);
        searchResultPage.clickCartButton(basePage.driver);
    }

}
