package StepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StepDefination04 {
	Response response;



	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {



	RestAssured.baseURI="https://reqres.in";
	}



	@When("posted with incorrect Info")
	public void posted_with_incorrect_info() {



	response= RestAssured.get("/api/users/23");
	Response response =
	RestAssured.given().log().all()
	.header("Content-Type", "application/json")
	.when().get("https://reqres.in/api/users/23")
	.then().log().all().statusCode(404).extract().response();



	}



	@Then("validate the negative response code received")
	public void validate_the_negative_response_code_received() {



	System.out.println(response.getStatusLine());
	Assert.assertEquals(404,response.getStatusCode());
	}
	//public static void main(String args[]) {



	// Assert.assertEquals(404,response.getStatusCode());
	// System.out.println("Status code is "+ response.getStatusCode());
	//}

}
