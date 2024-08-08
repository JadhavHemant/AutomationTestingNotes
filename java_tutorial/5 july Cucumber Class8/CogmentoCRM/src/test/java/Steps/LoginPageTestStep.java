package Steps;

import java.util.List;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
public class LoginPageTestStep extends BaseClass {
     private static LoginPage loginPage;
     
	
	@Given("user is on login Page")
	public void user_is_on_login_page() {
	BaseClass.initialization();
	}

	@When("user enter valid credentails")
	public void user_enter_valid_credentails(DataTable dataTable) {
		List<List<String>> list = dataTable.asLists();
		String uname = list.get(0).get(0);
		String pass = list.get(0).get(1);
		 loginPage = new LoginPage();
		 loginPage.enterValidCrediantials(uname, pass);
		 
		 
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		loginPage.clickOnLoginButton();
	}
}
