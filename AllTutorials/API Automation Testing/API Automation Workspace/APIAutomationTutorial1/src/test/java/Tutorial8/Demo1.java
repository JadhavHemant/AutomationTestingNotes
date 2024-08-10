package Tutorial8;

import java.io.FileReader;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		// step 1: Configure Base URI
		RestAssured.baseURI = "http://localhost:3000/employees";

		// step 2: get the RequestSpecification interface object
		RequestSpecification httpRequest = RestAssured.given();

		//step 3: add Request Header
		httpRequest.header("Content-Type","application/json");
		
		//step 4: Create Request body using Serialization and deserialization
		ObjectMapper mapper =new ObjectMapper();
		
		FileReader file =new FileReader(System.getProperty("user.dir")+"//src//test//resources//Employee.json");
		
		JsonNode jsonNode = mapper.readTree(file);	
		
		Employee emp = mapper.treeToValue(jsonNode.get("createEmployee"), Employee.class);
		
		String postRequestBody = mapper.writeValueAsString(emp);
		
		
		//step 5: add request body
		httpRequest.body(postRequestBody);
		
		//step 6: select the HTTP Post Request
		Response response = httpRequest.post();
		
		//step 7: capture status code
		int a  = response.statusCode();
		System.out.println(a);
		
		//step 8: capture status line
		String b = response.statusLine();
		System.out.println(b);
		
		//step 9: capture response time
		long c = response.time();
		
		//step 10: capture response  body
		String d = response.body().asString();
		System.out.println(d);
		
		//step 11: capture headers
		Headers allHeader = response.headers();
		
		for(Header abc: allHeader)
		{
			System.out.println(abc.getName() + "  :: "+abc.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
