package Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import PageObject.configProperties;
import dev.failsafe.Fallback;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.opentelemetry.sdk.metrics.internal.exemplar.TraceBasedExemplarFilter;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = ".//Features/Login.feature",
		features = ".//Features/Glogin.feature",
		glue = "StepDefination",
		dryRun = true,  //check every scenario & method is created or not
		monochrome = true,   //console readble
		plugin = {"pretty","html:target/cucumber-reports.html"
				}
		)
public class LoginRunner {

	
	@BeforeClass
	public static void beforeClass() {
		configProperties.initializePropertyFile();
	}
	
   @AfterClass
   public static void afterClass() {
	   
   }
}
