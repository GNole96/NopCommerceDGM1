package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver; // interface of incomplete method
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver; // implements class of selenium interface.
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver.Navigation;
public class Browser {
	
	public static void main(String[] args) throws InterruptedException {
		

/*	WebDriver driver = new EdgeDriver(); 
 * System.setProperty("webdriver.edge.driver", "D:\\apps\\Selenium\\msedgedriver.exe");
		 
	
		driver.get("https://www.google.co.in/");
		
		
			
		WebDriver driver = new EdgeDriver();  
	
		driver.get("https://www.facebook.com/login/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	 	// driver.quit(); 
	 	
		Options option = driver.manage();
		Window window = option.window();
		
		window.minimize();
		window.maximize();
		
		driver.manage().window().minimize();
		
	 	Dimension D = new Dimension(1000,400);
	 	driver.manage().window().setSize(D);
	 	Thread.sleep(2000);
	 	
	 	Point p = new Point(500,200);
	 	driver.manage().window().setPosition(p);
	 	Thread.sleep(2000);
	 
	 	driver.manage().window().fullscreen();
	 	Thread.sleep(2000);
	 	
	 	WebElement email = driver.findElement(By.name("email"));
	 	email.sendKeys("gaunole@gmail.com");	
	 	
	 	WebElement pass = driver.findElement(By.id("pass"));
	 	pass.sendKeys("9657538852");
	 	
	 	WebElement click = driver.findElement(By.tagName("button"));
	 	click.click(); 
	 	
	 	WebElement emailbyCSS = driver.findElement(By.cssSelector("input[id='email']"));
	 	emailbyCSS.sendKeys("GauravNole");
	 	WebElement passByCSS = driver.findElement(By.cssSelector("input[name='pass']"));
	 	passByCSS.sendKeys("123456789");
	 	Thread.sleep(2000);
	 	WebElement showpass = driver.findElement(By.className("_97w4"));
	 	showpass.click();
	 	Thread.sleep(2000);
	 	
	 	WebElement clickk = driver.findElement(By.linkText("Sign up for Facebook"));
        clickk.click();
	 	WebElement clickByText = driver.findElement(By.partialLinkText("account?"));
	 	clickByText.click();
	 */

///////////////////////////////////////////////////////////////////////////////////
	 	

        WebDriver driver = GnEmpliment.openbrowser("https://vctcpune.com/selenium/practice.html");
        
	/* 	WebElement input = driver.findElement(By.xpath("(//a[@href='https://vctcpune.com/courses/'])[1]"));
	 	input.click();
	 	
     	WebElement pass = driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
 	    pass.click();	
	    
	    WebElement signup = driver.findElement(By.xpath("//a[contains(@href,'/r.php?')]"));
	    signup.click();
	    
	 	
	 //    	Absolute X-Path  //
	 	
    	WebElement aboutus = driver.findElement(By.xpath("(/html//header//ul//li[2]//a)[1]"));
	 	
	 	aboutus.click();
	 	
        
	 	WebElement statrsel = driver.findElement(By.xpath("/html/body/div/div//header/div/div/nav/ul/li[4]/a[2]"));
	 	
	 	statrsel.click();
	 	*/
	////////////////////////////////////////////////////////////////
       // Web Element Methods to perform actions on Webpage //   
        
        
  /*   WebElement radio1 = driver.findElement(By.xpath("(//body/section//input)[1]"));
     radio1.click();
     boolean z =  radio1.isSelected();
     System.out.println(z+"  Bcoz selected"); 
    
     WebElement radio2 = driver.findElement(By.xpath("//input[@value='Radio2']"));
    // radio2.click();
     Thread.sleep(2000);
     boolean a =radio2.isSelected();
     System.out.println(a+"  Bcoz its not selected");
     Thread.sleep(2000);
     boolean h =radio2.isEnabled();
     System.out.println(h + " Bcause its not enable");
     Thread.sleep(2000);
//     boolean g =radio2.isEnabled();
//     System.out.println(g + "Bcos its enable");
     
  /*   WebElement check1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
     check1.click();
     boolean s =  check1.isSelected();
     System.out.println(s +"  Bcoz selected");
	 
     WebElement hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
     hide.click();
     Thread.sleep(2000);
     
     WebElement show = driver.findElement(By.xpath("(//input[@class='btn-style class2'])[2]"));
     show.click();
     
     WebElement ipText = driver.findElement(By.xpath("//input[@id='displayed-text']"));
     boolean ip =ipText.isDisplayed();
     System.out.println(ip +" bcos text box is showing");
     
        
     WebElement enhome = driver.findElement(By.xpath("(//a[@aria-current='page'])[1]"));
     enhome.click();
     boolean j =enhome.isEnabled();
     System.out.println(j);
     */
     WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
     
     Select a = new Select(dropdown);
      //  a.selectByIndex(1);   // select by index start with 0
     a.selectByValue("option2");  // select by @value
   //  a.selectByVisibleText("Option3");   // select by visible Text
     
     
     
	}
	}
	 	
	
 

