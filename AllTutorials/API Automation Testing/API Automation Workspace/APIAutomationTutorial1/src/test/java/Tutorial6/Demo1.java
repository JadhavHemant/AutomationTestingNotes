package Tutorial6;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) throws JsonProcessingException {
		//step 1; configure BaseURI in Rest Assured
		RestAssured.baseURI="http://localhost:3000/employees/4";
		
		//step 2: get the RequestSpecification interface object
		RequestSpecification httpRequest = RestAssured.given();
		
		//step 3: add request header
		httpRequest.header("Content-Type","application/json");
		
		//step 4: create Request body using Serialization
		Employee emp =new Employee();
		emp.setFirstName("Anjali");
	
		ObjectMapper mapper = new ObjectMapper();
		
		String postRequestBody = mapper.writeValueAsString(emp);
		
		//step 5; add request body
		httpRequest.body(postRequestBody);
		
		//step 6: select HTTP PATCH Request
		Response response = httpRequest.patch();
	
		//step 7: capture status code
		int a = response.statusCode();
		System.out.println(a);
		
		//step 8; capture status line
		String b = response.statusLine();
		System.out.println(b);
	
		//step 9" capture respons time
		long c = response.time();
		System.out.println(c);
	
		//step 10;capture response body
		String d = response.body().asString();
		System.out.println(d);
	
		//step 11: capture response header
		Headers allHeader = response.headers();
		
		//step 12: iterate all headers key-value pair
		for(Header abc: allHeader)
		{
			System.out.println(abc.getName() + " :: "+abc.getValue());
		}
	
	
	
	}
}
