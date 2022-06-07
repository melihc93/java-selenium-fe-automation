package com.webTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","webdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.hepsiburada.com/");
        WebElement nameElement = driver.findElement(By.className("desktopOldAutosuggestTheme-input"));
        nameElement.click();
        nameElement.sendKeys("bilgisayar");
        WebElement searchButton = driver.findElement(By.className("SearchBoxOld-buttonContainer"));
        searchButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#i3 > div > a")));
        js.executeScript("window.scrollBy(0,1500)", "");
        WebElement nextPageButton = driver.findElement(By.cssSelector("#ProductList > div > div > div > div > div.paginatorStyle-root > button"));
        nextPageButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i24")));
    }
}