package com.qa.techtorial.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //It means runs with Cucumber classes(feature files)
@CucumberOptions(//it is an annotation that has some special keywords
        features = "src/test/resources/features", //this is the location of "FEATURE FILES",we provide content Root
        glue = "com/qa/techtorial/stepdefinitions" //This is the location of "STEP DEFINITION",we provide source root
)
public class Runner {
}
