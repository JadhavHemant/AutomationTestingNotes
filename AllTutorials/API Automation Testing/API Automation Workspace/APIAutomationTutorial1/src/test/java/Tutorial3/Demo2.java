package Tutorial3;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {

	public static void main(String[] args) {
		// Configure Base URI in RestAssured
		RestAssured.baseURI = "http://localhost:3000/employees";

		// get the RequestSpecification interface object
		RequestSpecification httpRequest = RestAssured.given();

		// Step 3: add Request Header
		httpRequest.headers("Content-Type", "application/json");

		// Step 4: create Request Body
		JSONObject json = new JSONObject();
		json.put("firstName", "Suraj");
		json.put("lastName", "Pandit");
		json.put("address", "Mumbai");
		json.put("mobileNumber", 90090900);
		json.put("gender", "male");
		
		String requestBody = json.toString();
		
		//step 5: add request body
		httpRequest.body(requestBody);
		
		//step 6: select the HTTP POST Request
		Response response = httpRequest.post();
		
		//step 7: capture status code
		int a  = response.getStatusCode();
		System.out.println(a);
	
		//step 8: capture status line
		String b = response.getStatusLine();
		System.out.println(b);
		
		//step 9: capture response time
		long c = response.getTime();
		System.out.println(c);
		
		//step 10: capture response body
		String d = response.getBody().asString();
		System.out.println(d);
		
		//step 11: capture id number from response body
		
		JsonPath jsonPath =new JsonPath(d);
		
		String id = jsonPath.getString("id");
		System.out.println(id);
		
		//step 12: capture first name from response body
		
		String Fname = jsonPath.getString("firstName");
		System.out.println(Fname);
		
		//step 13: capture lastname from response body
		String LName = jsonPath.getString("lastName");
		System.out.println(LName);
		
		//step 14: capture adddress from response body
		
		JsonPath jsonPath1 = response.getBody().jsonPath();
		String add  = jsonPath1.getString("address");
		System.out.println(add);
		
		//step 15: capture mobile number
		long m = jsonPath1.getLong("mobileNumber");
		System.out.println(m);
		
		//step 16: capture gender
		System.out.println(jsonPath1.getString("gender"));
		
	}

}
