package Automation;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class sShot {
	
	
	public void CheckFunction() {
		WebDriver driver =GnEmpliment.openbrowser("https://demo.automationtesting.in/Frames.html");
		PomIframe obj1=new PomIframe(driver);
		obj1.SingleIframeInput();
		obj1.switchto(driver);
		obj1.inputkeys("Gaurav");
	}
	
	
	public static void main(String[] args) {
		
		sShot a = new sShot();
		 a.CheckFunction();
		
	}
	}