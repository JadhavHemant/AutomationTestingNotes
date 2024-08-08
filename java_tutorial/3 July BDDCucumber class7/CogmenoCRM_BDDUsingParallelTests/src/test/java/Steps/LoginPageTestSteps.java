package Steps;

import java.util.List;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class LoginPageTestSteps extends BaseClass {

	private LoginPage loginPage;

	@Given("user open url in {string} browser")
	public void user_open_url_in_browser(String browsername) {
		 BaseClass.initialization(browsername);
	}
	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password(DataTable dataTable) {
		List<List<String>> list = dataTable.asLists();
	    String uname = list.get(0).get(0);
	    String pass = list.get(0).get(1);
	    loginPage = new LoginPage();
	    loginPage.validateCredentials(uname, pass);
	   
	}
	@Then("user click on login button")
	public void user_click_on_login_button() {
		loginPage.validateLoginFunctionality();
	}
}
