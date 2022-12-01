package testAuto;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import Automation.GnEmpliment;
import Automation.Parameterisation;

public class Auto1 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		/*			WebDriver driver = GnEmpliment.openbrowser("https://www.google.co.in/");
		
		/*	WebElement books = driver.findElement(By.xpath("//a[@href='/Books/b/?ie=UTF8&node=976389031&ref_=nav_cs_books']"));
		books.click();
		
		WebElement categ = driver.findElement(By.xpath("//li[@class=\"a-spacing-micro apb-browse-refinements-indent-2\"]"));
		categ.click();
/
		WebElement Ginput = driver.findElement(By.xpath("//input[@jsaction='paste:puy29d;']"));
		String g =Parameterisation.Parameterization("Sheet1", 1, 0);
		Ginput.sendKeys(g);
		
	WebElement sclick = driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
		sclick.click();
		
		WebElement vctcClick = driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
		vctcClick.click();
		
		String Mainpage = driver.getWindowHandle();
	//	System.out.println(Mainpage);
		Thread.sleep(2000);
		
		WebElement StartPrac = driver.findElement(By.xpath("//a[@rel='noopener noreferrer']"));
		StartPrac.click();
		GnEmpliment.switchFocuse(driver, "Practice Page");
		
		WebElement option = driver.findElement(By.xpath("//input[@value='option3']"));
		option.click();
		
		driver.switchTo().window(Mainpage);
		String CurrentTitle = driver.getTitle();
		System.out.println(CurrentTitle);
		WebElement vctcClick1 = driver.findElement(By.xpath("(//a[text()='Courses'])[1]"));
		vctcClick1.click();
		
		
		int [] A = {25,22,65,42,65,41,22,21,16,33};
		int B = A.length;
		
		for(int i =1; i<=B;i++) {
			for(int j=1;j<=B;j++) {
				
				
				if(i<j) {
					System.out.println(i);
					
				}
			}
			
		}}
		*/
		// prime no the no that is divisible by Itself and 1 only
		
			
			int count =0;
		for(int i =0;i<=20;i++)
		{
			for(int j=1;j<=20;j++)
			{
				if(i%j==0) 
				{
					count++;
				}
			}
			
			if(count==2)
			{
			System.out.println("This is prime No :- "+count);	
			}
		}
			
		
		
}}
