package Steps;

import java.util.List;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.AddPersonalInformationPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddPersonalInformationPageTestStep extends BaseClass {
	private AddPersonalInformationPage infopage;

	@Given("user is on checkoutInformation page")
	public void user_is_on_checkout_information_page() {
		Assert.assertEquals(driver.getCurrentUrl().contains("checkout"), true);

	}

	@When("user enter firstname , lastname , postal code")
	public void user_enter_firstname_lastname_postal_code(DataTable dataTable) {

		List<List<String>> ls = dataTable.cells();
		String fname = ls.get(0).get(0);
		String lname = ls.get(0).get(1);
		String code = ls.get(0).get(2);
		infopage = new AddPersonalInformationPage();
		infopage.userEnterFirstnameLastnamePostalcode(fname, lname, code);

	}

	@Then("user click on continue button")
	public void user_click_on_continue_button() {
		infopage.userClickOnContinueButton();

	}

	@Then("user click on Finish")
	public void user_click_on_finish() {
		infopage.clickOnFinish();

	}

}
