package TestLayer;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.SignUpPage;
import UtilityLayer.ExcelReader;

public class SignUpPageTest extends BaseClass {

	// BeforeAnnotation

	@BeforeTest
	public void setUp() {
		BaseClass.initilization();
	}

	// Test case

	@Test(dataProvider = "digilockerTestData")
	public void validateSignUpFunctionality(String Fname, String date, String month, String year, String gender,
			String mobile, String email, String pin) {

		SignUpPage signuppage = new SignUpPage();
		// signuppage.signUpFunctionality("DipaliK", "11", "6", 3, "Female",
		// "365478951", "dipali@gmail.com", "123456");
		int abc=Integer.parseInt(year);
		signuppage.signUpFunctionality(Fname, date, month, abc, gender, mobile, email, pin);

	}

	@DataProvider(name = "digilockerTestData")
	public Object[][] getTestData() throws IOException {
		ExcelReader obj = new ExcelReader("C:\\Users\\Dell\\Desktop\\TestDatadigilocker.xlsx");

		Object[][] data = obj.getAllSheetTestData(0);

		return data;
	}

	// postCondition

	@AfterTest
	public void tearDown() {
		driver.quit();

	}
}
