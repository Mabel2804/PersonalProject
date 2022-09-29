package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	public void switchWindowToChild() {
	    Set<String> s1 = driver.getWindowHandles(); // handles the new window that is opened and stores the window ids in set collection
	    Iterator<String> i1 = s1.iterator(); // iterates over both parent and child windows
	    String parentWindow = i1.next(); // parent window
	    String childWindow = i1.next(); // again next will move to child window
	    driver.switchTo().window(childWindow); // entering childwindow handle id to driver to switch to the other tab
	}

}
