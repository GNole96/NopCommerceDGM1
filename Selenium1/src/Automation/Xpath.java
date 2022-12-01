package Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = GnEmpliment.openbrowser("https://vctcpune.com/");
		
		WebElement Startse = driver.findElement(By.xpath("//a[@target='_blank']"));
		Startse.click();
		
		Set<String> handle = driver.getWindowHandles();  //strings random and not duplicate
		Iterator<String> a = handle.iterator(); // iterate one by one 
		
		while(a.hasNext())
		{
			String handlss = a.next();
		    driver.switchTo().window(handlss);
		    String currenttitle = driver.getTitle();
		    
		    if(currenttitle.equals("Practice Page")) 
		    	
		    {
		    	WebElement option2 = driver.findElement(By.xpath("//input[@value='option2']"));
		    	option2.click();
		    }
		}
		
		
		
	}
	
	

}
