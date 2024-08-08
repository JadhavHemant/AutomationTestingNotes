package Steps;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterPageSteps extends BaseClass{
	RegisterPage registerPage;
	@Given("User open a Url and open a browser")
	public void user_open_a_url_and_open_a_browser() {
	   BaseClass.initilization();
	}

	@When("Aser enter valid  title")
	public void aserentervalidtitle() {
		 registerPage = new RegisterPage();
		 registerPage.Aser_enter_valid_title("Ms.");
	}

	@When("User enter name and surname")
	public void userenternameandsurname() {
		registerPage.User_enter_name_and_surname("Pragati", "yerkal");
	}

	@When("User enter valid address1,address2,city")
	public void userentervalidaddress1address2city() {
		registerPage.User_enter_valid_address1_address2_city("pune", "Latur", "shivajiNagar");
	}

	@When("USer enter country,state and")
	public void userentercountrystateanddistrict() {
		registerPage.USer_enter_country_state_and_district("Iceland", "MAHARASHTRA");
	}

	@When("User enter nationality and pincoad")
	public void userenternationalityandpincoad() {
		registerPage.User_enter_nationality_and_pincoad("INDIAN", "111111");
	}

	@When("User enter emailid,MobileNo")
	public void userenteremailidmobileno() {
		registerPage.User_enter_emailid_MobileNo("pragati@gmail.com", "9999999999");
	}

	@When("USer enter validate question and answer")
	public void userentervalidatequestionandanswer() {
		registerPage.USer_enter_validate_question_and_answer("Who is your favorite Hero", "prabhas");
	}

	@When("User enter valiod user type")
	public void userentervaliodusertype() {
		registerPage.User_enter_valiod_user_type("General User");
	}

	@When("User enter UserId,Password,confirmPassword")
	public void userenteruseridpasswordconfirmpassword() {
		registerPage.User_enter_UserId_Password_confirmPassword("pragati@", "123456", "123456");
	}


}
