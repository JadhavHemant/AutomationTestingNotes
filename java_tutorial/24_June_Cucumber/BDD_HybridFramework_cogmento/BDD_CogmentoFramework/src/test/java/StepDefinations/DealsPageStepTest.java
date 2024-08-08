package StepDefinations;

import BaseLayer.BaseClass;
import PageLayer.DealsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealsPageStepTest extends BaseClass {
	private static DealsPage dealpage;

	@When("user click on deals link")
	public void user_click_on_deals_link() {
		dealpage = new DealsPage();
		dealpage.clickOnDealsLink();
	}

	@Then("user click deals create button")
	public void user_click_deals_create_button() {

		dealpage.clickOnCreateButton();
	}

	@Then("user enter Title and user select date as {int} , monthYear as {string} and time as {string}")
	public void user_enter_title_and_user_select_date_as_month_year_as_and_time_as(Integer Date, String MonthAndYear,
			String Time) {
		dealpage.createDeals(MonthAndYear, Date, Time);
	}

	@Then("user click on dealsSave button")
	public void user_click_on_deals_save_button() {
		dealpage.clickOnSaveButton();

	}

}
