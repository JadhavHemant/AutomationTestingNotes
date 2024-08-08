package StepDefinition;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMSteps {
	static WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

	}

	@When("user is on home page and validate home page title")
	public void user_is_on_home_page_and_validate_home_page_title() {
		String actualTitle = driver.getTitle();
		Assertions.assertEquals(actualTitle, "OrangeHRM");
	}

	@When("user validate home page url")
	public void user_validate_home_page_url() {
		boolean actualResult = driver.getCurrentUrl().contains("orange");
		Assertions.assertEquals(actualResult, true);
	}

	@When("user validate home page logo")
	public void user_validate_home_page_logo() {
		boolean actualLogo = driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		Assertions.assertEquals(actualLogo, true);
	}

	@Given("user is on pim page and verify the url")
	public void user_is_on_pim_page_and_verify_the_url() {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		boolean actualResult = driver.getCurrentUrl().contains("pim");
		Assertions.assertTrue(actualResult);
	}

	@When("user click on add employee")
	public void user_click_on_add_employee() {
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
	}

	@When("user enter first name, middle name and last name")
	public void user_enter_first_name_middle_name_and_last_name() {

		driver.findElement(By.name("firstName")).sendKeys("Rahul");
		driver.findElement(By.name("middleName")).sendKeys("abc");
		driver.findElement(By.name("lastName")).sendKeys("Shah");

	}

	@When("user click on save button")
	public void user_click_on_save_button() {
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();

	}

}
