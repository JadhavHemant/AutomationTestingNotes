package TestRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = {"src/test/java/Features/TC_001_indiagov.feature"},
		glue = "StepDefinition",
		dryRun = false,
		monochrome = true,
		tags="@RegisterPage"
		
		)

public class RunnerTest extends AbstractTestNGCucumberTests{

}
