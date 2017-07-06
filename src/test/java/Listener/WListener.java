package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class WListener implements ITestListener{

	public void onFinish(ITestContext arg0) {
	System.out.println("Test is successfully finish");
	
	}

	public void onStart(ITestContext arg0) {
		System.out.println("Test is start");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("Test is successfully failed by percentage");
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("Test is successfully failed");
		
	}

	public void onTestSkipped(ITestResult arg0) {
		//System.out.println("Test is successfully done");// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("Test is Start successfully");// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Test is test successfuly");// TODO Auto-generated method stub
		
	}

}
