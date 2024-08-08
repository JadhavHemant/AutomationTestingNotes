package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/Features" }, glue = {
		"StepDefinations" }, dryRun = false, monochrome = true, 
				plugin = { "html:reports/abc.html",
				"json:reports/abc.json", 
				"junit:reports/abc.xml",
				"pretty:reports/abc.txt" 
				}

)

public class RunnerTest {

}
