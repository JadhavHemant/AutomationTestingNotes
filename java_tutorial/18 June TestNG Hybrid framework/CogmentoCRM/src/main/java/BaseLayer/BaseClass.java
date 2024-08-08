package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	// WebDriver as static global variables
	public static WebDriver driver;

	// create static initialization method
	public static void initialization() {
		// connect to actual browser code

		// up casting
		driver = new ChromeDriver();
		// implicitlyWait code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// pageLoadTimeout code
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// maximize
		driver.manage().window().maximize();
		// deleteAllCookies
		driver.manage().deleteAllCookies();
		// open a URL
		driver.get("https://ui.cogmento.com/");
	}

}
