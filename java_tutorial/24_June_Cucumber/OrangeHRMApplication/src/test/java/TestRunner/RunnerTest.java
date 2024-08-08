package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= "src/test/java/Features",
		glue="StepDefinitions",
		dryRun=false,
		plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		
		)
public class RunnerTest extends AbstractTestNGCucumberTests{

}
