package Steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import BaseLayer.BaseClass;
import PageLayer.WikipediaPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WikipediaTestStep extends BaseClass {
private WikipediaPage wikipage;
	@Given("user is on  Pusha the Rise page")
	public void user_is_on_pusha_the_rise_page() {
		 wikipage=new WikipediaPage();
		//page = new GoogleSearchPage();
		
		String actualURL=wikipage.userIsOnPushatheRisePage();
		assertEquals(actualURL.contains("pushpa"), true);
		
	}

	@When("user click on Wikipedia link")
	public void user_click_on_wikipedia_link() throws InterruptedException {
		Thread.sleep(5000);
		wikipage.clickOnWikipediaLink();

	}

	@Then("capture the wikipedia release date")
	public void capture_the_wikipedia_release_date() throws InterruptedException {
		Thread.sleep(5000);
		wikipage.captureTheWikipediaReleaseDate();

	}

	@Then("go back to previous page")
	public void go_back_to_previous_page() {
		driver.navigate().back();

	}


}
