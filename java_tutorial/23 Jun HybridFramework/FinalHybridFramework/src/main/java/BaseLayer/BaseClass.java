package BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	protected static Properties prop;

	public BaseClass() {
		String destinationPath = System.getProperty("user.dir") + "/src/main/java/ConfigurationLayer/config.properties";

		try {
			FileInputStream fis = new FileInputStream(destinationPath);

			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static ThreadLocal<WebDriver> td = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		return td.get();
	}

	public static void initialization() {
		// connect browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		// driver.get("https://prafpawar11.github.io/multiplewindows.html");-->HomePage

		// driver.get("https://www.goibibo.com/");

		String url = prop.getProperty("url");

		driver.get(url);

		td.set(driver);
	}

	public static void initialization(String browsername) {
		WebDriver driver = null;

		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			td.set(driver);
		} else if (browsername.equalsIgnoreCase("edge")) {
			td.set(new EdgeDriver());
		} else if (browsername.equalsIgnoreCase("incognito")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--incoginto");
			driver = new ChromeDriver(opt);
			td.set(driver);
		} else if (browsername.equalsIgnoreCase("headless")) {
			td.set(new ChromeDriver(new ChromeOptions().addArguments("--headless")));
		} else {
			System.out.println("Please mention valid browser name");
		}

		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().get("");
	}

}
