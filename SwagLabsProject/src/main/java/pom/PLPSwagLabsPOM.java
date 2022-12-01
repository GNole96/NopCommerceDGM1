package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PLPSwagLabsPOM {
	
	@FindBy (xpath = "//button[text()='Add to cart']")private List<WebElement> AddToCartButton;
	@FindBy (xpath = "//button[text()='Remove']")private List<WebElement> RemoveButton;
	@FindBy (xpath = "//button[text()='Open Menu']")private WebElement HeaderMenuButton;
	@FindBy (xpath = "//a[@class='shopping_cart_link']")private WebElement HeaderCartlogo;
	@FindBy (xpath = "//select[@class='product_sort_container']")private WebElement HeaderfilterTab ;
	@FindBy (xpath = "//a[@id='inventory_sidebar_link']")private WebElement PopAllElements;
	@FindBy (xpath = "//a[@id='about_sidebar_link']")private WebElement PopAbout;
	@FindBy (xpath = "//a[@id='logout_sidebar_link']")private WebElement PopLogOut;
	@FindBy (xpath = "//a[@id='reset_sidebar_link']")private WebElement PopResetAppState;
	@FindBy (xpath = "//button[@id='react-burger-cross-btn']")private WebElement PopClose;
	@FindBy (xpath = "//a[text()='Twitter']")private WebElement FooterTwitter;
	@FindBy (xpath = "//a[text()='Facebook']")private WebElement FooterFaceBook;
	@FindBy (xpath = "//a[text()='LinkedIn']")private WebElement FooterLinkedIn;
	@FindBy (xpath = "//div[text()='Sauce Labs Backpack']")private WebElement ProductBag;
	@FindBy (xpath = "img[@alt='Sauce Labs Backpack']")private WebElement ProductBagImage;
	@FindBy (xpath = "//img[@alt='Sauce Labs Bike Light']")private WebElement ProductBikeLightImage;
	@FindBy (xpath = "//div[text()='Sauce Labs Bike Light']")private WebElement ProductBikeLight;

	
	public PLPSwagLabsPOM (WebDriver driver) {
		PageFactory.initElements(driver, this );
	}
	
	public void clickOnaddToCart (int product) {
		
		AddToCartButton.get(product).click();
	}
	
	public void clickOnRemoveButton(int product) {
		
		RemoveButton.get(product).click();
	}
	
	public void clickOnMenuListButton() {
		HeaderMenuButton.click();
	}
 
	public void clickOnCartLogo() {
		
		HeaderCartlogo.click();
	}
	
	public void clickOnHeaderfilterTab(String filter) {
		Select select = new Select(HeaderfilterTab);
		select.selectByValue(filter);
	}
	
	public void clickOnAllElements() {
		
		PopAllElements.click();
	}
	
	public void clickOnAbout () {
		PopAbout.click();
	}
	
	public void clickOnLogOut() {
		
		PopLogOut.click();
	}
	
	public void clickOnResetAppState () {

		PopResetAppState.click();	
	}
	
	public void clickOnClose() {
		
		PopClose.click();
	}
	
	public void clickOnFooterTwitter() {
		
		FooterTwitter.click();
	}
	
	public void clickOnFooterFaceook() {
		
		FooterFaceBook.click();
	}
	
	public void clickOnFooterLinkedIn() {
		
		FooterLinkedIn.click();
	}
	
	public void clickOnProductBagName() {
		
		ProductBag.click();
	}
	
	public void clickOnProductBagImage() {
		
		ProductBagImage.click();
	}
	
	public void clickOnProductBikeLightImage() {
		
		ProductBikeLightImage.click();
	}
	
	public void clickOnProductBikeLight() {

		ProductBikeLight.click();
	}
	
	public boolean removeButtonIsDisplay(int product) {
		
		return RemoveButton.get(product).isDisplayed();
	}
	
	public void AddMultipleProductToCart() {
		
		for(int i = AddToCartButton.size()-1;i>=0;i--)
		{
			AddToCartButton.get(i).click();
		}	
		}
	
	public void removeMultipleProductFromCart (){
	
		for(int i =RemoveButton.size()-1;i>=0;i-- ) 
		{
			RemoveButton.get(i).click();	
		}
	}
	
	public int getNumberOfAddToCartButton () {
		return AddToCartButton.size();
	}
	
	public int getNumberOFRemoveButton() {
		return RemoveButton.size();
	}
	
}