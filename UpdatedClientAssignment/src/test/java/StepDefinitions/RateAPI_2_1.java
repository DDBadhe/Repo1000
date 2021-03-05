package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class RateAPI_2_1 {
	
	Response response = null;

	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
		System.out.println("navigating to api");
		response = RestAssured.get("https://ratesapi.io/documentation");
	    throw new io.cucumber.java.PendingException();
	}
	
	

	@When("posted with correct information")
	public void posted_with_correct_information() {
		  
	    throw new io.cucumber.java.PendingException();
	}

	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
		Assert.assertEquals(200,response.getStatusCode());
	    throw new io.cucumber.java.PendingException();
	}
}
