package UtilityLayer;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ExtentReportsSetUp extends BaseClass {

	public static ExtentReports setUp(String reportName) {
		ExtentReports extentReports = new ExtentReports();
		String destinationPath = System.getProperty("user.dir") + "//ExtentReports//" + DateAndTime.captureCurrentYear()
				+ "//" + DateAndTime.captureCurrentMonthAndYear() + "//" + reportName
				+ DateAndTime.captureCurrentDateAndTime() + ".html";

		extentReports.attachReporter(new ExtentSparkReporter(destinationPath));

		return extentReports;
	}

}
