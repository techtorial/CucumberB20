package com.qa.techtorial.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TechtorialProductPage {

    public TechtorialProductPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@id='table-actions']//a")
    WebElement addProductButton;

    @FindBy(css = "#name")
    WebElement productName;

    @FindBy(css = "#price")
    WebElement productPrice;

    public void clickAddProductButton(){
        addProductButton.click();
    }
    public void provideNameAndPrice(String name,String price){
        productName.sendKeys(name);
        productPrice.clear();
        productPrice.sendKeys(price);
    }
}
