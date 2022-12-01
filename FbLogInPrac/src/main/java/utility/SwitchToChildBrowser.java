package utility;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pojo.BrowserForFB;

public class SwitchToChildBrowser extends BaseClassFB {

	@Test
	public void SwitchToWindow () {
		
		driver = BrowserForFB.OpenEdgeBrowser();
		
		String MainPage = driver.getWindowHandle();
		
	WebElement SelePrac=driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));	
	SelePrac.click();
	
	Set<String> handle = driver.getWindowHandles();
	Iterator<String> i = handle.iterator();
	while(i.hasNext())
	{
		String Handle =i.next();
		driver.switchTo().window(Handle);
		String CurrentUrl = driver.getCurrentUrl();
		if(CurrentUrl.equals("https://vctcpune.com/selenium/practice.html"))
		{
			
//			WebElement k =driver.findElement(By.xpath("//input[@id='alertbtn']"));	
//			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",k);
//			k.click();
//			Alert a = driver.switchTo().alert();
//			a.accept();
    		WebElement option2 =driver.findElement(By.xpath("//input[@name='checkBoxOption2']"));
			option2.click();
			break;
		}
		
		driver.switchTo().window(MainPage);
		
		WebElement SelePrac1=driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));	
		SelePrac1.click();
		
		
		
		if(CurrentUrl.equals("https://vctcpune.com/selenium/practice.html"))
		{
			WebElement option1 =driver.findElement(By.xpath("//input[@name='checkBoxOption1']"));
			option1.click();
		}
	}
	}
	
	
}
