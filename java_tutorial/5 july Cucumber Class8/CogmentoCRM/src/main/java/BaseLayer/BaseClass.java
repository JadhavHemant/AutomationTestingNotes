package BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	protected static WebDriver driver;
	protected static Properties prop;

	public static void initialization() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)).pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url = prop.getProperty("url");
		driver.get(url);

	}

	public BaseClass() 

	{
		prop = new Properties();
		String path = System.getProperty("user.dir") + "//src//main//java//Configuration//Config.properties";
		try {
		FileInputStream fis = new FileInputStream(path);
	
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
