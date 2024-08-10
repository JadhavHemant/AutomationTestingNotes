package Tutorial4;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) {
		// Step 1: Configure Base URI in rest Assured
		RestAssured.baseURI = "http://localhost:3000/employees/2";

		// Step 2: get the RequestSpecification interface object
		RequestSpecification httpRequest = RestAssured.given();

		// step 3: add request header
		httpRequest.header("Content-Type", "application/json");

		// Step 4: create Request body in JSON format
		JSONObject json = new JSONObject();
		json.put("firstName", "Sonali");
		json.put("lastName", "Bhosale");
		json.put("address", "Delhi");
		json.put("mobileNumber", 55555555);
		json.put("gender", "female");

		String requestBody = json.toString();

		// step 5: add request body
		httpRequest.body(requestBody);

		// step 6: select the HTTP PUT Request
		Response response = httpRequest.put();
		
		//step 7: capture status code
		int a1 = response.getStatusCode();
		int a2 = response.statusCode();
		System.out.println(a1);
		System.out.println(a2);
		
		//step 8: capture status line
		String b1 = response.getStatusLine();
		String b2 = response.statusLine();
		System.out.println(b1);
		System.out.println(b2);
		
		//step 9: capture response time
		long c1 = response.getTime();
		long c2 =response.time();
		System.out.println(c1);
		System.out.println(c2);
		
		//step 10: capture response body
		String d1 = response.getBody().asString();
		String d2 = response.body().asString();
		System.out.println(d1);
		System.out.println(d2);
		
		//step 11: capture response headers
		Headers allheader1 = response.getHeaders();
		Headers allheader2 = response.headers();
		
		for(Header abc: allheader2)
		{
			System.out.println(abc.getName() + " ::: "+abc.getValue());
		}
		
		//step 12; capture firstname and lastname
		
		JsonPath jsonPath =new JsonPath(d2);
		
		String fname = jsonPath.getString("firstName");
		String lname  = jsonPath.getString("lastName");
		
		System.out.println(fname);
		System.out.println(lname);
		
		
		
		
		
		
	}

}
