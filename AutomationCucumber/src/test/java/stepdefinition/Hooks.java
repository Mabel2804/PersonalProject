package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void beforeValidation() {
		System.out.println("Mobile Test");
	}
	
	@After("@MobileTest")
	public void afterValidation() {
		System.out.println("After Mobile Test");
	}
	

}
