package com.qa.weborder.stepdefinitions;

import com.qa.weborder.pages.WebOrderLoginPage;
import com.qa.weborder.pages.WebOrderMainPage;
import com.qa.weborder.pages.WebOrderPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class WebOrderStepDef {

    WebDriver driver = DriverHelper.getDriver();
    WebOrderLoginPage webOrderLoginPage = new WebOrderLoginPage(driver);
    WebOrderMainPage webOrderMainPage = new WebOrderMainPage(driver);
    WebOrderPage webOrderPage = new WebOrderPage(driver);

    @Given("User provides username,password and click order button")
    public void user_provides_username_password_and_click_order_button() {
        webOrderLoginPage.login(ConfigReader.readProperty("weborder_username"),
                ConfigReader.readProperty("weborder_password"));
        webOrderMainPage.clickOrderButton();
    }

    @When("User enters the product information {string} and {string}")
    public void user_enters_the_product_information_and(String productName, String quantity) throws InterruptedException {
        webOrderPage.productInformation(productName, quantity);
    }

    @When("User enters the address information {string},{string},{string},{string},{string}")
    public void user_enters_the_address_information(String customerName, String street, String city, String state, String zipCode) {
        webOrderPage.addressInformation(customerName, street, city, state, zipCode);
    }

    @When("User enters the payment information {string},{string},{string} and click process button")
    public void user_enters_the_payment_information_and_click_process_button(String cardType, String cardNumber, String expireDate) {
        webOrderPage.paymentInformation(cardType,cardNumber,expireDate);
    }

    @Then("User validates {string}")
    public void user_validates(String expectedMessage) {
        Assert.assertEquals(expectedMessage,webOrderPage.message());
    }

    @Then("User validates all the information {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void user_validates_all_the_information(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {

    }
}
