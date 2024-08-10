package Tutorial2;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {

	public static void main(String[] args) {
		// Step 1: Configure Base URI
		RestAssured.baseURI = "https://reqres.in/api/users/2";

		// step 2: get RequestSpecification Interface object so we can select HTTP Request
		RequestSpecification httpRequest1 = RestAssured.given();

		//step 3: select the HTTP GET Request
		Response response1 = httpRequest1.get();
		
		//step 4: capture status code
		int a1 = response1.getStatusCode();
		System.out.println(a1);
		
		//step 5: capture status line
		String a2 = response1.getStatusLine();
		System.out.println(a2);
		
		//step 6: capture response time
		long a3 = response1.getTime();
		System.out.println(a3);
		
		//step 7: capture response body
		String a4 = response1.getBody().prettyPrint();
		System.out.println(a4);
		
		//step 8": capture response headers
		Headers allheader = response1.getHeaders();
		
		//step 9: iterate all headers key-value 
		for(Header abc: allheader)
		{
			String p1 = abc.getName();
			String p2 = abc.getValue();
			System.out.println(p1 + "  :: "+p2);
		}
		
		System.out.println("=====================================================");
		
		//Step 10: Configure Base URI
		RestAssured.baseURI = "https://reqres.in/api/users/2";
		
		//step 11: get RequestSpecification interface object so we can select HTTP DELETE Request
		RequestSpecification httpRequest2 = RestAssured.given();
		
		//step 12: select HTTP DELETE Request
		Response response2 = httpRequest2.delete();
		
		//step 13: capture status code
		int b1 = response2.getStatusCode();
		System.out.println(b1);
		
		//step 14: capture status line
		String b2 =  response2.getStatusLine();
		System.out.println(b2);
		
		//step 15: capture response time
		long b3 = response2.getTime();
		System.out.println(b3);
		
		
		//step 16: capture respons headers
		Headers allHeaders2 = response2.getHeaders();
		
		//step 17: iterate all headers
		for(Header abc: allHeaders2)
		{
			System.out.println(abc.getName() + " :::  "+abc.getValue());
		}
		
		
		
		
	}
	
	

}
