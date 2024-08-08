package PageLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class DealsPage extends BaseClass {

	public void clickOnDealsLink() {
		driver.findElement(By.xpath("//a[@href='/deals']")).click();

	}

	public void clickOnCreateButton() {
		driver.findElement(By.xpath("//a[@href='/deals/new']")).click();
	}

	public void createDeals(String MonthAndYear, int Date, String Time) {
		driver.findElement(By.name("title")).sendKeys("Java");
		driver.findElement(By.xpath("//input[@class='calendarField']")).click();
		WebElement monthAndyear = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']"));
		while (true) {
			String actualMonthAnYear = monthAndyear.getText();
			if (actualMonthAnYear.equalsIgnoreCase(MonthAndYear)) {
				List<WebElement> datelist = driver.findElements(
						By.xpath("//div[@class='react-datepicker__month']/descendant::div[@role='option']"));
				for (WebElement list : datelist) {
					String date1 = Integer.toString(Date);
					String listdate = list.getText();
					if (listdate.equalsIgnoreCase(date1)) {
						list.click();
						break;
					}

				}
				break;

			} else {
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();

			}
		}
		List<WebElement> TimeList = driver
				.findElements(By.xpath("//div[@class='react-datepicker__time']/div/ul/li[@role='option']"));
		for (WebElement time : TimeList) {
			String listTime = time.getText();
			if (listTime.equalsIgnoreCase(Time)) {
				time.click();
				break;
			}

		}

	}
	public void clickOnSaveButton()
	{
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}

}
