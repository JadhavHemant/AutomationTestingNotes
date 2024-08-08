package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features/TC_001_NppCommerce.feature",
glue="stepDefination",
dryRun=false)
public class RunnerTest {

}
