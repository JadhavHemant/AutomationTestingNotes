package utilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import baseLayer.BaseClass;

public class Wait extends BaseClass{

	public static WebElement visibilityOf(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.visibilityOf(wb));
	}

	public static void sendKeys(WebElement wb, String ExpectedValue) {
		Wait.visibilityOf(wb).clear();
		Wait.visibilityOf(wb).sendKeys(ExpectedValue);
	}

	public static void click(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(wb)).click();
	}

	public static List<WebElement> visibilityOfAllElements(List<WebElement> listWb) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.visibilityOfAllElements(listWb));
	}

	public static void selectRadioButton(List<WebElement> listRadio, String ExpectedValue) {
		
		for(WebElement list: Wait.visibilityOfAllElements(listRadio))
		{
			String actualValue = list.getText();
			
			if(actualValue.equalsIgnoreCase(ExpectedValue))
			{
				Wait.click(list);
				break;
			}
		}
		
	}

}