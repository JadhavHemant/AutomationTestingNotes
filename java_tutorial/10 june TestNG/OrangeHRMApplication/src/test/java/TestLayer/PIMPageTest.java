package TestLayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

@Test(groups = { "PIMPage", "End2EndTesting" }, dependsOnGroups = { "LoginPage", "HomePage" })
public class PIMPageTest extends BaseClass {
	
	String employeeId;
	public static String firstName = "Rohit";
	public static String lastName = "Patil";

	@Test(priority = 1)
	public void validateUserOnPIMPage() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		boolean actualResult = driver.getCurrentUrl().contains("pim");
		Assert.assertEquals(actualResult, true);
		Thread.sleep(5000);
	}

	@Test(priority = 2)
	public void addNewUserInPIMPage() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstName")).sendKeys(firstName);
		driver.findElement(By.name("lastName")).sendKeys(lastName);

		employeeId = driver.findElement(By.xpath("//label[text()='Employee Id']/following::input[1]"))
				.getAttribute("value");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		Thread.sleep(5000);
	}

	@Test(priority = 3)
	public void searchUserInPIMPage() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Employee List']")).click();
		driver.findElement(By.xpath("//label[text()='Employee Id']/following::input[1]")).sendKeys(employeeId);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=' Search ']")).click();
		Thread.sleep(5000);
	}

}
