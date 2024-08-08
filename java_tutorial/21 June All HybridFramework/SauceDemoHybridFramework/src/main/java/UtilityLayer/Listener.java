package UtilityLayer;

import java.io.IOException;

import org.openqa.selenium.WebDriverException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listener extends ExtendReportsSetUp implements ITestListener {
	protected static ExtentReports extendreports;
	protected static ExtentTest extendtest;

	@Override
	public void onStart(ITestContext context) {
		extendreports = ExtendReportsSetUp.setUp(context.getSuite().getName());

	}

	@Override
	public void onTestStart(ITestResult result) {
		extendtest = extendreports.createTest(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String destinationpath = null;
		try {
			destinationpath = ScreenShot.takeScreenShot("PassScreenshot", result.getMethod().getMethodName());
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extendtest.log(Status.PASS, "Test case pass name is :" + result.getMethod().getMethodName());
		extendtest.addScreenCaptureFromPath(destinationpath);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String destinationpath = null;
		try {
			destinationpath = ScreenShot.takeScreenShot("FailScreenshot", result.getMethod().getMethodName());
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extendtest.log(Status.FAIL, "Test case fail name is :" + result.getMethod().getMethodName());
		extendtest.addScreenCaptureFromPath(destinationpath);
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		extendtest.log(Status.SKIP, "Test case skip name is :" + result.getMethod().getMethodName());

	}

	@Override
	public void onFinish(ITestContext context) {
		extendreports.flush();
	}

}
