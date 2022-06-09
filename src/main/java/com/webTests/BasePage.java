package com.webTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage extends DriverSettings{

    public final String websiteUrl = WebUrl;
    public final By searchField = By.cssSelector("input[data-cy='header-search-input']");
    public final By searchFieldSearchButton = By.cssSelector("button[data-cy='search-find-button']");
    public WebDriver driver;


    public BasePage(){
        super();
    }

    public void openWebPage(){
        System.setProperty("webdriver.chrome.driver","webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(websiteUrl);
    }

    public void closeDriver() {
        driver.close();
    }
    
}
