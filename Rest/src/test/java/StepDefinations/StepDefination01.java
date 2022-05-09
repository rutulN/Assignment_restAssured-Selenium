package StepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;


public class StepDefination01 {
	Response response;
	
	
	@Given("URI and Endpoints")
	public void uri_and_endpoints() {
	RestAssured.baseURI = "https://reqres.in/api";
	}

	@When("Providing Endpoints")
	public void providing_endpoints() {
		response = RestAssured.get("/users?page=2");
//		 ResponseBody body = response.getBody();
//	 System.out.println(body.asPrettyString());
		//System.out.println(response.getContentType());
	}

	@Then("Validating the Response Code")
	public void validating_the_response_code() {
		System.out.println(response.getStatusCode());
	Assert.assertEquals(response.getStatusCode(), 200);
	}

}
