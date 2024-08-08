package Steps;

import java.util.List;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTestStep extends BaseClass {
	private LoginPage login;

	@Given("user open url in {string} browser and user is on login page")
	public void user_open_url_in_browser_and_user_is_on_login_page(String browsername)

	{
		BaseClass.initialization(browsername);
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password(DataTable dataTable) {
		List<List<String>> ls = dataTable.asLists();
		String Uname = ls.get(0).get(0);
		String Pass = ls.get(0).get(1);
		login = new LoginPage();
		login.enterUsernameAndPassword(Uname, Pass);

	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		login.clickOnLogin();

	}
	
	@AfterStep
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
	}

}
