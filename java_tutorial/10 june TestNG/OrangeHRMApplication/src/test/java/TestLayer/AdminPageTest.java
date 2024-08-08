package TestLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

@Test(groups = { "AdminPage","End2EndTesting" }, dependsOnGroups = { "PIMPage" })
public class AdminPageTest extends BaseClass {

	@Test(priority = 1)
	public void validateUserOnAdminPage() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		boolean actualRestult = driver.getCurrentUrl().contains("admin");
		Assert.assertEquals(actualRestult, true);
		Thread.sleep(5000);
	}

	@Test(priority = 2)
	public void createUserCredentails() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='User Role']/following::div[4]")).click();
		List<WebElement> ls = driver.findElements(By.xpath("//div[@class='oxd-select-option']/span"));
		for (WebElement abc : ls) {
			String a = abc.getText();
			if (a.equals("Admin")) {
				abc.click();
				break;
			}
		}

		driver.findElement(By.xpath("//label[text()='Status']/following::div[4]")).click();
		Thread.sleep(5000);
		List<WebElement> ls1 = driver.findElements(By.xpath("//div[@class='oxd-select-option']/span"));
		for (WebElement abc : ls1) {
			String a = abc.getText();
			if (a.equals("Enabled")) {
				abc.click();
				break;
			}
		}

		driver.findElement(By.xpath("//label[text()='Employee Name']/following::input[1]"))
				.sendKeys(PIMPageTest.firstName + " " + PIMPageTest.lastName);
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		act.keyDown(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Username']/following::input[1]")).sendKeys("rohit1@gmail.com");
		driver.findElement(By.xpath("//label[text()='Password']/following::input[1]")).sendKeys("rohit@123");
		driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input[1]"))
				.sendKeys("rohit@123");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();

	}

}
