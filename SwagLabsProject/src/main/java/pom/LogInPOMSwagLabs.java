package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPOMSwagLabs {
	
	@FindBy (xpath = "//input[@id='user-name']")private WebElement IpUsername;
	@FindBy (xpath = "//input[@id='password']")private WebElement IpPassword;
	@FindBy (xpath = "//input[@id='login-button']")private WebElement LogInButton;

public LogInPOMSwagLabs(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}	

public void EnterUsername(String username) {
	IpUsername.sendKeys(username);
	
}

public void EnterPassword(String password) {
	IpPassword.sendKeys(password);	
}

public void ClickOnLogInButton() {
	LogInButton.click();
}

}
