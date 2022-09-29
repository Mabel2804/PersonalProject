package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException 
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\Resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		String browser_properties = prop.getProperty("browser");
		String browser_maven = System.getProperty("browser");
		
		//java ternary operator
		//result = testCondition ? 	value1 : value2
		
		String browser = browser_maven !=null ? browser_maven : browser_properties;
		
		
		
		if(driver == null) 
		{
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\Resources\\chromedriver.exe");
				driver = new ChromeDriver();		
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			if(browser.equalsIgnoreCase("firefox")) {
				//firefox code		
			}

		driver.get(url);
		}
		return driver;
		
	}

}
