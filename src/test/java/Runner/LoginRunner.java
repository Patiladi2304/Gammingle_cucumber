package Runner;

import org.junit.runner.RunWith;

import dev.failsafe.Fallback;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.opentelemetry.sdk.metrics.internal.exemplar.TraceBasedExemplarFilter;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/ContestGroup.feature",
		glue = "StepDefination",
		dryRun = true,  //check every scenario & method is created or not
		monochrome = true,   //console readble
		plugin = {"pretty","html:test-output"}
		)
public class LoginRunner {

}
