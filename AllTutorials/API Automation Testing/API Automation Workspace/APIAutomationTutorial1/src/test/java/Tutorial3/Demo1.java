package Tutorial3;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {
	
	public static void main(String[] args) {
		//Step 1: Configure Base URI in Rest Assured
		RestAssured.baseURI="http://localhost:3000/employees";
		
		//step 2: get the RequestSpecification interface object so we add request header, we can add request body and we can select HTTP POST Request
		
		RequestSpecification httpRequest = RestAssured.given();
		
		//step 3: add request header
		httpRequest.header("Content-Type","application/json");
		
		//step 4: create Request Body in JSON Format
		JSONObject json = new JSONObject();
		json.put("firstName", "Gauri");
		json.put("lastName", "More");
		json.put("address", "Pune");
		json.put("mobileNumber", 980908998);
		json.put("gender", "female");
		
		String requestBody = json.toString();
		
		//step 5: add request body to HTTP POST Request
		httpRequest.body(requestBody);
			
		//step 6: select HTTP POST Request
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
		
		//step 11: capture response headers
		Headers allHeader = response.getHeaders();
		
		//step 12: iterate all header key-value
		
		for(Header abc: allHeader)
		{
			System.out.println(abc.getName() + "  ::  "+abc.getValue());
		}
		
		System.out.println("--------------------------------------------");
		
		//step 14 : capture id number from response body
		
		String a1 = response.getBody().jsonPath().getString("id");
		System.out.println(a1);
		
		String a2 = response.getBody().jsonPath().getString("firstName");
		System.out.println(a2);
		
		JsonPath jsonPath = response.getBody().jsonPath();
		
		String a3 = jsonPath.getString("lastName");
		System.out.println(a3);
		
		String a4 = jsonPath.getString("address");
		System.out.println(a4);
		
		long a5 = jsonPath.getLong("mobileNumber");
		System.out.println(a5);
		
		JsonPath path =new JsonPath(d);
		String a6 = path.getString("gender");
		System.out.println(a6);
		
		
		
		
	}
}
