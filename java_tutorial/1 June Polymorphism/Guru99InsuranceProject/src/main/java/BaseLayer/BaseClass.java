package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	protected static WebDriver driver;

	// create a static initialization() method
	public static void initialization() {
		// Step 1: connect to actual browser
		// step 2: up casting
		driver = new ChromeDriver();

		// step 3: maximize browser
		driver.manage().window().maximize();

		// step 4: implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// step 5: pageLoadTimeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		// step 6: open a url
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
	}

}
