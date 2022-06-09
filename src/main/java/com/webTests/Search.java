package com.webTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search extends BasePage{
    

    public Search(){

    }

    public void clickSearchButton(WebDriver driver) {
        WebElement searchButton = driver.findElement(searchFieldSearchButton);
        searchButton.click();
    }

    public void searchQuery(WebDriver driver, String text) {
        WebElement textField = driver.findElement(searchField);
        textField.click();
        textField.sendKeys(text);
    }

    public String getSearchQueryFromField(WebDriver driver) {
        String query = null;
        WebElement textField = driver.findElement(searchField);
        query = textField.getAttribute("value");
        return query;
    }

}
