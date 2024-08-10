package TestLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)).pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(priority = 1)
	public void validateLoginFunctionality() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

	@Test(priority = 2)
	public void validateHomePageTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@Test(priority = 3)
	public void validateHomePageUrl() {
		Assert.assertEquals(driver.getCurrentUrl().contains("orange"), true);
	}

	@Test(priority = 4)
	public void validatePIMPageURl() {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Assert.assertEquals(driver.getCurrentUrl().contains("pim"), true);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}

}
