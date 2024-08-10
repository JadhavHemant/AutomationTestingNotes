package StepAPIs;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.Customer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CustomerStepAPI {

	RequestSpecification httpRequest;
	String requestBody;
	Response response;
	String responseBody;
	static String customerId;

	@Given("user configure BaseURI in Rest Assured")
	public void user_configure_base_uri_in_rest_assured() {
		RestAssured.baseURI = "http://localhost:4000/";
	}

	@Given("user get the RequestSpecification interface object")
	public void user_get_the_request_specification_interface_object() {
		httpRequest = RestAssured.given();

	}

	@Given("user add request ContentType header")
	public void user_add_request_content_type_header() {
		httpRequest.contentType(ContentType.JSON);
	}

	@Given("user create request body using jsonNode name as {string}")
	public void user_create_request_body_using_json_node_name_as(String jsonNodeName) throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		File file = new File(System.getProperty("user.dir") + "//src//test//resources//customerTestData.json");

		JsonNode jsonNode = mapper.readTree(file);

		Customer customer = mapper.treeToValue(jsonNode.get(jsonNodeName), Customer.class);

		requestBody = mapper.writeValueAsString(customer);

	}

	@Given("user add request body to HTTP Request")
	public void user_add_request_body_to_http_request() {
		httpRequest.body(requestBody);
	}

	@When("user select HTTP POST Request")
	public void user_select_http_post_request() {
		response = httpRequest.post("customers");
	}

	@Then("user capture status code")
	public void user_capture_status_code() {
		int code = response.statusCode();
		System.out.println(code);
	}

	@Then("user capture status line")
	public void user_capture_status_line() {
		String line = response.statusLine();
		System.out.println(line);
	}

	@Then("user capture response time")
	public void user_capture_response_time() {
		long time = response.time();
		System.out.println(time);

	}

	@Then("user capture response body")
	public void user_capture_response_body() {
		responseBody = response.body().asString();
		System.out.println(responseBody);
	}

	@Then("user capture response headers")
	public void user_capture_response_headers() {
		Headers allHeader = response.headers();

	}

	@Then("user capture customer id from response body")
	public void user_capture_customer_id_from_response_body() {

		JsonPath jsonPath = new JsonPath(responseBody);
		customerId = jsonPath.getString("id");

		System.out.println(customerId);

	}

	@When("user select HTTP PUT Request")
	public void user_select_http_put_request() {

		response = httpRequest.put("customers/" + customerId);

	}

	@When("user select HTTP PATCH Request")
	public void user_select_http_patch_request() {

		response = httpRequest.patch("customers/" + customerId);

	}

	@When("user select HTTP GET Request")
	public void user_select_http_get_request() {

		response = httpRequest.get("customers/" + customerId);

	}

	@When("user select HTTP DELETE Request")
	public void user_select_http_delete_request() {

		response = httpRequest.delete("customers/" + customerId);

	}

}
