package com.webTests;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTests {

    BasePage basePage = new BasePage();
    Search search = new Search();
    SearchResultPage searchResultPage = new SearchResultPage();
    String searchQueryText = "bilgisayar";
    FileOperations fileOperations = new FileOperations();
    Cart cart = new Cart();
    String emptyCartText = "Sepetinizde ürün bulunmamaktadır.";

    public BaseTests(){
        super();
    }

    @BeforeAll
    public void setupWebpage(){
        System.out.println("Tests Started!");
    }

    @BeforeEach
    public void openTestWebPage(){
        basePage.openWebPage();
    }

    @AfterEach
    public void closeTestWebPage(){
        //basePage.closeDriver();
    }

    @AfterAll
    public void tearDown() {
        System.out.println("\n\nTests Completed!");
    }


}
