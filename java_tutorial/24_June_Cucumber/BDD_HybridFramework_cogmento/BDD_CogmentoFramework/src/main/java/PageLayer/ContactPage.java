package PageLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class ContactPage extends BaseClass {
	public void clickOnContactLink() {
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
	}

	public void clickOnCreateButton() {
		driver.findElement(By.xpath("//a[@href='/contacts/new']")).click();
	}

	public void createContact(String Fname, String LName, String Status) {
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(Fname);
		driver.findElement(By.name("last_name")).sendKeys(LName);
		driver.findElement(By.xpath("//div[@name='status']")).click();

		List<WebElement> statusList = driver.findElements(By.xpath("//div[@name='status']/child::span"));
		for (WebElement list : statusList) {
			String statuslist = list.getText();
			if (statuslist.equalsIgnoreCase(Status)) {
				list.click();
				break;
			}
		}
	}

	public void clickOnSaveButtton() {
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}

}
