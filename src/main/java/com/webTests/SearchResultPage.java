package com.webTests;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {

    public final By resultPageResultContainer = By.cssSelector("div[data-testid='content']");
    public final By secondPageButton = By.cssSelector("a[aria-label='2. sayfa']");
    public final By secondPageLoadApprover = By.cssSelector("a[aria-current='true'][aria-label='2. sayfa']");
    public final By firstProduct = By.cssSelector("div>ul>li:nth-child(1) [data-cy='product-card-item']");
    FileOperations fileOperations = new FileOperations();
    public final By addToCartButton = By.cssSelector("div>ul>li:nth-child(2) [data-cy='product-card-item'] button[type='button']");
    public final By goToCartButton = By.cssSelector("a[title='Sepetim'][href]");
    public final By cartIsFilled = By.cssSelector("a[title='Sepetim'][href] span");

    public String getResultPageURL (WebDriver driver){
        String resultPageURL = null;
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(resultPageResultContainer));
        resultPageURL = driver.getCurrentUrl();
        return resultPageURL;
    }

    public void clickSecondResultPageButton(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(secondPageButton));
        WebElement secondPageButtonField = driver.findElement(secondPageButton);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", secondPageButtonField);

    }

    public void getFirstProductInfo(WebDriver driver){
        String Title = null;
        String BuyPrice = null;
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(secondPageLoadApprover));
        WebElement firstProductTitle = driver.findElement(firstProduct).findElement(By.cssSelector("a[title]"));
        WebElement firstProductPrice = driver.findElement(firstProduct).findElement(By.cssSelector("span[data-cy]"));
        Title = firstProductTitle.getAttribute("title");
        BuyPrice = firstProductPrice.getText();
        System.out.println(Title);
        System.out.print(BuyPrice);
        fileOperations.WriteLogs(Title, BuyPrice);
    }

    public void clickAddToCartButtonOfFirstProduct(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(secondPageLoadApprover));
        WebElement addToCardElement = driver.findElement(addToCartButton);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", addToCardElement);
    }

    public void clickCartButton(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartIsFilled));
        WebElement goToCardElement = driver.findElement(goToCartButton);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", goToCardElement);        
    }



}
