package StepDefinations;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StepDefination05 {
Response response;
	
	@Given("Providing Incomplete URI")
	public void providing_incomplete_uri() {
		
		RestAssured.baseURI = "https://reqres.in";
	
		System.out.println("Given Ended");
	}

	@When("Giving EndPoint")
	public void giving_end_point() {
		System.out.println("When Started");
		response = RestAssured.get("/ai/unknown");
		System.out.println("Given Started By giving wrong url");
		System.out.println("When Ended");
	    
	}
	
	@Then("Validating Two Responses")
	public void validating_two_responses() {
		System.out.println("Then Started");
		Assert.assertEquals(response.getStatusCode(),404);
		System.out.println("Then Ended");
		System.out.println(response.getStatusCode());
	  
	}

}
