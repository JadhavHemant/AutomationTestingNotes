package StepDefinition;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CogmentoTestSteps {

	static WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.get("https://ui.cogmento.com/");
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	   driver.findElement(By.name("email")).sendKeys("prafulp1010@gmail.com");
	   driver.findElement(By.name("password")).sendKeys("Pr@ful0812");
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
	  driver.findElement(By.xpath("//div[text()='Login']")).click();
	}

	@Then("user validte home page title")
	public void user_validte_home_page_title() {
	   String actualTitle = driver.getTitle();
	   Assertions.assertEquals(actualTitle, "Cogmento CRM");
	}

	@Then("user validate home page logo")
	public void user_validate_home_page_logo() {
	  boolean actualLogo = driver.findElement(By.xpath("//div[@class='header item']")).isDisplayed();
	  Assertions.assertEquals(actualLogo, true);
	}

	@Then("user validate home page url")
	public void user_validate_home_page_url() {
	   String actualUrl = driver.getCurrentUrl();
	   Assertions.assertEquals(actualUrl.contains("cogmento"), true);
	}

	@When("user click on contact link")
	public void user_click_on_contact_link() {
	   driver.findElement(By.xpath("//a[@href='/contacts']")).click();
	}

	@When("click on create button")
	public void click_on_create_button() {
	   driver.findElement(By.xpath("//a[@href='/contacts/new']")).click();
	}

	@Then("user enters firstname, lastname, email and select status")
	public void user_enters_firstname_lastname_email_and_select_status() {
	   driver.findElement(By.name("first_name")).sendKeys("Pratibha");
	   driver.findElement(By.name("last_name")).sendKeys("Kale");
	   driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("pratibha@gmail.com");
	   driver.findElement(By.xpath("//div[@name='status']")).click();
	   List<WebElement> ls = driver.findElements(By.xpath("//div[@name='status']/child::span"));
	   
	   for(WebElement abc:ls)
	   {
		   String str = abc.getText();
		   if(str.equalsIgnoreCase("Ön Hold"))
		   {
			   abc.click();
			   break;
		   }
	   }
	}

	@Then("user click on save button")
	public void user_click_on_save_button() {
	   driver.findElement(By.xpath("//button[text()='Save']")).click();
	}

	@Then("user delete the contact")
	public void user_delete_the_contact() {
	    driver.findElement(By.xpath("//i[@class='trash icon']")).click();
	    driver.findElement(By.xpath("//button[text()='Delete']")).click();
	}

	@Then("user click on profile icon")
	public void user_click_on_profile_icon() {
	    driver.findElement(By.xpath("//div[@class='ui buttons']/child::div[@role='listbox']")).click();
	}

	@Then("user click on logout")
	public void user_click_on_logout() {
	    driver.findElement(By.xpath("//span[text()='Log Out']")).click();
	}

}
