package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPageObjects;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageStepDefinition {
public WebDriver driver;
public String landingPageProduct;
TestContextSetup testContextSetup;
LandingPageObjects landingPageObjects;

//public LandingPageStepDefinition(TestContextSetup testContextSetup) 
//{
//	this.testContextSetup = testContextSetup;
//	this.landingPageObjects = testContextSetup.pageObjectsManager.getLandingPage();
//}

public LandingPageStepDefinition(TestContextSetup testContextSetup) 
{
	this.testContextSetup = testContextSetup;
	this.landingPageObjects = testContextSetup.pageObjectsManager.getLandingPage();
	
}

	@Given("User is on the Greenkart Landing Page")
	public void user_is_on_the_greenkart_landing_page() {
		Assert.assertTrue(landingPageObjects.getTitleOfLandingPage().contains("GreenKart"));
		
	}
	
	@When("^User searched with short name (.+) and extracted actual name of the product$")
	public void user_searched_with_short_name_and_extracted_actual_name_of_the_product(String shortName) throws InterruptedException {
		
		//LandingPageObjects landingPageObjects = testContextSetup.pageObjectsManager.getLandingPage();
		landingPageObjects.searchItem(shortName);
		Thread.sleep(2000);
		testContextSetup.landingPageProduct = landingPageObjects.getProductName().split("-")[0].trim();
		System.out.println(testContextSetup.landingPageProduct + " is extracted from Home Page");
	}
	
	@When("Added {string} items of the selected product to cart")
	public void added_items_of_the_selected_product_to_cart(String quantity) {
		landingPageObjects.incrementItem(Integer.parseInt(quantity));
		landingPageObjects.addToCart();
	}



}
