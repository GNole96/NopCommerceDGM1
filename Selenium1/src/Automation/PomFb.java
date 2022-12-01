package Automation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PomFb {
	
	@FindBy (xpath = "//input[@class='inputtext _55r1 _6luy']")private WebElement InputId;
	@FindBy (xpath = "//input[@name='pass']")private WebElement InputPass;
	@FindBy (xpath = "//button[@value='1']")private WebElement ClickSubmit;
	@FindBy (xpath = "//a[@rel='async']")private WebElement CreatAcc;
	@FindBy (xpath = "//input[contains(@name,'firstname')]")private WebElement IpFirstname;
	@FindBy (xpath = "//input[contains(@name,'lastname')]")private WebElement IpLastname;
	@FindBy (xpath = "//input[contains(@name,'reg_email__')]")private WebElement IpEmail;
	@FindBy (xpath = "//input[contains(@name,'reg_passwd__')]")private WebElement IpPass;
	@FindBy (xpath = "//select[contains(@id,'day')]")private WebElement SelectDate;
	@FindBy (xpath = "//select[contains(@id,'month')]")private WebElement SelectMonth;
	@FindBy (xpath = "//select[contains(@id,'year')]")private WebElement SelectYear;
	@FindBy (xpath = "//label[text()='Male']")private WebElement GenderMaleTick;
	@FindBy (xpath = "//label[text()='Female']")private WebElement GenderFemaleTick;
	@FindBy (xpath = "//button[contains(@name,'websubmit')]")private WebElement SignInButton;

	public PomFb(WebDriver driver) {
		PageFactory.initElements(driver,this);
}	

	public void IpID(String A) {
		InputId.sendKeys(A);
	}
	
	public void Sshot(String a) throws IOException {
        TakesScreenshot driver = new EdgeDriver();  
        File source =driver.getScreenshotAs(OutputType.FILE);
		File Destination = new File ("C:\\Users\\SAICOM\\Desktop\\Testing\\JavaPDF\\"+ a +".png");
		FileHandler.copy(source, Destination);	
	}
	
	public void Terminate(WebDriver driver) {
		driver.close();
	}

	
	public void IpPass(String B) {
		InputPass.sendKeys(B);
	}
	
	
	public void ClickOnLogin() {
		ClickSubmit.click();
	}
	

	public void CreatACC() {
		CreatAcc.click();
	}
	

	public void EnterFirstName(String FN , WebDriver driver) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofMillis(5000));
		wait.until(ExpectedConditions.visibilityOf(IpFirstname));
		IpFirstname.sendKeys(FN);  // by-default check time is 500ml sec.
	}
	

	public void EnterLastName(String LN) {
		IpLastname.sendKeys(LN);
	}
	

	public void EnterEmailForSingUp(WebDriver driver , String EMail) {
		Actions A= new Actions(driver);
		IpEmail.sendKeys(EMail);
		A.sendKeys(Keys.TAB);
		A.sendKeys(EMail);
		A.build().perform();
	}

	public void EnterPassForSingUp(String Pass) {
		IpPass.sendKeys(Pass);
	}
	

	public void selectDate(int D) throws InterruptedException {
		SelectDate.click();
		Select A = new Select(SelectDate);
		A.selectByIndex(D-1);
	}

	public void selectMont(int M , WebDriver driver) throws InterruptedException	{
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(3000));
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(SelectMonth));
		SelectMonth.click();
		Select B = new Select(SelectMonth);
		B.selectByIndex(M-1);
	}
	
	public void selectYear( String Y) {
		SelectYear.click();
		Select C = new Select(SelectYear);
		C.selectByValue(Y);
		
	}
	
	public void selectGender(String G) {
		if(G=="Male") {
			GenderMaleTick.click();
		}else if(G=="Female"){
			GenderFemaleTick.click();
		}else {
			System.out.println("Select Custom");
		}
	}
	
	
	public void SignUpclick() {
		SignInButton.click();
	}
	
}







