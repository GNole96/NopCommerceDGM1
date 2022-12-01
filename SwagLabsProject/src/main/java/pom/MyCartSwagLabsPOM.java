package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCartSwagLabsPOM {

	
	@FindBy (xpath = "//button[text()='Remove']")private List<WebElement> RemoveButton;
	@FindBy (xpath = "//div[text()='Sauce Labs Backpack']")private WebElement AddedProductBagName;
	@FindBy (xpath = "//div[text()='Sauce Labs Bike Light']")private WebElement AddedProductBikeLightName;
	@FindBy (xpath ="//button[@id='continue-shopping']")private WebElement ContinueShoppingButton;
	@FindBy (xpath ="//button[@id='checkout']")private WebElement CheckoutButton;
	

	public MyCartSwagLabsPOM(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void ClickOnAddedBagRemoveButton(int Index) {
		
		RemoveButton.get(Index).click();
	}
	
	public void ClickOnAddedProductBagName() {
		
		AddedProductBagName.click();
	}
	
	public void ClickOnAddedProductBikeLightName() {
		
		AddedProductBikeLightName.click();
	}
	
	public void ClickOnContinueShoppingButton() {
		
		ContinueShoppingButton.click();
	}

	public void ClickOnCheckoutButton() {
		
		CheckoutButton.click();
	}
	
	public void removeMultipleProductFromCart() {
		
		for(int i = RemoveButton.size()-1;i>=0;i--) 
		{
			RemoveButton.get(i).click();
		}
		
	}
	
	public int getNumberOfRemoveButton() {
		
		return RemoveButton.size();
	}
	
	
	
	
}
