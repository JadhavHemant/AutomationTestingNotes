package Steps;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EmployeesStepAPIs {
	RequestSpecification httpRequest;
	String postRequestBody;
	Response response;
	String d;
	String id;
	String putRequestBody;
	String PatchRequestBody;

	@Given("user configure Base URI")
	public void user_configure_base_uri() {
		RestAssured.baseURI = "http://localhost:3000/";

	}

	@Given("user get the Request Specification object")
	public void user_get_the_request_specification_object() {
		httpRequest = RestAssured.given();
	}

	@Given("user add content type request header")
	public void user_add_content_type_request_header() {
		httpRequest.header("Content-Type", "application/json");
	}

	@Given("user create request body for post request")
	public void user_create_request_body_for_post_request() {
		JSONObject json = new JSONObject();
		json.put("firstName", "Shrikant");
		json.put("lastName", "Kore");
		json.put("address", "Pune");
		json.put("mobileNumber", 9099999);
		json.put("gender", "male");

		postRequestBody = json.toString();

	}

	@Given("user add request body to http post request")
	public void user_add_request_body_to_http_post_request() {
		httpRequest.body(postRequestBody);
	}

	@When("user select the HTTP Post Request")
	public void user_select_the_http_post_request() {
		response = httpRequest.post("employees");

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
		d = response.body().asString();
		System.out.println(d);
	}

	@Then("user capture response headers")
	public void user_capture_response_headers() {

		Headers allHeader = response.headers();

	}

	@Then("user capture id from response body")
	public void user_capture_id_from_response_body() {
		JsonPath jsonPath = new JsonPath(d);
		id = jsonPath.getString("id");
		System.out.println(id);
	}

	@When("user select the HTTP GET Request")
	public void user_select_the_http_get_request() {
		response = httpRequest.get("employees/" + id);

	}

	@Given("user create request body for put request")
	public void user_create_request_body_for_put_request() {

		JSONObject json = new JSONObject();
		json.put("firstName", "Prasad");
		json.put("lastName", "Sathe");
		json.put("address", "Mumbai");
		json.put("mobileNumber", 222222);
		json.put("gender", "male");

		putRequestBody = json.toString();

	}

	@Given("user add request body to http put request")
	public void user_add_request_body_to_http_put_request() {
		httpRequest.body(putRequestBody);

	}

	@When("user select the HTTP put Request")
	public void user_select_the_http_put_request() {
		response = httpRequest.put("employees/" + id);
	}

	@Given("user create request body for patch request")
	public void user_create_request_body_for_patch_request() {
		JSONObject json = new JSONObject();
		json.put("firstName", "Abhijit");

		PatchRequestBody = json.toString();

	}

	@Given("user add request body to http patch request")
	public void user_add_request_body_to_http_patch_request() {
		httpRequest.body(PatchRequestBody);

	}

	@When("user select the HTTP patch Request")
	public void user_select_the_http_patch_request() {

		response = httpRequest.patch("employees/" + id);

	}

	@When("user select the HTTP Delete Request")
	public void user_select_the_http_delete_request() {

		response = httpRequest.delete("employees/" + id);
	}

}
