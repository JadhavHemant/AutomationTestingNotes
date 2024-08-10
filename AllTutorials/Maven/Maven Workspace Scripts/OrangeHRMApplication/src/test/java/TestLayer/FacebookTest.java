package TestLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookTest {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)).pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/reg");
	}

	@Test(priority = 1)
	public void validateLoginFunctionality() {
		driver.findElement(By.name("firstname")).sendKeys("Admin");
		driver.findElement(By.name("lastname")).sendKeys("admin123");

	}

	@Test(priority = 2)
	public void validateHomePageTitle() {
		Assert.assertEquals(driver.getTitle(), "Sign up for Facebook | Facebook");
	}

	@Test(priority = 3)
	public void validateHomePageUrl() {
		Assert.assertEquals(driver.getCurrentUrl().contains("facebook"), true);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}
}
