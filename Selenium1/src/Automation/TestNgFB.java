package Automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgFB {
		WebDriver driver;
	
	@Test
	public void Browser() throws InterruptedException {
		driver = GnEmpliment.openbrowser("https://www.facebook.com/");
	}		
	
	@Test (priority = 1)
	public void VerifyEmail() throws InterruptedException, IOException {
		PomFb z= new PomFb(driver);
		z.IpID("abcd@gmail.com");
		z.ClickOnLogin();
		GnEmpliment.SrnShot("VerifyEmail22");
	}
	
	@AfterMethod
	public void Close() {
		driver.quit();
	}
	
	@Test (priority = 2)
	public void VerifyPass() throws InterruptedException, IOException {
		PomFb z= new PomFb(driver);
		z.IpPass("1234@abcd");
		z.ClickOnLogin();

	}
	
	@Test (priority = 3)
	public void VerifyLogInIdPass() throws InterruptedException, IOException {
		PomFb z= new PomFb(driver);
		z.IpID("abcd@gmail.com");
		z.IpPass("1234@abcd");
		z.ClickOnLogin();
	}
	
	@Test 
	public void AlertsHandle(WebDriver driver) {
		WebElement alertpop = driver.findElement(By.xpath("//button[@name='alertbox']"));
		alertpop.click();
		System.out.println("Alert open");
		Alert A = driver.switchTo().alert();
		A.accept();
	}

}

	