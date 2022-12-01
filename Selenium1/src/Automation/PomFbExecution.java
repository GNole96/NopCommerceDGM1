package Automation;

import org.openqa.selenium.WebDriver;

public class PomFbExecution {

	WebDriver driver;
	PomFb obj1 = new PomFb (driver);

	public void VerifyEmail() throws InterruptedException {
		driver = GnEmpliment.openbrowser("https://www.facebook.com/");
		Thread.sleep(2000);
		obj1.IpID("ss@21212");
		obj1.ClickOnLogin();
	}

	public void VerifyPass() {
		driver = GnEmpliment.openbrowser("https://www.facebook.com/");
		PomFb obj1=new PomFb(driver);
		obj1.IpPass("1234567");
		obj1.ClickOnLogin();
	}
	
	

	public void VerifyLogInIdPass() {
		 driver = GnEmpliment.openbrowser("https://www.facebook.com/");
		PomFb obj1=new PomFb(driver);
		obj1.IpID("gdg@122");
		obj1.IpPass("1234567");
		obj1.ClickOnLogin();
	}

	public void CreatNewAcc() throws InterruptedException {
      WebDriver   driver = GnEmpliment.openbrowser("https://www.facebook.com/");
		PomFb obj1=new PomFb(driver);
		obj1.CreatACC();
		Thread.sleep(4000);
		obj1.EnterFirstName("Gaurav", driver);
		obj1.EnterLastName("Nole");
		obj1.EnterEmailForSingUp(driver, "");
		obj1.EnterPassForSingUp("1234567");
        obj1.selectDate(19);
		obj1.selectMont(9, driver);
		obj1.selectYear("1996");
		obj1.selectGender("Male");
		obj1.SignUpclick();
	}
	
	
	static void main(String[] args) throws InterruptedException {
		
		PomFbExecution obj =new PomFbExecution();
		obj.VerifyEmail();
		Thread.sleep(3000);
		obj.VerifyPass();
		Thread.sleep(3000);
		obj.VerifyLogInIdPass();
		Thread.sleep(3000);
		obj.CreatNewAcc();
		
	}
	
}
