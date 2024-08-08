package UtilityLayer;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import ru.yandex.qatools.ashot.AShot;

public class ScreenshotClass extends BaseClass {

	public static String takeScreenshot(String folderName, String screenshotName) {
		String destinationPath = System.getProperty("user.dir") + "//" + folderName + "//"
				+ DateAndTime.captureCurrentYear() + "//" + DateAndTime.captureCurrentMonthAndYear() + "//"
				+ screenshotName + DateAndTime.captureCurrentDateAndTime() + ".png";

		try {
			FileUtils.copyFile(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE),
					new File(destinationPath));
		} catch (Exception e) {

			e.printStackTrace();
		}

		return destinationPath;

	}

	public static String fullScreenshot(String folderName, String screenshotName) throws IOException {
		String destinationPath = System.getProperty("user.dir") + "//" + folderName + "//"
				+ DateAndTime.captureCurrentYear() + "//" + DateAndTime.captureCurrentMonthAndYear() + "//"
				+ screenshotName + DateAndTime.captureCurrentDateAndTime() + ".png";

//		ImageIO.write(new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(getDriver())
//				.getImage(), "png", new File(destinationPath));

		return destinationPath;
	}

}
