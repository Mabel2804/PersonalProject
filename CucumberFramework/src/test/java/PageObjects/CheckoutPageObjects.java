package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPageObjects {
	WebDriver driver;
	
	public CheckoutPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	

	
	By cartBag = By.cssSelector("img[alt='Cart']");
	By checkoutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promoButton = By.cssSelector(".promoCode");
	By placeOrderButton = By.xpath("//button[contains(text(),'Place Order')]");
	
	public void checkoutItems() {
		driver.findElement(cartBag).click();
		driver.findElement(checkoutButton).click();
	}
	
	public Boolean verifyPromoButton() {
		return driver.findElement(promoButton).isDisplayed();
		}
	
	public Boolean placeOrder() {
		return driver.findElement(placeOrderButton).isDisplayed();
	}

}
