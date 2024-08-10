package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=  "src/test/java/Features/customer.feature" ,
		glue = "StepAPIs",
		dryRun=false,
		monochrome=true
		
		)
public class RunnerTest {

}
