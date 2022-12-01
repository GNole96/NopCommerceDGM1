package Automation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Waits {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void OpenBrowser () throws InterruptedException {
	    driver = GnEmpliment.openbrowser("https://www.facebook.com/");
	}
	
	@Test (priority = 2)
	public void Registration () throws InterruptedException  {
		//Here I applied Implicit wait in Browser method of pomFb class 
		PomFb pm = new PomFb(driver);
		pm.CreatACC();
		pm.EnterFirstName("gn", driver);
		pm.EnterLastName("Nole");
		pm.selectDate(19);
		
	}
	
	@Test (priority = 1)
	public void enterid () throws InterruptedException {
		PomFb pm = new PomFb(driver);
		pm.IpPass("gn12345");	
	}

	@AfterMethod (enabled = false)
	public void close () {
		driver.close();
		
	}
	

}
