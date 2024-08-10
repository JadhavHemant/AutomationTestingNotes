package Tutorial5;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) {
		// Step 1: Configure BaseURI in rest Assured
		RestAssured.baseURI = "http://localhost:3000/";

		// step 2: get the RequestSpecification interface object
		RequestSpecification httpRequest = RestAssured.given();

		// step 3: add request headers
		httpRequest.header("Content-Type", "application/json");

		// step 4: create request body
		JSONObject json = new JSONObject();
		json.put("firstName", "Mukesh");
		json.put("mobileNumber", 1111111);

		String requestBody = json.toString();

		// step 5: add request body to HTTP PATCH Request
		httpRequest.body(requestBody);

		// step 6: select the HTTP PATCH Request
		Response response = httpRequest.patch("employees/3");

		// step 7: capture status code
		int a = response.statusCode();
		System.out.println(a);// 200

		// step 8: capture status line
		String b = response.statusLine();
		System.out.println(b);

		// step 9: capture response time
		long c = response.time();
		System.out.println(c);

		// step 10: capture response body
		String d = response.body().asString();
		System.out.println(d);

		// step 11: capture response headers
		Headers allHeader = response.headers();

		// step 12: capture first name from response body
		JsonPath jsonPath = new JsonPath(d);

		String fname = jsonPath.getString("firstName");
		System.out.println(fname);

	}

}
