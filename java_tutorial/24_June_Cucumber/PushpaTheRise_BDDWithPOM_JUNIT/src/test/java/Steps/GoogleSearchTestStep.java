package Steps;





import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;

import BaseLayer.BaseClass;
import PageLayer.GoogleSearchPage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchTestStep extends BaseClass {
	private GoogleSearchPage page;
	

	@Given("user open url in {string}")
	public void user_open_url_in(String browsername) {
		BaseClass.initialization(browsername);

	}

	@When("user enter Pusha the Rise keyword in google search")
	public void user_enter_pusha_the_rise_keyword_in_google_search() {
		page = new GoogleSearchPage();
		page.enterPushaTheRiseInGoogle("Pushpa the rise");

	}

	@Then("user click on search")
	public void user_click_on_search() {
        page.clickOnSearch();
	}

	
	@AfterStep
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
	}

}
