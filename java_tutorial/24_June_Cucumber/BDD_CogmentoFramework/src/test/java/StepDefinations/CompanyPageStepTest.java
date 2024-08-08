package StepDefinations;

import java.util.List;
import java.util.Map;

import BaseLayer.BaseClass;
import PageLayer.CompanyPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompanyPageStepTest  extends BaseClass{
	
	  private static CompanyPage cmpPage;
	@When("user click on company page functinality")
	public void user_click_on_company_page_functinality() {
		cmpPage = new CompanyPage();
		cmpPage.clickOnCompanyLink();

	}

	@When("user click on Company link")
	public void user_click_on_company_link() {

		cmpPage.clickOnCreateButton();
	}

	@Then("user enter name, Website,Address,Email")
	public void user_enter_name_website_address_email(DataTable dataTable) {
		List<Map<String, String>> listMap = dataTable.asMaps();
		String Name = listMap.get(0).get("name");
		String website = listMap.get(0).get("Website");
		String Add = listMap.get(0).get("Address");
		String email = listMap.get(0).get("Email");

		cmpPage.createCompany(Name, website, Add, email);
	}

	@Then("user click on Cmpsave button")
	public void user_click_on_cmpsave_button() {
		cmpPage.clickOnSaveButton();
	}
	
	@AfterStep
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
	}


}
