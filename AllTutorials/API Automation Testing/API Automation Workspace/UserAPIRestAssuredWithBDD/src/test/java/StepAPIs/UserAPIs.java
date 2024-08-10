package StepAPIs;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import Entity.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UserAPIs {

	RequestSpecification httpRequest;
	String requestBody;
	Response response;
	String responseBody;
	static String userId;

	@Given("user get the Request Specification interface Object")
	public void user_get_the_request_specification_interface_object() {
		httpRequest = RestAssured.given();
	}

	@Given("user configure Base URI")
	public void user_configure_base_uri() {
		httpRequest.baseUri("http://localhost:5000/");
	}

	@Given("user add request header as {string} key and {string} value")
	public void user_add_request_header_as_key_and_value(String key, String value) {
		httpRequest.headers(key, value);
	}

	@Given("user create request body using json node as {string}")
	public void user_create_request_body_using_json_node_as(String jsonNodeName) throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		File file = new File(System.getProperty("user.dir") + "//src//test//resources//UserTestData.json");

		JsonNode jsonNode = mapper.readTree(file);

		User user = mapper.treeToValue(jsonNode.get(jsonNodeName), User.class);

		requestBody = mapper.writeValueAsString(user);

	}

	@Given("user add request body to HTTP Request")
	public void user_add_request_body_to_http_request() {
		httpRequest.body(requestBody);
	}

	@When("user select HTTP {string} Request")
	public void user_select_http_request(String RequestType) {

		if (RequestType.equalsIgnoreCase("POST")) {
			response = httpRequest.post("users");
		} 
		else if (RequestType.equalsIgnoreCase("PUT")) {
			response = httpRequest.put("users/" + userId);
		} 
		else if (RequestType.equalsIgnoreCase("PATCH")) {
			response = httpRequest.patch("users/" + userId);
		}
		else if (RequestType.equalsIgnoreCase("GET")) {
			response = httpRequest.get("users/" + userId);
		}
		else if (RequestType.equalsIgnoreCase("DELETE")) {
			response = httpRequest.delete("users/" + userId);
		}
	}

	@Then("user capture status code")
	public void user_capture_status_code() {
		int a = response.statusCode();
		System.out.println(a);
	}

	@Then("user capture status line")
	public void user_capture_status_line() {
		String b = response.statusLine();
		System.out.println(b);
	}

	@Then("user capture response time")
	public void user_capture_response_time() {
		long c = response.time();
		System.out.println(c);
	}

	@Then("user capture response body")
	public void user_capture_response_body() {
		responseBody = response.body().asString();
		System.out.println(responseBody);
	}

	@Then("user capture response header")
	public void user_capture_response_header() {
		Headers allHeader = response.headers();

	}

	@Then("user capture id from Response body")
	public void user_capture_id_from_response_body() {
		JsonPath path = new JsonPath(responseBody);
		userId = path.getString("id");
		System.out.println(userId);

	}

}
