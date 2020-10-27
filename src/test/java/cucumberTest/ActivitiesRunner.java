package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		glue = {"stepDefinitions"},
		tags = {"@activity2_5"},
		strict = true,
		plugin = {"pretty"},
		//plugin = {"html: test-reports"},
		//plugin = {"json: test-reports/json-report.json"},
	    monochrome = true
		)
		
public class ActivitiesRunner {
    //empty
}