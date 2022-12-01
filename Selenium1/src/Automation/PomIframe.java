package Automation;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomIframe {
	
	@FindBy (xpath ="(//a[@class='analystic'])[1]")private WebElement ClickSingleIfrmeButton;
	@FindBy (xpath ="(//a[@class='analystic'])[2]")private WebElement ClickDoubleIfrmeButton;
	@FindBy (xpath = "(//iframe[@src='SingleFrame.html'])[1]")private WebElement SingleIframe;
	@FindBy (xpath = "//iframe[@src='MultipleFrames.html']")private WebElement parentIframe;
	@FindBy (xpath = "//iframe[@style='float: left;height: 250px;width: 400px']")private WebElement ChildIframe;
	@FindBy (xpath = "(//input)[1]")private WebElement InputFild;
	
	public PomIframe(WebDriver driver){
		 PageFactory.initElements(driver, this);
	} 
	
	public void SingleIframeInput() {
		ClickSingleIfrmeButton.click();	
	}
	
	public void switchto (WebDriver driver) {
		 driver.switchTo().frame(SingleIframe);	
	}
	
	public void inputkeys(String A) {
		InputFild.sendKeys(A);
	}
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
	/*	WebDriver driver = GnEmpliment.openbrowser("https://vctcpune.com/");
		
		WebElement pracpage = driver.findElement(By.xpath("//a[text()='Start Selenium Practice']"));
		pracpage.click();
		
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> a =handle.iterator();
		
		while(a.hasNext()) 
		{
			String unique = a.next();
			driver.switchTo().window(unique);
			String CurrentTitle = driver.getTitle();
			if(CurrentTitle.equals("Practice Page"))
			{
				WebElement option = driver.findElement(By.xpath("//input[@value='option3']"));
				option.click();
			}
		}
		
		WebElement ifram = driver.findElement(By.xpath("//iframe[@style=' width: 100%; height: 600px']"));
	
		driver.switchTo().frame(ifram);
		
		WebElement ddd = driver.findElement(By.xpath("//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-1163']"));
		ddd.click();
	*/	
		
		
		
		
	}


}
