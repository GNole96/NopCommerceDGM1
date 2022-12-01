package testAuto;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Automation.GnEmpliment;

public class ChildBrowserPopUp {
	
	@Test
	public void ChildBrowser () {
		
		WebDriver driver = GnEmpliment.openbrowser("https://vctcpune.com/");
		
		WebElement StartpeacticeTab = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		StartpeacticeTab.click();
		
		Set<String> PopUp = driver.getWindowHandles();
		Iterator<String> i = PopUp.iterator(); 
		
		while(i.hasNext())
		{
			String handle = i.next();
			driver.switchTo().window(handle);
			String CurrentUrl = driver.getCurrentUrl();
			if(CurrentUrl.equals("https://vctcpune.com/selenium/practice.html")) 
				
			{
				WebElement Option1 =driver.findElement(By.xpath("//input[@name='checkBoxOption1']"));
				Option1.click();
			}
		}
	
	
	}

}
