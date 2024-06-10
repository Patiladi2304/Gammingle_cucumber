package testrunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./Features/Customers.feature",
		glue = "stepDefination",  
		dryRun = false,           //to check stepdefination method to compare feature file
		plugin = {"pretty","html:test-output"}, //check poutput 
		monochrome = true    //remove unnessary character from console window 
		)

public class testRunner {

}
