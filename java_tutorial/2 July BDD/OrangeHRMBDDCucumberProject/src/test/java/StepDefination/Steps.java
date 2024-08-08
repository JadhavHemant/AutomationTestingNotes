package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.AddCustomerClass;
import PageLayer.AddTariffplanClass;
import PageLayer.AddTarifplantocutomerClass;
import PageLayer.PaybillingClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	public AddCustomerClass addclassobj;
	public AddTariffplanClass tariffobj;
	public AddTarifplantocutomerClass addtarifobj;
	public PaybillingClass paybilingobj;
	public static String a;
	
	@Given("user is on loginpage")
	public void user_is_on_loginpage() {
	    BaseClass.Initialization();
	}

	@When("user enters firstname and lastname")
	public void user_enters_firstname_and_lastname() {
		addclassobj = new AddCustomerClass();
		addclassobj.userEntersFirstnameAndLastname("harshini", "vangala");
	}

	@Then("user enters mobile number and address")
	public void user_enters_mobile_number_and_address() {
		addclassobj.userEntersMobileNumberAndAddress("harsha@gmail.com","Hyderabad","2345678912");
	}

	@Then("user clicks on the submit button")
	public void user_clicks_on_the_submit_button() {
		a = addclassobj.userClicksOntheSubmitButton();
		System.out.println(a);
	   
	}

	@Then("monthly rentals and Free local minutes")
	public void monthly_rentals_and_free_local_minutes() {
	    tariffobj = new AddTariffplanClass();
		tariffobj.monthlyRentalsAndFreeLocalMinutes("12345", "3000");
	}

	@Then("Free International minutes and Free SMS pack")
	public void free_international_minutes_and_free_sms_pack() {
		tariffobj.freeInternationalMinutesAndFreeSmsPack("34567", "4000");
	    
	}

	@Then("Free local minutes charge and International and SMS minute charges")
	public void free_local_minutes_charge_and_international_and_sms_minute_charges() {
		tariffobj.freeLocalMinutesChargeAndInternationalAndSmsMinuteCharges("200", "500","35");
	}

	@Then("click on submit button")
	public void click_on_submit_button() {
		tariffobj.clickOnSubmitButton();
	    
	}

	@When("Enter customer ID")
	public void enter_customer_id() {
		addtarifobj = new AddTarifplantocutomerClass();
		addtarifobj.enterCustomerId(a);
	}

	@Then("user click on submit button")
	public void user_click_on_submit_button() {
		addtarifobj.userClickOnSubmitButton();
	   
	}

	@Then("user enters Customer ID")
	public void user_enters_customer_id() {
		paybilingobj=new PaybillingClass();
		paybilingobj.userEntersCustomerId(a); 
	}

	@Then("user clicks on Submit button")
	public void user_clicks_on_submit_button() {
		
		paybilingobj.userClicksOnSubmitButton();
	   
	}



}