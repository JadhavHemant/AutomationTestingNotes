package Steps;

import java.util.List;

import org.junit.jupiter.api.Assertions;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactPageTestSteps extends BaseClass {
	private static ContactPage contacts;

	@When("user verify user is on contact page")
	public void user_verify_user_is_on_contact_page() {
		contacts = new ContactPage();
		String contactUrl = contacts.contactClick();
		Assertions.assertEquals(contactUrl.contains("contacts"), true);
	}

	@When("user click on create contact")
	public void user_click_on_create_contact() {
		contacts.createContact();
	}

	@Then("user enters firstname, lastname, companyName, email, select category, position and department")
	public void user_enters_firstname_lastname_company_name_email_select_category_position_and_department() {
		contacts.validateContactDetails("Priyanka", "Bhosale", "Persistant", "piya@gmail.com", "Lead", "Test Manager",
				"Testing");
	}

	@Then("user click on savecontacts button")
	public void user_click_on_savecontacts_button() {
		contacts.clickSave();
	}

	@Then("user deletes contact")
	public void user_deletes_contact() {
		contacts.deleteContact();

	}

}
