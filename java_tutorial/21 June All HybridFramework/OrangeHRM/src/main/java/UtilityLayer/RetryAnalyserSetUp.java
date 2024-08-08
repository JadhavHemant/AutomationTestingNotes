package UtilityLayer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserSetUp implements IRetryAnalyzer{

	int counter = 0;
	int maxCounter = 5;
	@Override
	public boolean retry(ITestResult result) {
		if(counter<maxCounter)
		{
			counter++;
			return true;
		}
		return false;
	}

}
