package Steps;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterPageStepTest extends BaseClass {
	private RegisterPage registePage;

	@Given("user open register page url in {string} browser")
	public void user_open_register_page_url_in_browser(String browsername) {
		BaseClass.initialization(browsername);
	}

	@When("user select title and enter name and enter last name")
	public void user_select_title_and_enter_name_and_enter_last_name() {
		registePage = new RegisterPage();
		registePage.selectTitleAndEnteFirstNameAndEnterLastLame("Mr.", "Anuj", "Shah");
	}

	@When("user enter address and city and select country and select state")
	public void user_enter_address_and_city_and_select_country_and_select_state() {
		registePage.userEnterAddressAndCityAndSelectCountryAndSelectState("Pune", "Pune", "India", "GOA");
	}

	@When("user enter nationality and enter pincode")
	public void user_enter_nationality_and_enter_pincode() throws InterruptedException {
		registePage.userEnterNationalityAndEnterPincode("Indian", "123455");
		
	}

	@When("user enter email id and mobile number")
	public void user_enter_email_id_and_mobile_number() {
		registePage.userEnterEmailIdAndMobileNumber("anuj@gmail.com", "909090");
	}

	@When("user select the user type {string}")
	public void user_select_the_user_type(String name) {
		registePage.userSelectUserType(name);
	}
	
	
	@After
	public void abc() throws InterruptedException
	{
		Thread.sleep(10000);
		getDriver().quit();
	}
	
	
	
	
	
	
	
	
	
}
