package Steps;

import java.io.FileReader;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.Customer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CustomerStepAPIs {
	RequestSpecification httpRequest;
	String RequestBody;
	Response response;
	String respBody;
	static String cusotmerid;

	@Given("user configure BaseURI in RestAssured")
	public void user_configure_base_uri_in_rest_assured() {
		RestAssured.baseURI = "http://localhost:4000/";
	}

	@Given("user get the RequestSpecification interface object")
	public void user_get_the_request_specification_interface_object() {
		httpRequest = RestAssured.given();

	}

	@Given("user add request header")
	public void user_add_request_header() {
		httpRequest.contentType(ContentType.JSON);
	}

	@Given("user create request body using json node as {string}")
	public void user_create_request_body_using_json_node_as(String JsonNodeName) throws Exception {

		ObjectMapper mapper = new ObjectMapper();

		FileReader file = new FileReader(
				System.getProperty("user.dir") + "//src//test//resources//customerTestData.json");

		JsonNode jsonNode = mapper.readTree(file);

		Customer emp = mapper.treeToValue(jsonNode.get(JsonNodeName), Customer.class);

		RequestBody = mapper.writeValueAsString(emp);

	}

	@Given("user add request body to HTTP request")
	public void user_add_request_body_to_http_request() {
		httpRequest.body(RequestBody);
	}

	@When("user select HTTP POST Request")
	public void user_select_http_post_request() {
		response = httpRequest.post("customers");

	}

	@Then("user capture status code")
	public void user_capture_status_code() {
		System.out.println(response.statusCode());
	}

	@Then("user capture status line")
	public void user_capture_status_line() {
		System.out.println(response.statusLine());
	}

	@Then("user capture response time")
	public void user_capture_response_time() {
		System.out.println(response.time());
	}

	@Then("user capture response body")
	public void user_capture_response_body() {
		respBody = response.body().asString();
		System.out.println(respBody);
	}

	@Then("user capture response headers")
	public void user_capture_response_headers() {

	}

	@Then("user capture id from response body")
	public void user_capture_id_from_response_body() {
		cusotmerid = new JsonPath(respBody).getString("id");
	}

	@When("user select HTTP PUT Request")
	public void user_select_http_put_request() {
		response = httpRequest.put("customers/" + cusotmerid);
	}

	@When("user select HTTP PATCH Request")
	public void user_select_http_patch_request() {
		response = httpRequest.patch("customers/" + cusotmerid);

	}

	@When("user select HTTP GET Request")
	public void user_select_http_get_request() {
		response = httpRequest.get("customers/" + cusotmerid);
	}

	@When("user select HTTP delete Request")
	public void user_select_http_delete_request() {
		response = httpRequest.delete("customers/" + cusotmerid);
	}

}
