package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutSwagLabsPOM {

	@FindBy (xpath = "//input[@id='first-name']")private WebElement FirstName;
	@FindBy (xpath = "//input[@id='last-name']")private WebElement LastName;
	@FindBy (xpath = "//input[@id='postal-code']")private WebElement PostalCode;
	@FindBy (xpath = "//button[@id='cancel']")private WebElement CancelButton;
	@FindBy (xpath = "//input[@id='continue']")private WebElement ContinueButton;
	
	
	public CheckOutSwagLabsPOM (WebDriver driver) {
		
		PageFactory.initElements(driver, this );
	}
	
	public void InputFirstName(String firstname) {
		
		FirstName.sendKeys(firstname);
	}
	
	public void InputLastName(String lastname) {
		
		LastName.sendKeys(lastname);
	}
	
	public void InputPostalCode(String postalcode) {
		
		PostalCode.sendKeys(postalcode);
	}
	
	public void ClickOnCancelButton() {
		
		CancelButton.click();
	}
	
	public void clickOnContinueButton() {
		
		ContinueButton.click();
	}
	
	
	
	
}
