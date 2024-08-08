package Steps;

import java.util.List;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import PageLayer.DealsPage;
import UtilityLayer.Wait;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealsPageTestSteps {
	private static DealsPage deals;
	
	
	@Given("user verify user on deals page")
	public void user_verify_user_on_deals_page() {
		deals = new DealsPage();
	    deals.verifyUser();
	}

	@When("user click on create new deal")
	public void user_click_on_create_new_deal() {
	    deals.ClickOncreateNewDeal();
	}

	@When("user enter title, close date, description, probabilitlity, select stage and type")
	public void user_enter_title_close_date_description_probabilitlity_select_stage_and_type() {
	    deals.validateDealsDetails("Automation Testing", "September 2024", "13", "12:45", "This is Cucumber Tool", "80", "Prospect", "New");
	}

	@Then("user click on savedeals button")
	public void user_click_on_savedeals_button() {
	  deals.clickOnSave();
	}

	@Then("user delete deals")
	public void user_delete_deals() {
	    deals.deleteDeal();
	}

}
