package Steps;

import org.junit.jupiter.api.Assertions;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Then;

public class HomePageTestSteps extends BaseClass{
	private HomePage homePage;
	
	@Then("user validate home page title")
	public void user_validate_home_page_title() {
		homePage = new HomePage();
	  String actualTitle =  homePage.titleHomePage();
	  Assertions.assertEquals(actualTitle, "Cogmento CRM");
	}

	@Then("user validate home page url")
	public void user_validate_home_page_url() {
		 String actualUrl =  homePage.urlHomePage();
		 Assertions.assertEquals(actualUrl.contains("cogmento"), true);
	}

	@Then("user validate logo")
	public void user_validate_logo() {
	   boolean actualLogo = homePage.logoHomePage();
	   Assertions.assertEquals(actualLogo, true);
	}

}
