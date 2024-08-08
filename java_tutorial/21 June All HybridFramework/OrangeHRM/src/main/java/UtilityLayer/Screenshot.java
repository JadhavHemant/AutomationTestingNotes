package UtilityLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import BaseLayer.BaseClass;

public class Screenshot extends BaseClass {
	
	public static String takeScreenshot(String folderName, String screenshotName) throws WebDriverException, IOException
	{
		String destinationPath = System.getProperty("user.dir")+"//"+folderName+"//"+DateAndTime.captureDates("year")+
				"//"+DateAndTime.captureDates("monthYear")+"//"+screenshotName+DateAndTime.captureDates("dateAndTime")+".png";
		
		FileUtils.copyFile(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE), new File(destinationPath) );
		return destinationPath;
	}

}
