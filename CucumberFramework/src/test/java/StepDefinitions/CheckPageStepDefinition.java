package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.CheckoutPageObjects;
import PageObjects.LandingPageObjects;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckPageStepDefinition {
public WebDriver driver;
public String landingPageProduct;
public CheckoutPageObjects checkoutPage;
TestContextSetup testContextSetup;

//public CheckPageStepDefinition(TestContextSetup testContextSetup) 
//{
//	this.testContextSetup = testContextSetup;
//	this.checkoutPage = testContextSetup.pageObjectsManager.getCheckoutPage();
//}

public CheckPageStepDefinition(TestContextSetup testContextSetup) 
{
	this.testContextSetup = testContextSetup;
	this.checkoutPage = testContextSetup.pageObjectsManager.getCheckoutPage();

}

	
@Then("Verify user has the ability to enter promo code and place the order")
public void verify_user_has_the_ability_to_enter_promo_code_and_place_the_order() {
	
	
	Assert.assertTrue(checkoutPage.verifyPromoButton());
	Assert.assertTrue(checkoutPage.placeOrder());

}

@Then("^User proceeds to checkout page and validate the (.+) items in checkout page$")
public void user_proceeds_to_checkout_page_and_validate_the_items_in_checkout_page(String name) throws InterruptedException {
	checkoutPage.checkoutItems();
	
}



}
