package Steps;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.Employee;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EmployeeStepApis {
	RequestSpecification httpRequest;

	Response response;

	static String id;

	String respBody;
	String postRequestBody;
	String putRequesBody;
	String patchRequestBody;

	@Given("user configure BaseURI in RestAssured")
	public void user_configure_base_uri_in_rest_assured() {
		RestAssured.baseURI = "http://localhost:3000/";

	}

	@Given("user get the RequestSpecification interface object")
	public void user_get_the_request_specification_interface_object() {
		httpRequest = RestAssured.given();
	}

	@Given("user add request header")
	public void user_add_request_header() {
		httpRequest.header("Content-Type", "application/json");
	}

	@Given("user create request body for post request")
	public void user_create_request_body_for_post_request() throws JsonProcessingException {
		Employee emp = new Employee();
		emp.setFirstName("Rohini");
		emp.setLastName("Mote");
		emp.setAddress("Pune");
		emp.setMobileNumber(7777777l);
		emp.setGender("female");

		ObjectMapper mapper = new ObjectMapper();
		postRequestBody = mapper.writeValueAsString(emp);
	}

	@Given("user add request body for post request")
	public void user_add_request_body_for_post_request() {
		httpRequest.body(postRequestBody);
	}

	@When("user select HTTP POST Request")
	public void user_select_http_post_request() {
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
		respBody = response.body().asString();
		System.out.println(respBody);
	}

	@Then("user capture response headers")
	public void user_capture_response_headers() {
		Headers AllHeader = response.headers();

	}

	@Then("user capture id from response body")
	public void user_capture_id_from_response_body() {

		JsonPath jsonPath = new JsonPath(respBody);
		id = jsonPath.getString("id");
		System.out.println(id);
	}

	@When("user select HTTP GET Request")
	public void user_select_http_get_request() {
		response = httpRequest.get("employees/" + id);
	}

	@Given("user create request body for put request")
	public void user_create_request_body_for_put_request() throws JsonProcessingException {
		Employee emp = new Employee();
		emp.setFirstName("Sujata");
		emp.setLastName("Kale");
		emp.setAddress("Pune");
		emp.setMobileNumber(4444444l);
		emp.setGender("female");
		ObjectMapper mapper = new ObjectMapper();
		putRequesBody = mapper.writeValueAsString(emp);

	}

	@Given("user add request body for put request")
	public void user_add_request_body_for_put_request() {
		httpRequest.body(putRequesBody);
	}

	@When("user select HTTP put Request")
	public void user_select_http_put_request() {
		response = httpRequest.put("employees/" + id);
	}

	@Given("user create request body for patch request")
	public void user_create_request_body_for_patch_request() throws JsonProcessingException {
		Employee emp = new Employee();
		emp.setFirstName("Rutuja");

		ObjectMapper mapper = new ObjectMapper();
		patchRequestBody = mapper.writeValueAsString(emp);

	}

	@Given("user add request body for patch request")
	public void user_add_request_body_for_patch_request() {
		httpRequest.body(patchRequestBody);
	}

	@When("user select HTTP patch Request")
	public void user_select_http_patch_request() {
		response = httpRequest.patch("employees/" + id);
	}

	@When("user select HTTP delete Request")
	public void user_select_http_delete_request() {
		response = httpRequest.delete("employees/" + id);

	}

}
