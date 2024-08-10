package Tutorial4;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {

	public static void main(String[] args) {
		// step 1: configure BaseURI in Rest Assured
		RestAssured.baseURI = "http://localhost:3000/employees";
		
		// Step 2: get the Request Specification interface object
		RequestSpecification httpRequest1 = RestAssured.given();
		
		//step 3: add request Header
		httpRequest1.header("Content-Type","application/json");
		
		//step 4: create request body for POST Request
		JSONObject json1 =new JSONObject();
		json1.put("firstName", "Manoj");
		json1.put("lastName", "Patil");
		json1.put("address", "Pune");
		json1.put("mobileNumber", 909090);
		json1.put("gender","male");
		
		String requestbody1 = json1.toString();
		
		//step 5: add request body
		httpRequest1.body(requestbody1);
		
		//step 6: select the HTTP POST Request
		Response response1 = httpRequest1.post();
		
		//step 7: capture status code
		int a1 = response1.statusCode();
		System.out.println(a1);
		
		//step 8:capture status code
		String b1 = response1.statusLine();
		System.out.println(b1);
	
		//step 9: capture response time
		long c1 = response1.time();
		System.out.println(c1);
	
		//step 10: capture response body
		String d1 = response1.body().asString();
		System.out.println(d1);
	
		//step 11: capture response headers
		Headers allHeader1 = response1.headers();
		
		//step 12: capture id from response body
		JsonPath jsonPath =new JsonPath(d1);
		
		String id = jsonPath.getString("id");
		System.out.println(id);
		
		System.out.println("-------------------------------------------------------");
	
		//step 13: configure Base URI in Rest Assured
		RestAssured.baseURI="http://localhost:3000/employees/"+id;
	
		//step 14: get the Request Specification interface object
		RequestSpecification httpRequest2 = RestAssured.given();
		
		//step 15: Select the HTTP GET Request
		Response response2  = httpRequest2.get();
		
		//step 16: capture status code
		int a2  = response2.statusCode();
		System.out.println(a2);
	
		//step 17: capture status line
		String b2 = response2.statusLine();
		System.out.println(b2);
	
		//step 18: capture response time
		long c2 = response2.time();
		System.out.println(c2);
	
		//step 19: capture response body
		String d2 = response2.body().asString();
		System.out.println(d2);
	
		//step 20; capture response Headers
		Headers allHeaders2 = response2.headers();
		
		System.out.println("---------------------------------------------------");
		
		//Step 21:configure Base URI in Rest Assured
		RestAssured.baseURI="http://localhost:3000/employees/"+id;
		
		//step 22: get the RequestSpecification interface object
		RequestSpecification httpRequest3 =RestAssured.given();
		
		//step 23: add request header
		httpRequest3.header("Content-Type","application/json");
		
		//step 24: create Request body for PUT Request
		JSONObject json2 =new JSONObject();
		json2.put("firstName", "Nikhil");
		json2.put("lastName", "Patil");
		json2.put("address", "Delhi");
		json2.put("mobileNumber", 555555);
		json2.put("gender", "male");
		
		String requestbody2 = json2.toString();
		
		//step 25: add request body
		httpRequest3.body(requestbody2);
		
		//step 26: select the HTTP PUT Request
		Response response3 = httpRequest3.put();
		
		
		//step 27: capture status code
		int a3 = response3.statusCode();
		System.out.println(a3);
		
		//step 28; capture status line
		String b3 = response3.statusLine();
		System.out.println(b3);
		
		//step 29: capture response time
		long c3 = response3.time();
		System.out.println(c3);
		
		//step 30: capture response body
		String d3 = response3.body().asString();
		System.out.println(d3);
		
		//step 31: capture response headers
		Headers allHeader3 = response3.headers();
		
		
		
		
		
	}

}
