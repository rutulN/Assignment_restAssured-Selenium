package StepDefinations;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDefination07 {
	Response response;
	RequestSpecification httpRequest;
	
	@Given("Providing URI")
	public void providing_uri() {
		System.out.println("Providing URI");
		RestAssured.baseURI = "https://reqres.in";
	System.out.println("Given Ended");
	}

	@When("Entering email and No Password")
	public void entering_email_and_no_password() {
		System.out.println("When email provided");
		JSONObject j = new JSONObject();
		j.put("email","sydney@fife");
		
		httpRequest = given().
				header("content-type","application/json").
				body(j.toJSONString());
		response = httpRequest.post("/api/register");
		System.out.println("When Ended");
	
	}

	@Then("Validating  Response")
	public void validating_response() {
		System.out.println("Then validating status code");
		Assert.assertEquals(response.getStatusCode(),400);
		System.out.println(response.getStatusCode());
		System.out.println("Then ended");
	  
	}


}
