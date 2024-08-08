package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageSteps extends BaseClass{
	 private static RegisterPage register;
	 
	@Given("user open register page url on browser")
	public void user_open_register_page_url_on_browser() {
	    BaseClass.initialization();
	}

	@When("user select title, enter firstname and lastname")
	public void user_select_title_enter_firstname_and_lastname() {
	   register = new RegisterPage();
	   register.enterBasicDetails("Mrs.", "Rajshri", "Pawar");
	}

	@When("user enter address, city and select country, state and district")
	public void user_enter_address_city_and_select_country_state_and_district() {
	    register.enterAddressDetails("Kothrud", "Pune", "India", "MAHARASHTRA");
	}

	@When("user enter nationality, pincode, email and mobilenumber")
	public void user_enter_nationality_pincode_email_and_mobilenumber() {
	   register.enterOtherDetails("indian", "411078", "raju@gmail.com", "8545758585");
	}

	@Then("user enter userId, password and confirmpassword")
	public void user_enter_user_id_password_and_confirmpassword() {
	    register.enterCredential("raju@gmail.com", "Abc@1234", "Abc@1234");
	}
}
