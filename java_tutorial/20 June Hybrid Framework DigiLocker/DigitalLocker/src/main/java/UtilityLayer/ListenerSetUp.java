package UtilityLayer;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenerSetUp extends ExtentReportsSetUp implements ITestListener {

	public static ExtentReports extentReports;

	public static ExtentTest extentTest;

	@Override
	public void onStart(ITestContext context) {
		// capture project name
		String Projectname = context.getSuite().getName();
		// Start generating extentReports
		extentReports = ExtentReportsSetUp.SetUp(Projectname);

	}

	@Override
	public void onTestStart(ITestResult result) {
		// capture the testcase name

		String Testcasename = result.getMethod().getMethodName();

		// create testcase inside extentReport
		extentTest = extentReports.createTest("Test case start name is" + Testcasename);

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// capture the testcase name
		String Testcasename = result.getMethod().getMethodName();
		// takesScreenshot
		String destinationpath = null;
		try {
			destinationpath = Screenshot.takesScreenshot("PassScreenshot", Testcasename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		// generate log
		extentTest.log(Status.PASS, "Testcase pass name is" + Testcasename);

		// add screenshot to report

		extentTest.addScreenCaptureFromPath(destinationpath);

	}

	@Override
	public void onTestFailure(ITestResult result) {

		// capture the testcase name
		String Testcasename = result.getMethod().getMethodName();
		// takesScreenshot
		String destinationpath = null;
		try {
			destinationpath = Screenshot.takesScreenshot("FailScreenshot", Testcasename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		// generate log
		extentTest.log(Status.FAIL, "Testcase fail name is" + Testcasename);

		// add screenshot to report

		extentTest.addScreenCaptureFromPath(destinationpath);

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		// capture testcasename

		String Testcasename = result.getMethod().getMethodName();
		extentTest.log(Status.SKIP, "Testcase skip name is" + Testcasename);

	}

	@Override
	public void onFinish(ITestContext context) {

		extentReports.flush();

	}

}
