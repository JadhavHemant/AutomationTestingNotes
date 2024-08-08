package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Features",
		glue="StepDefinition",
		dryRun=false,
		monochrome=true,
		plugin= { 
				"html:Reports/abc.html",
				"json:Reports/abc.json",
				"junit:Reports/abc.xml",
				"pretty:Reports/abc.txt"
				},
		tags="@EndToEndTesting"
		)
public class RunnerTest {

}
