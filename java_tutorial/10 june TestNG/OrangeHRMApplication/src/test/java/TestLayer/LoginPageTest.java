package TestLayer;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

@Test(groups = { "LoginPage" ,"End2EndTesting","PIMPage"})
public class LoginPageTest extends BaseClass {

	@BeforeTest
	public void setUp() {
		BaseClass.initialization();
	}

	public void loginFunctionality() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
