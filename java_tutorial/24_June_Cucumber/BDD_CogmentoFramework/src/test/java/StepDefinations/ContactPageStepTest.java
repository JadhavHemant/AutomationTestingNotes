package StepDefinations;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactPageStepTest  extends BaseClass{
	private static ContactPage contact;
	
	@When("user click contact link")
	public void user_click_contact_link() {
		contact = new ContactPage();
		contact.clickOnContactLink();

	}

	@Then("user click on create button")
	public void user_click_on_create_button() {
		contact.clickOnCreateButton();

	}

	@Then("user enter {string},{string} and Select as {string}")
	public void user_enter_and_select_as(String FName, String LastName, String Status) {

		contact.createContact(FName, LastName, Status);

	}

	@Then("user click on save button")
	public void user_click_on_save_button() {
		contact.clickOnSaveButtton();

	}

}
