package Automation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("this is before test");
	}
	
	@AfterTest 
	public void afterTest() {
		System.out.println("this is after test");
	}
	

	public void afterMethod() {
		System.out.println("this is afterMethod");
	}
	
	@BeforeMethod
	public void beforeMethd() {
		System.out.println("this is before method");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("this is before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("this is after class");
	}
	
/*	@Test (priority = 3 ) // number of time run 
	public void Test1() {
		WebDriver driver = GnEmpliment.openbrowser("https://www.facebook.com/");
			PomFb obj1=new PomFb(driver);
			obj1.IpID("abcd@gmail.com");
			obj1.IpPass("1234567");
			obj1.ClickOnLogin();
	}
*/
	@Test (priority = 2 )  // will not execute
	public void Test2() {
		System.out.println("this is test 2");
	}
	@Parameters({"i","j"})
	@Test 
	public void test4(int a , int b) throws InterruptedException {
		System.out.println("this is add test"+ a+b);
		
	}
	
	@Test (timeOut = 1000 ,priority = 1)
	public void Test3() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("this is test 3 ");
	}
	
	
}
