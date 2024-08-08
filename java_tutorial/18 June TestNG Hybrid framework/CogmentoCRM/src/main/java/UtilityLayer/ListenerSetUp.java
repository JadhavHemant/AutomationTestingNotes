package UtilityLayer;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenerSetUp extends ExtentReportsSetUp implements ITestListener {
	private static ExtentReports extentReports;
	private static ExtentTest extentTest;

	// override the ITestListener methods
	@Override
	public void onStart(ITestContext context) {
		String projectName = context.getSuite().getName();
		extentReports = ExtentReportsSetUp.setUp(projectName);
	}

	@Override
	public void onTestStart(ITestResult result) {
		String testCaseName = result.getMethod().getMethodName();
		extentTest = extentReports.createTest("Test Case started name is " + testCaseName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testCaseName = result.getMethod().getMethodName();
		extentTest.log(Status.PASS, "Test case Pass Name is " + testCaseName);
		String destinationPath = null;
		try {
			destinationPath = Screenshot.takeScreenshot("PassScreenshot", testCaseName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extentTest.addScreenCaptureFromPath(destinationPath);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testCaseName = result.getMethod().getMethodName();
		extentTest.log(Status.FAIL, "Test Case Fail Name is " + testCaseName);
		String destinationPath = null;
		try {
			destinationPath = Screenshot.takeScreenshot("FailScreenshot", testCaseName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		extentTest.addScreenCaptureFromPath(destinationPath);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testCaseName = result.getMethod().getMethodName();
		extentTest.log(Status.SKIP, "Test Case Skip name is " + testCaseName);
	}

	@Override
	public void onFinish(ITestContext context) {
		extentReports.flush();
	}

}
