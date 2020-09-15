package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface that implements TestNG listeners

public class Listeners implements ITestListener  

{
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		//screenshot //response if test failed
		System.out.println("Failure!!!!" + result.getName());
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		//screenshot //response if test failed
		System.out.println("Successfully passed!!! Listener.");
		
	}

	
	
	
}
