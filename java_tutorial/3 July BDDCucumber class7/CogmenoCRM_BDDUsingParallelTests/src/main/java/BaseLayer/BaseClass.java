package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	protected static Properties prop;
	private static ThreadLocal<WebDriver> td = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		return td.get();
	}

	public static void initialization(String browsername) {
		//WebDriver driver = null;
		if (browsername.equalsIgnoreCase("chrome")) {
			td.set(new ChromeDriver());
		} else if (browsername.equalsIgnoreCase("edge")) {
			td.set(new EdgeDriver());
		} else if (browsername.equalsIgnoreCase("incognito")) {
			td.set(new ChromeDriver(new ChromeOptions().addArguments("--incognito")));
		} else if (browsername.equalsIgnoreCase("headless")) {
			td.set(new ChromeDriver(new ChromeOptions().addArguments("--headless")));
		} else {
			System.out.println("Please Enter valid browser name");
		}

		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		String url = prop.getProperty("url");
		getDriver().get(url);
	}

	public BaseClass() {
		prop = new Properties();
		String path = System.getProperty("user.dir") + "//src//main//java//ConfigurationLayer//config.properties";
		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
		} catch (Exception e) {
			e.getLocalizedMessage();
		}

	}

}
