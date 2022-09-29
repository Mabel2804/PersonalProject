package stepdefinition;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {
	

    @Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
    	System.out.println("Validating the browser");
        
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Browser chome");
        
    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	System.out.println("Browser opens");
        
    }
	

    @Given("^User is at landing page$")
    public void user_is_at_landing_page() throws Throwable {
        // user is at landing page
    	System.out.println("Navigated to landing page");
    }


    @When("^User logs in into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logs_in_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        
    	System.out.println("Enter credentials");
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }
    
    @When("^User Signs up with following details$")
    public void user_signs_up_with_following_details(DataTable data) throws Throwable {    	
    	List<List<String>> obj = data.asLists(String.class);
    	System.out.println(obj.get(0));
    	System.out.println(obj.get(0).get(1));
        
    }
    
    @When("^User logs in into the application with (.+) and password (.+)$")
    public void user_logs_in_into_application_with_and_password(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }


    @Then("^Home page appears$")
    public void home_page_appears() throws Throwable {
        // home page appears
    	System.out.println("home page validated");
    }


    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }
}
