package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UserStepAPIs {

	private static RequestSpecification httpRequest;
	private static Response response;

	@Given("user configure Base URI in Rest Assured")
	public void user_configure_base_uri_in_rest_assured() {
		RestAssured.baseURI = "https://reqres.in/api/users/2";
	}

	@Given("user get the Request Specification object")
	public void user_get_the_request_specification_object() {
		httpRequest = RestAssured.given();

	}

	@When("user select HTTP GET Request")
	public void user_select_http_get_request() {
		response = httpRequest.get();
	}

	@Then("user capture status code")
	public void user_capture_status_code() {
		int a1 = response.getStatusCode();
		System.out.println(a1);
	}

	@Then("user capture status line")
	public void user_capture_status_line() {
		String a2 = response.getStatusLine();
		System.out.println(a2);
	}

	@Then("user capture response time")
	public void user_capture_response_time() {
		long a3 = response.getTime();
		System.out.println(a3);
	}

	@Then("user capture response body")
	public void user_capture_response_body() {
		String a4 = response.getBody().asPrettyString();
		System.out.println(a4);
	}

	@Then("user capture response headers")
	public void user_capture_response_headers() {
		Headers allHeader = response.getHeaders();
		for(Header abc: allHeader)
		{
			System.out.println(abc.getName() + " ::   "+abc.getValue());
		}
		
	}
	
	
	@When("user select HTTP DELETE Request")
	public void user_select_http_delete_request() {
		response=httpRequest.delete();
		

		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
