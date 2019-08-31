package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	

@Given("^Application is up and running$")
public void application_is_up_and_running() throws Throwable {
    System.out.println("Application is up and running");
}


@When("^i enter valid credentials$")
public void i_enter_valid_credentials() throws Throwable {
  System.out.println("Enter username and password");
}


@Then("^i should be logged in successfuly$")
public void i_should_be_logged_in_successfuly() throws Throwable {
   System.out.println("user should be logged in successfully");
}



}
