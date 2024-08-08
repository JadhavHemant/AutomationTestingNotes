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

public class StepDefinition {
	private static String requestPutBody;
	private static JSONObject json3;
	private static String id;
	String d;
	private static Response response;
	  String requestBody;
    private static RequestSpecification httpRequest;
	@Given("Configure baseURI")
	public void configure_base_uri() {
      RestAssured.baseURI="http://localhost:3000/employees";
	}

	@When("getRequestSpecification interface object")
	public void get_request_specification_interface_object() {
		 httpRequest = RestAssured.given();
	}

	@Then("Add the request header")
	public void add_the_request_header() {
		httpRequest.header("Content-Type","application/json");
	}

	@Then("Create the request body")
	public void create_the_request_body() {
      JSONObject json = new JSONObject();
      json.put("firstName", "Pragati");
      json.put("lastName", "yerkal");
      json.put("address", "Latur");
      json.put("mobileNumber", 900062);
      json.put("gender", "Feamle");
      
       requestBody = json.toString();
	}

	@Then("Add request Body for POST request")
	public void add_request_body_for_post_request() {
		httpRequest.body(requestBody);
	}

	@Then("select HTTP POST request")
	public void select_http_post_request() {
		 response =httpRequest.post();
	}

	@Then("Capture status code")
	public void capture_status_code() {
		int a = response.statusCode();
		System.out.println(a);
	}

	@Then("Capture status line")
	public void capture_status_line() {
		String b = response.statusLine();
		System.out.println(b);
	}

	@Then("Capture Response time")
	public void capture_response_time() {
		long c = response.time();
		System.out.println(c);
	}

	@Then("Capture Response body")
	public void capture_response_body() {
		 d = response.body().asString();
		 System.out.println(d);
	}

	@Then("Capture Response headers")
	public void capture_response_headers() {
		Headers allHeader = response.headers();
	}

	@Then("Capture id from response body")
	public void capture_id_from_response_body() {
         JsonPath json1 = new JsonPath(d);
          id = json1.getString("id");
	}

	@Given("Configure baseURI with id")
	public void configure_base_uri_with_id() {
        RestAssured.baseURI="http://localhost:3000/employees/"+id;
	}

	@Then("user select the get request")
	public void user_select_the_get_request() {
		response = httpRequest.get();
	}

	@Then("Create request body for PUT request")
	public void create_request_body_for_put_request() {
     JSONObject json3=new JSONObject(); 
     json3.put("firstName", "Teju");
     json3.put("lastName", "dhote");
     json3.put("address", "Hydrabad");
     json3.put("mobileNumber", 9000222);
     json3.put("gender", "Feamle");
     
      requestPutBody= json3.toString();
	}

	@Then("add request body for put request")
	public void add_request_body_for_put_request() {
		httpRequest.body(requestPutBody);
	}

	@Then("add Select HTTP PUT request")
	public void add_select_http_put_request() {
	     response = httpRequest.put();
	}

}
