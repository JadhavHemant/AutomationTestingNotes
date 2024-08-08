package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.OrderSuccessPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OrderSuccessPageTestStep extends BaseClass {
	private OrderSuccessPage successpage;

	@Given("user is on Checkout: Complete! page")
	public void user_is_on_checkout_complete_page() {
		Assert.assertEquals(driver.getCurrentUrl().contains("complete"), true);

	}

	@Then("user validate success message")
	public void user_validate_success_message() {
		successpage = new OrderSuccessPage();
		String message = successpage.userValidateSuccessMessage();
		Assert.assertEquals(message, "Thank you for your order!");

	}

	@Then("user click on home button")
	public void user_click_on_home_button() {
		successpage.userClickOnHome();

	}

	@Then("user logout the application")
	public void user_logout_the_application() {
		successpage.logout();

	}

}
