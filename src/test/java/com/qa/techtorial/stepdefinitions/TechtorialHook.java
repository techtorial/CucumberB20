package com.qa.techtorial.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class TechtorialHook {

    public WebDriver driver;

    @Before //Please make sure you import from "IO CUCUMBER"
    public void setup(){
        driver= DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("qa_url"));
    }

    @After
    public void tearDown(){
//        driver.quit();
    }
}
