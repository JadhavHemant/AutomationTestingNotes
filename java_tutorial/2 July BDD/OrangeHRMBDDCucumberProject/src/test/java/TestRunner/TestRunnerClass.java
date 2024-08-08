package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	
		features="src/test/java/Feature",
		glue="StepDefination",
		dryRun=false
		
		)

public class TestRunnerClass {

}
