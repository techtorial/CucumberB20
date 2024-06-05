package com.qa.techtorial.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.Arrays;
import java.util.List;

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

    @FindBy(xpath = "//select[@id='product_category_id']")
    WebElement productCategory;

    @FindBy(xpath = "//select[@id='sub_category_id']")
    WebElement subCategory;

    @FindBy(xpath = "//select[@id='tax_id']")
    WebElement tax;

    @FindBy(css = "#purchase_allow")
    WebElement allowBox;

    @FindBy(css = "#description-text")
    WebElement description;

    @FindBy(xpath = "//button[@id='save-product']")
    WebElement saveButton;

    @FindBy(xpath = "//tr[1]//td") //7
    List<WebElement> allInformation;


    public void clickAddProductButton(){
        addProductButton.click();
    }
    public void provideNameAndPrice(String name,String price){
        productName.sendKeys(name);
        productPrice.clear();
        productPrice.sendKeys(price);
    }

    public void chooseCategoryAndTax(String category,String subCategory,String tax){
        BrowserUtils.selectBy(productCategory,category,"text");
        BrowserUtils.selectBy(this.subCategory,subCategory,"text");
        BrowserUtils.selectBy(this.tax,tax,"value");
    }

    public void descriptionAndClickAllowBox(String description){
        allowBox.click();
        this.description.sendKeys(description);
        saveButton.click();
    }

    public void validateProductInformation(String ProductName,String productPrice,String canPurchase){
        List<String> expectedProductInformation= Arrays.asList(ProductName,productPrice,canPurchase);

        for(int i=3;i<allInformation.size()-1;i++){
            Assert.assertEquals(expectedProductInformation.get(i-3),BrowserUtils.getText(allInformation.get(i)));
        }
    }
}
