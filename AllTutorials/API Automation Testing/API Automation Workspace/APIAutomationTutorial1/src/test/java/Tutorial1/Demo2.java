package Tutorial1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {

	public static void main(String[] args) {
		//Configure the Base URI
		RestAssured.baseURI="http://localhost:3000/employees/1";
		
		//get the RequestSpecification interface object so we can Select the HTTP GET Request
		RequestSpecification httpRequest = RestAssured.given();
		
		//select HTTP GET Request
		Response response = httpRequest.get();
		
		//capture status code
		int a = response.getStatusCode();
		System.out.println(a);
		
		//capture status line
		String b = response.getStatusLine();
		System.out.println(b);
		
		//capture response time
		long c = response.getTime();
		System.out.println(c);
		
		//capture response body 
		String d = response.getBody().asString();
		System.out.println(d);

	}

}
