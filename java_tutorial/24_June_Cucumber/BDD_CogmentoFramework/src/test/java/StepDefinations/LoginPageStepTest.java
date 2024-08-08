package StepDefinations;

import java.util.List;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepTest extends BaseClass {
	private static LoginPage loginpage;
	
	@Given("User open a url in {string} browser")
	public void user_open_a_url_in_browser(String browsername) {
		BaseClass.initilization(browsername);

	}

	@When("user enter the valid user name and valid password")
	public void user_enter_the_valid_user_name_and_valid_password(DataTable dataTable) {
		List<List<String>> list = dataTable.asLists();
		String Uname = list.get(0).get(0);
		String Pass = list.get(0).get(1);
		loginpage = new LoginPage();
		loginpage.loginFunctinality(Uname, Pass);

	}

	@Then("user click login button")
	public void user_click_login_button() {

		loginpage.clickOnLoginButton();
	}

}
