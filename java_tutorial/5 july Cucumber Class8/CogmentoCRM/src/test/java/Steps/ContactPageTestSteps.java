package Steps;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import UtilityLayer.ExcelReader;
import io.cucumber.java.en.When;

public class ContactPageTestSteps extends BaseClass {
	private static ContactPage contactPage;
    private static String ExcelPath;
    ExcelReader excelReader;
@When("user is on contact page and validate contact page url contains {string}")
public void user_is_on_contact_page_and_validate_contact_page_url_contains(String Url) {
	 contactPage = new ContactPage();
	 boolean actualStatus = contactPage.validateContactPageUrl(Url);
	 Assert.assertEquals(actualStatus, true);
}

@When("user click on create button")
public void user_click_on_create_button() {
	contactPage.clickOnCreateButton();
}

@When("user enter contact information from Excel Sheet using {string} and {int}")
public void user_enter_contact_information_from_excel_sheet_using_and(String SheetName, Integer RowNumber) {
	ExcelPath="C:\\Users\\Admin\\BDD Framework\\CogmentoCRM\\src\\main\\java\\TestData\\ContactINfo.xlsx";
	ExcelReader excelReader = new ExcelReader();
	List<Map<String,String>> data = excelReader.getAllsheetData(ExcelPath, SheetName);
	String firstName = data.get(RowNumber).get("FirstName");
	String middleName = data.get(RowNumber).get("MiddleName");
	String lastName = data.get(RowNumber).get("LastName");
	contactPage.enterContactInformation(firstName, middleName, lastName);
}

@When("user click on save button")
public void user_click_on_save_button() {
	contactPage.clickOnSaveButton();
}

@When("user delete contanct")
public void user_delete_contanct() {
	contactPage.deleteContact();
}

@When("user click on profile icon")
public void user_click_on_profile_icon() {
	contactPage.clickOnProfileIcon();
}

@When("user logout the application")
public void user_logout_the_application() {
	contactPage.logOutTheApplication();
}

@When("user close the session")
public void user_close_the_session() {
	contactPage.closeTheSession();
}

}
