package fBTest;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import pojo.BrowserForFB;
import pom.PomFB;
import utility.BaseClassFB;
import utility.Parametrisation;
import utility.ReportableClass;

public class FaceBookLogInTest extends BaseClassFB {
	
	ExtentReports Report;
	ExtentTest test;
	
	@BeforeTest
	public void configTest () {
		Report = ReportableClass.Report();
	}
	
	@BeforeMethod
	public void OpenEdge() {
		driver = BrowserForFB.OpenEdgeBrowser();
	}
	
	@DataProvider (name ="LogInFacebook")
	public Object [][] data () throws EncryptedDocumentException, IOException{
		return new Object [][] {
			{Parametrisation.ParametrisationClass("Sheet1", 5, 3),Parametrisation.ParametrisationClass("Sheet1", 5, 4)},
			{Parametrisation.ParametrisationClass("Sheet1", 6, 3),Parametrisation.ParametrisationClass("Sheet1", 6, 4)},
			{Parametrisation.ParametrisationClass("Sheet1", 7, 3),Parametrisation.ParametrisationClass("Sheet1", 7, 4)},
			{Parametrisation.ParametrisationClass("Sheet1", 4, 3),Parametrisation.ParametrisationClass("Sheet1", 4, 4)}
		};
	}
	
	
	@Test (dataProvider = "LogInFacebook")
	public void LogIntoFB (String A , String B) throws InterruptedException {
		test = Report.createTest("LogIntoFB");
		
		PomFB fb = new PomFB(driver);
		fb.IpID(A);
		fb.IpPass(B);
		fb.ClickOnLogin();
		
		WebElement PP = driver.findElement(By.xpath("//span[text()='Gaurav Nole']"));
		PP.click();
		Thread.sleep(4000); 
		String C_url =driver.getCurrentUrl();
		Assert.assertEquals(C_url, "https://www.facebook.com/gaurav.nole");
	}
	
	@AfterMethod
	public void statusReports (ITestResult result) {
		
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
		else if (result.getStatus()==ITestResult.FAILURE) 
		{
			test.log(Status.FAIL, result.getName());
		}
		else 
		{
		test.log(Status.SKIP, result.getName());
		}
		
	}
	
	@AfterTest
	public void clearData () {
		Report.flush();
	}

}
