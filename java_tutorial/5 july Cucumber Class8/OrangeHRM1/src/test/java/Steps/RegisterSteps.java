package Steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import UitlityLayer.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterSteps {
	static WebDriver driver;

	String ExcelSheetPath = System.getProperty("user.dir") + "//src//main//java//TestData//TestData.xlsx";

	@Given("user is on register page")
	public void user_is_on_register_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
	}

	@When("user enter firstname and lastname from {string} and {int}")
	public void user_enter_firstname_and_lastname_from_and(String ExcelSheetName, Integer rownumber)
			throws InterruptedException {

		ExcelReader excel = new ExcelReader();
		List<Map<String, String>> testData = excel.getAllSheetTestData(ExcelSheetPath, ExcelSheetName);

		String fname = testData.get(rownumber).get("FirstName");
		String lname = testData.get(rownumber).get("LastName");
		String uname = testData.get(rownumber).get("username");
		String pass = testData.get(rownumber).get("password");

		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);

		driver.findElement(By.name("reg_email__")).sendKeys(uname);
		driver.findElement(By.name("reg_passwd__")).sendKeys(pass);

		Thread.sleep(7000);

		driver.quit();

	}

}
