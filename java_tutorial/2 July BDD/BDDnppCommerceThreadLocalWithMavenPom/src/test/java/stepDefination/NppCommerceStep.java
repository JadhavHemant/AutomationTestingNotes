package stepDefination;

import baseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.NppCommercePage;
import utilityLayer.HandleDropDown;
import utilityLayer.Wait;

public class NppCommerceStep extends BaseClass
{
	public NppCommercePage nppcom;
	
	@Given("user open a url in  {string} browser")
	public void user_open_a_url_in_browser(String browserName) {
		BaseClass.initialization(browserName);
	  	}

	@Then("user enters username and password and click on login button")
	public void user_enters_username_and_password_and_click_on_login_button() {
	     nppcom = new NppCommercePage();
	     nppcom.loginFunctionality("admin@yourstore.com", "admin");
	    
	}

	@Then("user click on Customers symbol and click on customers and click on Add New button")
	public void user_click_on_customers_symbol_and_click_on_customers_and_click_on_add_new_button() {
	   nppcom.clickOnCustomerssymbolAndClickCustomersAndClickAddNew();
	}

	@Then("user enters email,password,firstname,lastname")
	public void user_enters_email_password_firstname_lastname() {
	   nppcom.userEntersEmailPasswordFirstnameLastname("pranju@gmail.com", "pranju@123", "pranjali", "patil");
	}

	@When("user select gender")
	public void user_select_gender() {
	   nppcom.selectGender("Female");
	}

	@When("select date of birth")
	public void select_date_of_birth() {
	   
	}

	@When("user enter company name and select tax and select newsletter and click on save")
	public void user_enter_company_name_and_select_tax_and_select_newsletter_and_click_on_save() {
	   nppcom.clickOnSave();
	}



}
