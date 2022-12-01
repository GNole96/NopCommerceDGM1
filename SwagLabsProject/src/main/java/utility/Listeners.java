package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseClass implements ITestListener {
	
	
	public void onTestStarts (ITestResult result) {
		System.out.println("On Test start" + result.getName());
	}
	
	public void onTestFailure (ITestResult result) {
		System.out.println("On Test Failed" + result.getName());
		
		try {
			ScreenShot.SrnShot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test skipped" + result.getName());
	}

	public void onTestSuccess (ITestResult result) {
		System.out.println("On Test Success" + result.getName());
	}
	
	public void onTestEnd(ITestResult result) {
		
		System.out.println("On Test Ends" + result.getName());
	}
	
	
}
