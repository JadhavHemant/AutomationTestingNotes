package Steps;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.When;

public class HomePageTestStep extends BaseClass {
	private static HomePage homePage;
	@When("user is on home page validate home page title as {string}")
	public void user_is_on_home_page_validate_home_page_title_as(String Title) {
		 homePage = new HomePage();
		 boolean actualStatus = homePage.validateHomePageTitle(Title);
		 Assert.assertEquals(actualStatus, true);
	}

	@When("user validate home page url")
	public void user_validate_home_page_url() {
//		String actualUrl = homePage.validateHomePageUrl();
//		Assert.assertEquals(actualUrl.contains("cogmento"),true);
	}

	@When("user validate home page logo")
	public void user_validate_home_page_logo() {
		boolean actualLogo = homePage.validateHomePageLogo();
		Assert.assertEquals(actualLogo, true);
	}
    @AfterStep
    public void tearDown() throws InterruptedException
    {
    	Thread.sleep(2000);
    }
}
