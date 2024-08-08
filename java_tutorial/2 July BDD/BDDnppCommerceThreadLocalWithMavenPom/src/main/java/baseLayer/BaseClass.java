
package baseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
    protected static Properties prop;

    // create object of ThreadLocal generic
    private static ThreadLocal<WebDriver> td = new ThreadLocal<WebDriver>();

    // capture webdriver from ThreadLocal class
    public static WebDriver getDriver() {
        return td.get();
    }

    public static void initialization(String browserName) {
        WebDriver driver = null;

        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            // set WebDriver in ThreadLocal class.
            td.set(driver);
        } else if (browserName.equalsIgnoreCase("edge")) {
            td.set(new EdgeDriver());
        } else if (browserName.equalsIgnoreCase("incognito")) {
            ChromeOptions opt = new ChromeOptions();
            opt.addArguments("--incognito");
            td.set(new ChromeDriver(opt));
        } else {
            System.out.println("Enter a valid browser name");
        }

        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        getDriver().manage().window().maximize();
        getDriver().manage().deleteAllCookies();

        String url = prop.getProperty("url");

        getDriver().get(url);
    }

    public BaseClass() {
        prop = new Properties();
        String urlPath = System.getProperty("user.dir") + "/src/main/java/ConfigurationLayer/config.properties";
        try {
            FileInputStream fis = new FileInputStream(urlPath);
            prop.load(fis);
        } catch (FileNotFoundException e) {
            System.out.println("Configuration file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error loading configuration file: " + e.getMessage());
        }
    }

    
}

