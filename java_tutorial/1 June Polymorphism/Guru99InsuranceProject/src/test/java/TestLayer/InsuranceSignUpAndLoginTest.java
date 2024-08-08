package TestLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.Utils;

//Base Class is parent class of InsuranceSignUpAndLoginTest class
public class InsuranceSignUpAndLoginTest extends BaseClass {

	// Run the test cases as per the functionality wise so we have use priority
	// attribute
	String emailId = "amit@gmail.com";
	String password = "A@mit123";

	// create setUp non static method with @BeforeClass precondition
	@BeforeClass
	public void setUp() {
		// call BaseClass initialization() method by using class name
		BaseClass.initialization();
	}

	// create signUpFunctionalityTest Test Case using @Test Annotation
	@Test(priority = 1)
	public void signUpFunctionalityTest() throws InterruptedException {
		// find title drop down
		WebElement wbTitle = driver.findElement(By.id("user_title"));

		// to Perform operation on Title Drop down call selectByVisibleText() method
		// from HandleDropDown class.
		HandleDropDown.selectByVisibleText(wbTitle, "Captain");

		// find the first name text box
		WebElement wbFname = driver.findElement(By.id("user_firstname"));

		// To Perform operation on first name text box, call sendKeys() method from
		// Utils class.
		Utils.sendKeys(wbFname, "Amit");

		// find last name text box
		WebElement wbLastName = driver.findElement(By.id("user_surname"));

		// To Perform operation on last name text box, call sendKeys() method from Utils
		// Class.
		Utils.sendKeys(wbLastName, "Patil");

		// find phone textbox
		WebElement wbPhone = driver.findElement(By.id("user_phone"));

		// To Perform Operation on Phone Text box, call sendKeys() method from utils
		// class.
		Utils.sendKeys(wbPhone, "90909090");

		// find year drop down
		WebElement wbYear = driver.findElement(By.name("year"));

		// To Perform operation on year drop down, call selectByVisibleText() method
		// from HandleDropDown class.
		HandleDropDown.selectByVisibleText(wbYear, "1950");

		// find month drop down
		WebElement wbMonth = driver.findElement(By.name("month"));

		// To Perform Operation on Month drop down, call selectByValue() method from
		// HandleDropDown class
		HandleDropDown.selectByValue(wbMonth, "9");

		// find Date drop down
		WebElement wbDate = driver.findElement(By.name("date"));

		// To perform operation on Date drop down, call selectByIndex() method from
		// HandleDrop down class/.
		HandleDropDown.selectByIndex(wbDate, 21);

		// find professional Radio button
		WebElement wbProfessional = driver.findElement(By.id("licencetype_f"));

		// To Perform operation on Professional radio button call click() method from
		// Utils class/.
		Utils.click(wbProfessional);

		// find Licence Period drop down
		WebElement wbLicence = driver.findElement(By.id("user_licenceperiod"));

		// To Perform operation on Licence Period drop down call selectByIndex() method
		// from HandleDropDown class
		HandleDropDown.selectByIndex(wbLicence, 11);

		// find Occupation drop down
		WebElement wbOccupation = driver.findElement(By.id("user_occupation_id"));

		// To perform operation on Occupation drop down call selectByValue() method from
		// HandleDropDown class
		HandleDropDown.selectByValue(wbOccupation, "12");

		// find address text box
		WebElement wbAddress = driver.findElement(By.id("user_address_attributes_street"));

		// To perform operation on address text box call sendKeys() method from Utils
		// class
		Utils.sendKeys(wbAddress, "Pune");

		// find City text box
		WebElement wbCity = driver.findElement(By.id("user_address_attributes_city"));
		// To perform operation on City text box call sendKeys() method from Utils class
		Utils.sendKeys(wbCity, "Pune");

		// find County text box
		WebElement wbCountry = driver.findElement(By.id("user_address_attributes_county"));

		// To perform operation on County text box call sendKeys() method from Utils
		// class
		Utils.sendKeys(wbCountry, "INDIA");

		// find Post code text box
		WebElement wbPostCode = driver.findElement(By.id("user_address_attributes_postcode"));

		// To perform operation on Post code text box call sendKeys() method from Utils
		// class
		Utils.sendKeys(wbPostCode, "411011");

		// find email text box
		WebElement wbEmail = driver.findElement(By.id("user_user_detail_attributes_email"));

		// To perform operation on Email text box call sendKeys() method from Utils
		// class
		Utils.sendKeys(wbEmail, emailId);

		// find Password text box
		WebElement wbPass = driver.findElement(By.id("user_user_detail_attributes_password"));
		// To perform operation on Password text box call sendKeys() method from Utils
		// class
		Utils.sendKeys(wbPass, password);

		// find Confirm Password text box
		WebElement wbCPass = driver.findElement(By.id("user_user_detail_attributes_password_confirmation"));

		// To perform operation on confirm Password text box call sendKeys() method from
		// Utils
		// class
		Utils.sendKeys(wbCPass, password);

		Thread.sleep(5000);
		// find create button
		WebElement wbCreate = driver.findElement(By.name("submit"));

		// To Perform operation on create button, call click() method from Utils class
		Utils.click(wbCreate);
	}

	// create validateLoginFunctionalityTest test case using @Test annotation

	@Test(priority = 2)
	public void validateLoginFunctionalityTest() throws InterruptedException {
		// find the username text box
		WebElement wbUsername = driver.findElement(By.id("email"));

		// To operation operation on username text box, call sendKeys() method from
		// Utils class
		Utils.sendKeys(wbUsername, emailId);

		// find password text box
		WebElement wbpass = driver.findElement(By.id("password"));

		// To Operation on password text box, call sendKeys() method from Utils Class
		Utils.sendKeys(wbpass, password);

		Thread.sleep(5000);
		// find the login button
		WebElement wbLogin = driver.findElement(By.name("submit"));

		// To perform operation on login button, call click() method from Utils class
		Utils.click(wbLogin);
	}

	// create a validateProfileFunctionality test cases using @Test annotation
	@Test(priority = 3)
	public void validateProfileFunctionality() {
		// find the profile link
		WebElement wbProfile = driver.findElement(By.xpath("//a[text()='Profile']"));

		// To perform operation on profile link, call click() method from Utils class
		Utils.click(wbProfile);
	}

	// create the validateLogoutFunctionality test cases using @test annotation
	@Test(priority = 4)
	public void validateLogoutFunctionality() {
		// find the log out button
		WebElement wbLogout = driver.findElement(By.xpath("//input[@value='Log out']"));

		// to perform operation on logout button, call click() method from Utils class
		Utils.click(wbLogout);
	}

	// crate non static tearDown() method with @AfterClass Post annotation

	@AfterClass
	public void tearDown() {
		// close a session
		// driver.quit();
	}

	@AfterMethod
	public void abc() throws InterruptedException {
		Thread.sleep(5000);
	}

}
