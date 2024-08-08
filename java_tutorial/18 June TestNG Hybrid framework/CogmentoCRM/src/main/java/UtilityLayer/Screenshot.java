package UtilityLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;

public class Screenshot extends BaseClass {

	// create static method to take the screenshot by passing 2 string arguments and
	// string return type

	public static String takeScreenshot(String folderName, String screenshotName) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String destinationPath = System.getProperty("user.dir") + "//" + folderName + "//"
				+ DateAndTime.captureCurrenYear() + "//" + DateAndTime.captureCurrentMonthAndYear() + "//"
				+ screenshotName + DateAndTime.captureCurrentDateAndTime() + ".png";

		FileUtils.copyFile(src, new File(destinationPath));

		return destinationPath;
	}

}
