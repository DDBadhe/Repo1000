package StepDefinitions;



import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RateAPI_2_1 {
	
	Response response = null;
	String uri="https://api.ratesapi.io";

	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
		
		RestAssured.baseURI=uri;
	    throw new io.cucumber.java.PendingException();
	}
	
	

	@When("posted with correct information")
	public void posted_with_correct_information() {
		  response = RestAssured.get("/api/latest");
	    throw new io.cucumber.java.PendingException();
	}

	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
		Assert.assertEquals(200,response.getStatusCode());
	    throw new io.cucumber.java.PendingException();
	}
}
