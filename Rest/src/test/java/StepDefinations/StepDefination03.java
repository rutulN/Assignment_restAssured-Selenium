package StepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDefination03 {
	Response response;
	RequestSpecification httpRequest;
	@Given("URI")
	public void uri() {
		System.out.println("Given Started");
		RestAssured.baseURI = "https://reqres.in";
		
		System.out.println("Given Ended");
	    
	}

	@When("Giving EndPoints")
	public void giving_end_points() {
		System.out.println("When Started");
		response = RestAssured.get("/api/users/2");
		System.out.println("When Ended");
	 
	}

	@Then("Validating Two Response")
	public void validating_two_response() {
		
		System.out.println("Then Started");
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.getContentType(),"application/json; charset=utf-8");
	
		
		System.out.println("Then Ended");

	}

}
