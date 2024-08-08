package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	protected static WebDriver driver;

	public static void initilization() {

		// connect to actual browser

		// upcasting
		driver = new ChromeDriver();

		// implicit wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// pageload timeout

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		// delete all cookies

		driver.manage().deleteAllCookies();

		// maximise window

		driver.manage().window().maximize();

		// open url
		driver.get("https://accounts.digilocker.gov.in/signup/smart_v2/1bad09c305565fabf8122991da6bd537--en");

	}

}
