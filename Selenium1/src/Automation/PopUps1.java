package Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PopUps1 {

	public static void main(String[] args) throws InterruptedException {
		
		/*    https://nxtgenaiacademy.com/alertandpopup/ 
		      https://bhulekh.mahabhumi.gov.in/ 
		      http://demo.guru99.com/test/radio.html
		      https://chercher.tech/practice/practice-dropdowns-selenium-webdriver
	    */
///////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		///  Child browser Popup Practice   \\\
		
		System.setProperty("webdriver.edge.driver", "D:\\apps\\Selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://vctcpune.com/");
		
		driver.manage().window().maximize();
		
		WebElement EleStart =driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
		EleStart.click();
		
		GnEmpliment.switchFocuse(driver, "Practice Page");
		WebElement option = driver.findElement(By.xpath("//input[@value='option3']"));
		option.click();
		
		
	}}
	/*	Set<String> handle = driver.getWindowHandles();
		Iterator<String> a = handle.iterator();
		
		while(a.hasNext())
		{
			String HandleNext = a.next();
			driver.switchTo().window(HandleNext);
			String currentTitle = driver.getTitle();
			
			if(currentTitle.equals("Practice Page"))
			{
				WebElement option = driver.findElement(By.xpath("//input[@value='option3']"));
				option.click();
			}
		}*/
	
		
	////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	/*
		
		//  Hidden pop up  // 
		
		WebDriver driver = GnEmpliment.openbrowser("https://www.facebook.com/");
		
		Thread.sleep(3000);
		WebElement pop = driver.findElement(By.xpath("//a[@rel='async']"));
		pop.click();
		
		Thread.sleep(3000);
		WebElement inname = driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']"));
		inname.sendKeys("Gaurav");
		
		WebElement lastname = driver.findElement(By.xpath("(//input[@data-type='text'])[2]"));
		lastname.sendKeys("Nole");
		
		WebElement button = driver.findElement(By.xpath("//button[@name='websubmit']"));
		button.click();
*/		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
	/*	//  Alert Division popUp  //
		
	WebDriver driver = GnEmpliment.openbrowser("https://nxtgenaiacademy.com/alertandpopup/");
		
		driver.navigate().to("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		
		WebElement alrts1 = driver.findElement(By.xpath("//button[@name='alertbox']"));
		alrts1.click();
		Alert f = driver.switchTo().alert();
		f.accept(); 
	
	WebElement AccRejpop = driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
	AccRejpop.click();
	Alert s = driver.switchTo().alert();
	s.dismiss();
	
	WebElement promptPop = driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
	promptPop.click();
	Alert z = driver.switchTo().alert();
	z.sendKeys("Yes");
	z.accept();
	}}
	*/
	