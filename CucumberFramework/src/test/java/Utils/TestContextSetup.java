package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectsManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public String landingPageProduct;
	public PageObjectsManager pageObjectsManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TestContextSetup() throws IOException 
	{
		testBase = new TestBase();
		pageObjectsManager = new PageObjectsManager(testBase.WebDriverManager());
		genericUtils = new GenericUtils(testBase.WebDriverManager());
		
	}

}
