package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectsManager {
	
	public LandingPageObjects landingPage;
	public OffersPageObjects offersPage;
	public CheckoutPageObjects checkoutPage;
	public WebDriver driver;
	
	public PageObjectsManager(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	public LandingPageObjects getLandingPage() {
		
		landingPage = new LandingPageObjects(driver);
		return landingPage;
		
	}
	
	public OffersPageObjects getOffersPage() {
		offersPage = new OffersPageObjects(driver);
		return offersPage;
	}
	
	public CheckoutPageObjects getCheckoutPage() {
		checkoutPage = new CheckoutPageObjects(driver);
		return checkoutPage; 
	}
	}


