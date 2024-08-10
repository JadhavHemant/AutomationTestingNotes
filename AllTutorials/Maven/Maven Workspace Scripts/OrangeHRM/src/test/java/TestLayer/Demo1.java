package TestLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void fbTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.findElement(By.name("firstname")).sendKeys("Ashish");

	}
	
	
}
