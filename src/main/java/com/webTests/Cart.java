package com.webTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {
    
    public final By FirstItemTitle = By.cssSelector("div[class='product-group-box'] div[class='text-box'] a[href]");
    public final By FirstItemPrice = By.cssSelector("div[class='product-group-box'] div[class='total-price-box'] strong");
    public final By FirstItemDropdownMenu = By.cssSelector("div[class='product-group-box'] select[class='amount']");
    public final By RemoteFirstItem = By.cssSelector("div[class='product-group-box'] div[class='row'] a[title='Sil'] i");
    public final By CartStatusText = By.cssSelector("div[class='clearfix'] h2");

    public String getCartFirstItemTitle(WebDriver driver){
        String firstItemTitleReturn = null;
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(FirstItemTitle));
        WebElement firstItemTitleField = driver.findElement(FirstItemTitle);
        firstItemTitleReturn = firstItemTitleField.getText();
        return firstItemTitleReturn;
    }

    public String getCartFirstItemPrice(WebDriver driver){
        String firstItemPriceReturn = null;
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(FirstItemPrice));
        WebElement firstItemPriceField = driver.findElement(FirstItemPrice);
        firstItemPriceReturn = firstItemPriceField.getText();
        return firstItemPriceReturn;
    }

    public String setNumberOfProductTwoInDropdownMenu(WebDriver driver){
        String valueOfDropdown = null;
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(FirstItemDropdownMenu));
        Select dropDownMenuField = new Select(driver.findElement(FirstItemDropdownMenu));
        WebElement dropDownMenuStringGetter = driver.findElement(FirstItemDropdownMenu);
        dropDownMenuField.selectByIndex(1);
        valueOfDropdown = dropDownMenuStringGetter.getAttribute("data-value");

        return valueOfDropdown;
    }

    public String setCartEmpty(WebDriver driver){
        String CartFillValue = null;
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(RemoteFirstItem));
        WebElement removeItemField = driver.findElement(RemoteFirstItem);
        removeItemField.click();
        wait.until((ExpectedConditions.visibilityOfElementLocated(CartStatusText)));
        WebElement cartStatusTextField = driver.findElement(CartStatusText);
        CartFillValue = cartStatusTextField.getText();
        return CartFillValue;
    }

    

}
