package UtilityLayer;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ExtentReportsSetUp extends BaseClass {

	// create static method with extend report return with one string argument

	public static ExtentReports SetUp(String reportname) {

		ExtentReports extentReports = new ExtentReports();

		String destinationpath = System.getProperty("user.dir") + "//ExtentReports//" + DateAndTime.captureCurrentYear()
				+ "//" + DateAndTime.captureCurrentMonthAndYear() + "//" +

				reportname + DateAndTime.captureCurrentDateAndTime() + ".html";

		// store the generated report in destination location by creating object
		// ExtentSparkReporter by passing destination path

		ExtentSparkReporter extentReporter = new ExtentSparkReporter(destinationpath);

		// attach report to destination location

		extentReports.attachReporter(extentReporter);

		return extentReports;

	}
}
