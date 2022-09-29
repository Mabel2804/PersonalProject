package StepDefinitions;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.LandingPageObjects;
import PageObjects.OffersPageObjects;
import PageObjects.PageObjectsManager;
import Utils.TestContextSetup;
import io.cucumber.java.en.Then;

public class OfferPageStepDefinition {
public WebDriver driver;
public String offerPageProduct;
TestContextSetup testContextSetup;
PageObjectsManager pageObjectsManager;

public OfferPageStepDefinition(TestContextSetup testContextSetup) 
{
	this.testContextSetup = testContextSetup;
	
}

	@Then("^User searched for (.+) short name in Offers page to check if product exists$")
	public void user_searched_for_the_same_short_name_in_offers_page_to_check_if_product_exists(String shortName) throws InterruptedException 
	{
		
		switchToOffersPage();
		OffersPageObjects offersPageObjects = testContextSetup.pageObjectsManager.getOffersPage();
		offersPageObjects.searchItem(shortName);
	    Thread.sleep(2000);
	    offerPageProduct = offersPageObjects.getProductName();
	    
	}
	
	public void switchToOffersPage() 
	{
		LandingPageObjects landingPageObjects = testContextSetup.pageObjectsManager.getLandingPage();
		landingPageObjects.selectTopDealsPage();
		testContextSetup.genericUtils.switchWindowToChild();

	}
	
	@Then("Validate if Product Name on Landing Page and Offers Page are same")
	public void validate_if_product_name_on_landing_page_and_offers_page_is_same() 
	{
	    Assert.assertEquals(offerPageProduct, testContextSetup.landingPageProduct);
	}

}
