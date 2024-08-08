package TestRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/java/Features"},
		glue="Steps",
		monochrome=true,
		dryRun=true)
public class RunnerTest {

}
