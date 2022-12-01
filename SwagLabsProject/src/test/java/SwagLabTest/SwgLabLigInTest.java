package SwagLabTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import pojo.SwagLabsOpenBrowser;
import pom.LogInPOMSwagLabs;
import utility.BaseClass;
import utility.Parametrisation;
import utility.Reports;

@Listeners (utility.Listeners.class)
public class SwgLabLigInTest extends BaseClass {
	
		ExtentReports Report;
		ExtentTest test;
		
		@BeforeTest 
		public void configurationTest() {
			Report = Reports.ReportMethod();
		}
		
		@DataProvider (name = "SwgLabLogInCred")
		public Object [] [] dataProvide() throws EncryptedDocumentException, IOException {
			String password = Parametrisation.GetSheetData("LogInData", 1, 1);
			return new Object [] [] {{Parametrisation.GetSheetData("LogInData", 1, 0),password},{Parametrisation.GetSheetData("LogInData", 2, 0),password},
				{Parametrisation.GetSheetData("LogInData", 3, 0),password},{Parametrisation.GetSheetData("LogInData", 4, 0),password}};
		}
		
		@BeforeMethod 
		public void openEgdeForTest() {
			
			driver = SwagLabsOpenBrowser.OpenEdgeBrowse();	
		}
		
		@Test (dataProvider = "SwgLabLogInCred")
		public void LogInWithValidCreds(String user , String pass) {
			
			test = Report.createTest("LogInWithValidCreds");
			LogInPOMSwagLabs li =new  LogInPOMSwagLabs(driver);
			li.EnterUsername(user);
			li.EnterPassword(pass);
			li.ClickOnLogInButton();
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
		}
		
		@AfterMethod
		public void getTestResult (ITestResult result) {
			
			if(result.getStatus()==ITestResult.SUCCESS) 
			{	
			test.log(Status.PASS, result.getName());	
			}
			else if(result.getStatus()==ITestResult.FAILURE)
			{
				test.log(Status.FAIL, result.getName());
			}
			else
			{
				test.log(Status.SKIP, result.getName());
			}
				
			}
		
		@AfterTest
		public void clearTestData() {
			
			Report.flush();
			
		}
		
			
			
		

}


