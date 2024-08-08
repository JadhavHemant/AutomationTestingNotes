package StepDefinations;

import org.junit.jupiter.api.Assertions;

import BaseLayer.BaseClass;
import io.cucumber.java.en.When;

public class HomePageStepTest extends BaseClass {
	
	@When("user is on home page and validate home page title")
	public void user_is_on_home_page_and_validate_home_page_title() {

		String Title = driver.getTitle();
		Assertions.assertEquals(Title, "Cogmento CRM");

	}

	@When("user validate Url")
	public void user_validate_url() {
		String Url = driver.getCurrentUrl();
		Assertions.assertEquals(Url.contains("cogmento"), true);

	}

}
