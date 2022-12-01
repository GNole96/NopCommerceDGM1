package testAuto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Automation.GnEmpliment;

public class AssertsPractice {
	
	@Test (priority = 1)
	public void opb () {
		GnEmpliment.openbrowser("https://nxtgenaiacademy.com/alertandpopup/");
	}
		
	@Test (dependsOnMethods = "opb")
	public void AlertsHandle(WebDriver driver) {
		WebElement alertpop = driver.findElement(By.xpath("//button[@name='alertbox']"));
		alertpop.click();
		System.out.println("Alert open");
		Alert A = driver.switchTo().alert();
		A.accept();
		
	}
}
