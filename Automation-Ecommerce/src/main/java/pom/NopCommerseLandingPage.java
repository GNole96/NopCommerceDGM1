package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NopCommerseLandingPage {
	
	@FindBy (xpath = "//select[@id='customerCurrency']")private WebElement SelectCurrency;
	@FindBy (xpath = "//a[@class='ico-register']")private WebElement Regester;
	@FindBy (xpath = "//a[@class='ico-login']")private WebElement LogIn;
	@FindBy (xpath = "//a[@class='ico-wishlist']")private WebElement WishList;
	@FindBy (xpath = "//a[@class='ico-cart']")private WebElement ShoppingCart;
	@FindBy (xpath = "//input[@id='small-searchterms']")private WebElement SearchStoreTab;
	@FindBy (xpath = "//button[@class='button-1 search-box-button']")private WebElement SearchButton;
	@FindBy (xpath = "//img[@alt='nopCommerce demo store']")private WebElement MainLogo;
	@FindBy (xpath = "(//a[text()='Computers '])[1]")private WebElement ComputersMenu;
	@FindBy (xpath="(//a[@href='/desktops'])[1]")private WebElement Desktop;
	@FindBy (xpath="(//a[@href='/notebooks'])[1]")private WebElement Notebook; 
	@FindBy (xpath="(//a[@href='/Software'])[1]")private WebElement Software;
	@FindBy (xpath="(//a[text()='Electronics '])[1] ")private WebElement ElectronicsMenu;
	@FindBy (xpath="(//a[@href='/camera-photo'])[1]")private WebElement CameraAndPhoto;
	@FindBy (xpath="(//a[@href='/cell-phones'])[1]")private WebElement CellPhones;
	@FindBy (xpath="(//a[@href='/others'])[1]")private WebElement OthersInElectronics;
	@FindBy (xpath="(//a[@href='/apparel'])[1]")private WebElement Apparel;
	@FindBy (xpath="(//a[@href='/shoes'])[1]")private WebElement  Shoes;
	@FindBy (xpath="(//a[@href='/clothing'])[1]")private WebElement Clothing;
	@FindBy (xpath="(//a[@href='/accessories'])[1]")private WebElement Accessories;
	@FindBy (xpath="(//a[@href='/digital-downloads'])[1]")private WebElement DigitalDownloads;
	@FindBy (xpath="(//a[@href='/books'])[1]")private WebElement Books;
	@FindBy (xpath="(//a[@href='/jewelry'])[1]")private WebElement Jewelry;
	@FindBy (xpath="(//a[@href='/gift-cards'])[1]")private WebElement GiftCards;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	@FindBy (xpath="(//a[@href='/electronics'])[3]")private WebElement MiddleElectronics;
	@FindBy (xpath="(//a[@href='/apparel'])[3]")private WebElement   MiddleApparel;
	@FindBy (xpath="(//a[@href='/digital-downloads'])[3]")private WebElement MiddleDigitalDownloads;
	@FindBy (xpath="//a[text()='New online store is open!']")private WebElement NewOnlineStoreOpen;
	@FindBy (xpath="//a[text()='nopCommerce new release!']")private WebElement  NopCommerceNewRelease;
	@FindBy (xpath="//a[text()='About nopCommerce']")private WebElement  AboutNopCommerce;
	@FindBy (xpath="(//a[@href='/new-online-store-is-open'])[2]")private WebElement DetailsButtonNewOnlineStoreOpen;
	@FindBy (xpath="(//a[@href='/nopcommerce-new-release'])[2]")private WebElement  DetailsButtonNopCommerceNewRelease;
	@FindBy (xpath="(//a[@href='/about-nopcommerce'])[2]")private WebElement  DetailsButtonAboutNopCommerce;
	@FindBy (xpath="(//a[@href='/news'])[1]")private WebElement ViewNewsArchive;
	@FindBy (xpath="(//input[@name='pollanswers-1'])[1]")private WebElement FeedbackExcellent;
	@FindBy (xpath="(//input[@name='pollanswers-1'])[2]")private WebElement FeedbackGood;
	@FindBy (xpath="(//input[@name='pollanswers-1'])[3]")private WebElement FeedbackPoor;
	@FindBy (xpath="(//input[@name='pollanswers-1'])[4]")private WebElement FeedbackVeryBad;
	@FindBy (xpath="//button[@id='vote-poll-1']")private WebElement VoteButton;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	@FindBy (xpath="//a[text()='Sitemap']")private WebElement FooterSitemap;
	@FindBy (xpath="//a[text()='Shipping & returns']")private WebElement FooterShippingAndreturns;
	@FindBy (xpath="//a[text()='Privacy notice']")private WebElement FooterPrivacyNotice;
	@FindBy (xpath="//a[text()='Conditions of Use']")private WebElement FooterConditionsOfUse; 
	@FindBy (xpath="//a[text()='About us']")private WebElement FooterAboutUs;
	@FindBy (xpath="//a[text()='Contact us']")private WebElement FooterContactUs;
	@FindBy (xpath="//a[text()='Search']")private WebElement FooterSearch;
	@FindBy (xpath="//a[text()='News']")private WebElement FooterNews;
	@FindBy (xpath="//a[text()='Blog']")private WebElement FooterBlog;
	@FindBy (xpath="//a[text()='Recently viewed products']")private WebElement FooterRecentlyViewedProducts;
	@FindBy (xpath="//a[text()='Compare products list']")private WebElement FooterCompareProductsList;
	@FindBy (xpath="//a[text()='New products']")private WebElement FooterNewProducts;
	@FindBy (xpath="//a[text()='My account']")private WebElement FooterMyAccount;
	@FindBy (xpath="//a[text()='Orders']")private WebElement FooterOrders;
	@FindBy (xpath="//a[text()='Addresses']")private WebElement FooterAddresses;
	@FindBy (xpath="//a[text()='Shopping cart']")private WebElement FooterShoppingCart;
	@FindBy (xpath="//a[text()='Wishlist']")private WebElement FooterWishlist;
	@FindBy (xpath="//a[text()='Apply for vendor account']")private WebElement FooterApplyForVendorAccount;
	@FindBy (xpath="//a[text()='Facebook']")private WebElement FooterFacebook;
	@FindBy (xpath="//a[text()='Twitter']")private WebElement FooterTwitter;
	@FindBy (xpath="//a[text()='RSS']")private WebElement FooterRSS;
	@FindBy (xpath="//a[text()='YouTube']")private WebElement FooterYouTube;
	@FindBy (xpath="//input[@id='newsletter-email']")private WebElement FooterNewsLetterEmail;
	@FindBy (xpath="//button[@id='newsletter-subscribe-button']")private WebElement FooterNewsLetterEmailButton;
	@FindBy (xpath="(//a[@target='_blank'])[4]")private WebElement FooterNopCommerce;
	
	WebDriver driver;
	public NopCommerseLandingPage () {
		PageFactory.initElements(driver, this);
		
	}
	
	public void currencyselect (int index) {
		SelectCurrency.click();
		Select A = new Select(SelectCurrency);
		A.selectByIndex(index);
	}
	
	public void Regester () {
		Regester.click();
	}
	
	public void LogIn () {
		LogIn.click();
	}
	
	public void WishList() {
		WishList.click();
	}
	
	public void ShoppingCart () {
		ShoppingCart.click();
	}
	
	public void SearchStoreTab (String A) {
		SearchStoreTab.sendKeys(A);
	}
	
	public void SearchButton () {
		SearchButton.click();
	}
	
	public void MainLogo () {
		MainLogo.click();
	}
	 
	public void ComputersMenu () {
	Actions act =new Actions(driver);
	act.moveToElement(ComputersMenu);
	act.perform();
	}
	
	public void Desktop () {
		Desktop.click();
	}
	
	public void Notebook () {
		Notebook.click();
	}
	
	public void Software () {
		Software.click();
	}
	
	public void ElectronicsMenu () {
	Actions act =new Actions(driver);
	act.moveToElement(ElectronicsMenu);
	act.perform();
	}
	
	public void SelectCameraAndPhoto () {
		CameraAndPhoto.click();
	}
	
	public void SelectCellPhones () {
		CellPhones.click();
	}
	
	public void SelectOthersInElectronics () {
		OthersInElectronics.click();
	}
	
	public void Apparel () {
		Actions act =new Actions(driver);
		act.moveToElement(Apparel);
		act.perform();
		
	}
	
	public void SelectShoes () {
		Shoes.click();
	}
	
	public void SelectClothing () {
		Clothing.click();
	}
	
	public void SelectAccessories () {
		Accessories.click();
	}
	
	public void DigitalDownloads () {
		DigitalDownloads.click();
	}
	
	public void Books () {
		Books.click();
	}
	
	public void Jewelry () {
		Jewelry.click();
	}
	
	public void GiftCards () {
		GiftCards.click();
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void MiddleElectronics () {
		MiddleElectronics.click();
	}
	
	public void MiddleApparel () {
		MiddleApparel.click();
	}
	
	public void MiddleDigitalDownloads () {
		MiddleDigitalDownloads.click();
	}
	
	public void NewsSectionOnlineStore () {
		NewOnlineStoreOpen.click();
	}
	
	public void NewsSectionNopComNewRelease () {
		NopCommerceNewRelease.click();
	}
	
	public void NewsSectionAboutNopCommerce () {
		AboutNopCommerce.click();
	}
	
	public void DetailsButtonNewOnlineStoreOpen () {
		DetailsButtonNewOnlineStoreOpen.click();
	}
	
	public void DetailsButtonNopCommerceNewRelease () {
		DetailsButtonNopCommerceNewRelease.click();
	}
	
	public void DetailsButtonAboutNopCommerce () {
		DetailsButtonAboutNopCommerce.click();
	}
	
	public void ViewNewsArchive () {
		ViewNewsArchive.click();
	}
	
	public void FeedbackExcellent () {
		FeedbackExcellent.click();
	}
	
	public void FeedbackGood () {
		FeedbackGood.click();
	}
	
	public void FeedbackPoor () {
		FeedbackPoor.click();
	}
	
	public void FeedbackVeryPoor () {
		FeedbackVeryBad.click();
	}
	
	public void FeedbackVoteButton () {
		VoteButton.click();
	}
	
///////////////////////////////////////////////////////////////////////////////////////////
	
	public void FooterSitemap () {
		FooterSitemap.click();
	}
	
	public void PrivacyNotice () {
		FooterPrivacyNotice.click();
	}
	
	public void FooterShippingAndreturns () {
		FooterShippingAndreturns.click();
	}
	
	public void FooterConditionsOfUse () {
		FooterConditionsOfUse.click();
	}
	
	public void FooterAboutUs () {
		FooterAboutUs.click();
	}
	
	public void FooterContactUs () {
		FooterContactUs.click();
	}
	
	public void FooterSearch () {
		FooterSearch.click();
	}
	
	public void FooterNews () {
		FooterNews.click();
	}
	
	public void FooterBlog () {
		FooterBlog.click();
	}
	
	public void FooterRecentlyViewedProducts () {
		FooterRecentlyViewedProducts.click();
	}
	
	public void FooterCompareProductsList () {
		FooterCompareProductsList.click();
	}
	
	public void FooterNewProducts () {
		FooterNewProducts.click();
	}
	
	public void FooterMyAccount () {
		FooterMyAccount.click();
	}
	
	public void FooterOrders () {
		FooterOrders.click();
	}
	
	public void FooterAddresses () {
		FooterAddresses.click();
	}
	
	public void FooterShoppingCart () {
		FooterShoppingCart.click();
	}
	
	public void FooterWishlist () {
		FooterWishlist.click();
	}
	
	public void FooterApplyForVendorAccount () {
		FooterApplyForVendorAccount.click();
	}
	
	public void FooterFacebook () {
		FooterFacebook.click();
	}
	
	public void FooterTwitter () {
		FooterTwitter.click();
	}
	
	public void FooterRSS () {
		FooterRSS.click();
	}
	
	public void FooterYouTube () {
		FooterYouTube.click();
	}
	
	public void FooterNewsLetterEmail (String email) {
		FooterNewsLetterEmail.sendKeys(email);
	}
	
	public void FooterNewsLetterEmailButton () {
		FooterNewsLetterEmailButton.click();
	}
	
	public void FooterNopCommerce () {
		FooterNopCommerce.click();
	}

}
