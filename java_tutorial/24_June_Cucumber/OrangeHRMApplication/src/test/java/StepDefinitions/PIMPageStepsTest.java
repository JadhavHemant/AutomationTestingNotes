package StepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMPageStepsTest {
	static WebDriver driver;

	@Given("user is on login Page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

	@When("user is on login page and validate home page title")
	public void user_is_on_home_page_and_validate_home_page_title() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@When("user validate home page url")
	public void user_validate_home_page_url() {
		Assert.assertEquals(driver.getCurrentUrl().contains("orange"), true);
	}

	@When("user click on pim page link")
	public void user_click_on_pim_page_link() {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
	}

	@When("user click on add employee")
	public void user_click_on_add_employee() {
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
	}

	@Then("user enter first name and last name")
	public void user_enter_first_name_and_last_name() {
		driver.findElement(By.name("firstName")).sendKeys("Rohit");
		driver.findElement(By.name("lastName")).sendKeys("Shinde");

	}

	@Then("user click on save button")
	public void user_click_on_save_button() {
		driver.findElement(By.xpath("//button[text()=' Save ']"));
		
	}

	@AfterStep
	public static void tearDown(Scenario scenario) throws InterruptedException {
		Thread.sleep(4000);
		if (scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] b = ts.getScreenshotAs(OutputType.BYTES);

			scenario.attach(b, "image/png", scenario.getName());
		} else {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] b = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(b, "image/png", scenario.getName());
		}
	}

}
