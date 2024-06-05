package com.qa.techtorial.stepdefinitions;

import com.qa.techtorial.pages.TechtorialMainPage;
import com.qa.techtorial.pages.TechtorialProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class TechtorialAddProductStepDef {

    WebDriver driver= DriverHelper.getDriver();
    TechtorialMainPage techtorialMainPage=new TechtorialMainPage(driver);
    TechtorialProductPage techtorialProductPage=new TechtorialProductPage(driver);

    @When("User clicks Product Button on the left side and AddProductButton from ProductPage")
    public void user_clicks_product_button_on_the_left_side_and_add_product_button_from_product_page() {
    techtorialMainPage.clickProductButton();
    techtorialProductPage.clickAddProductButton();
    }
    @When("User provides {string} and {string} to the product details box")
    public void user_provides_and_to_the_product_details_box(String name, String price) {
    techtorialProductPage.provideNameAndPrice(name,price);//Truck-Mounted Crane,15000
    }
    @When("User selects {string},{string} and {string} from drop-downs")
    public void user_selects_and_from_drop_downs(String category, String subcategory, String tax) {
    techtorialProductPage.chooseCategoryAndTax(category,subcategory,tax);
    }
    @When("User clicks purchase check box and add {string} into the description.")
    public void user_clicks_purchase_check_box_and_add_into_the_description(String description) {
    techtorialProductPage.descriptionAndClickAllowBox(description);
    }
    @Then("User validates product details {string},{string},{string} from table")
    public void user_validates_product_details_from_table(String productName, String productPrice, String checkBox) {
    techtorialProductPage.validateProductInformation(productName,productPrice,checkBox);
    }

}
