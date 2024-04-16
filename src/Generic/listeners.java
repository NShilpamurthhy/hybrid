package Generic;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test case execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case executed sucessfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test case failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test case skipped");
	}

}
