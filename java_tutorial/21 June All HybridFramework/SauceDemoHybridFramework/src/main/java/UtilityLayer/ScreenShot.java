package UtilityLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import BaseLayer.BaseClass;

public class ScreenShot extends BaseClass {
	public static String takeScreenShot(String foldername, String screenshotname)
			throws WebDriverException, IOException {
		String destinationpath = System.getProperty("user.dir") + "\\" + foldername + "\\"
				+ DateAndTime.captureCurrentYear() + "\\" + DateAndTime.captureCurrentMonthAndYear() + "\\"
				+ screenshotname + DateAndTime.captureCurrentDateAndTime() + ".png";
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File(destinationpath));
		return destinationpath;
	}
}
