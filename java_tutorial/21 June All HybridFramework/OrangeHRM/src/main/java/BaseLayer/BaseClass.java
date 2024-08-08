package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	
	private static ThreadLocal <WebDriver> td = new ThreadLocal<WebDriver>();
	public static WebDriver getDriver()
	{
		return td.get();
	}
	public static void initialization()
	{
		WebDriver driver = new ChromeDriver();
//		if(browsername.equalsIgnoreCase("chrome"))
//		{
//			driver = new ChromeDriver();
//		}
//		else if(browsername.equalsIgnoreCase("edge"))
//		{
//			driver = new EdgeDriver();
//		}
//		else if(browsername.equalsIgnoreCase("incognito"))
//		{
//			ChromeOptions opt = new ChromeOptions();
//			opt.addArguments("--incognito");
//			driver = new ChromeDriver(opt);
//		}
//		else if(browsername.equalsIgnoreCase("headless"))
//		{
//			ChromeOptions opt = new ChromeOptions();
//			opt.addArguments("--headless");
//			driver = new ChromeDriver(opt);
//		}
//		else {
//			System.out.println("Please enter correct browser name");
//		}
		td.set(driver);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
