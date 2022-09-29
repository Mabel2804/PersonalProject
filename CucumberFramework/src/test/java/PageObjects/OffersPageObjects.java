package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPageObjects {
	WebDriver driver;
	
	public OffersPageObjects(WebDriver driver) {
		this.driver = driver;
	}


	By search = By.xpath("//input[@type='search']");
	By productName = By.xpath("//tbody/tr/td[1]");
	
	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	

}
