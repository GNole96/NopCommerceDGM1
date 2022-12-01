package fBTest;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import pojo.BrowserForFB;
import pom.PomFB;
import utility.BaseClassFB;
import utility.ReportableClass;


@Listeners (utility.ListenersClass.class)
public class FbExecution extends BaseClassFB  {
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void MadeReport() {
		
		reports = ReportableClass.Report();
	}
	
	@BeforeMethod
	public void EdgeBrowser () {
		driver = BrowserForFB.OpenEdgeBrowser();
	}

	
	@Test (priority = 1)
	public void VerifyEmail() throws InterruptedException {
		
		test=reports.createTest("VerifyEmail");
		PomFB g = new PomFB(driver);
		g.IpID("ss@21212");
		g.ClickOnLogin();
	}

	@Test (priority = 2)
	public void VerifyPass() {
		
		test = reports.createTest("VerifyPass");
		PomFB g = new PomFB(driver);
		g.IpPass("1234567");
	    g.ClickOnLogin();
	}
	

	@Test (priority = 3)
	public void VerifyLogInIdPass() {
		
		test=reports.createTest("VerifyLogInIdPass");	
		PomFB g = new PomFB(driver);
		g.IpID("gdg@122");
		g.IpPass("1234567");
		g.ClickOnLogin();
	}

	@Test (timeOut = 2000)
	public void CreatNewAcc() throws InterruptedException {
		
		test = reports.createTest("CreatNewAcc");
		PomFB g = new PomFB(driver);
		
		g.CreatACC();
		Thread.sleep(3000);
		g.EnterFirstName("Gaurav", driver);
		g.EnterLastName("Nole");
		g.EnterEmailForSingUp(driver, "");
		g.EnterPassForSingUp("1234567");
        g.selectDate(19);
		g.selectMont(9, driver);
		g.selectYear("1996");
		g.selectGender("Male");
		g.SignUpclick();
	}
	
	@AfterMethod
	public void LogTest(ITestResult result) {
		
		if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName());
		}else if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL,result.getName());
		}else {
			test.log(Status.SKIP, result.getName());
		}
		
	}
	
	
	@AfterTest
	public void clearData() {
		reports.flush();
	}

}
