package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/java/Features/TC_002_deals.feature"},
		glue = "Steps",
		dryRun = false,
		monochrome = true
		)

public class RunnerTest1 extends AbstractTestNGCucumberTests{

}
