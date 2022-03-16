package stepDefinitions;


import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {
	
	 @Given("^Validate the browser$")
	    public void validate_the_browser() throws Throwable {
		 System.out.println("browser validated");
	        
	    }

	    @When("^Broser is triggered$")
	    public void broser_is_triggered() throws Throwable {
	    	System.out.println("Browser triggered");
	        
	    }

	    @Then("^Check if browser is started$")
	    public void check_if_browser_is_started() throws Throwable {
	    	System.out.println("checked broser");
	        
	    }


		@Given("^User is on Netbanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
		 //
			  System.out.println("Navigate to login url");
	        
	    }

		@When("^User Login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_username_something_and_password_something(String arg1, String arg2) throws Throwable {
			System.out.println(arg1);
			System.out.println(arg2);
	    }


	    @Then("^Homepage is populated$")
	    public void homepage_is_populated() throws Throwable {
	    	System.out.println("Validated Homepage");
	        
	    }
	   

	    @When("^User sign up with following details$")
	    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
	       List<List<String>> obj = data.asLists(); 
	       System.out.println(obj.get(0).get(0));
	       System.out.println(obj.get(0).get(1));
	       System.out.println(obj.get(0).get(2));
	       System.out.println(obj.get(0).get(3));
	       System.out.println(obj.get(0).get(4));
	       
	    }
	    

	    @When("^User Log in into application with username (.+) and password (.+)$")
	    public void user_log_in_into_application_with_username_and_password(String username, String password) throws Throwable {
	    	System.out.println(username);
	    	System.out.println(password);
	        
	    }


	    @And("^Cards displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are_something(String strArg1) throws Throwable {
	    	System.out.println("Validated Cards");
	    	System.out.println(strArg1);
	        
	    }


	}
	





