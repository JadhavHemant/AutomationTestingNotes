package Steps;

import BaseLayer.BaseClass;
import PageLayer.LogoutPage;
import io.cucumber.java.en.When;

public class LogoutPageTestSteps extends BaseClass{

	@When("user click on profile icon and click on logout menu")
	public void user_click_on_profile_icon_and_click_on_logout_menu() {
	    LogoutPage logoutPage = new LogoutPage();
	    logoutPage.logoutFun();
	}
}
