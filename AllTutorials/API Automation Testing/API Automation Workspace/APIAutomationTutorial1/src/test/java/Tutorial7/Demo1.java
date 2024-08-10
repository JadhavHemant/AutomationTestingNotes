package Tutorial7;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		RestAssured.baseURI = "http://localhost:3000/employees";
		RequestSpecification httpRequest1 = RestAssured.given();
		httpRequest1.header("Content-Type", "application/json");
		Employee emp1 = new Employee();
		emp1.setFirstName("Rahul");
		emp1.setLastName("Patil");
		emp1.setAddress("Pune");
		emp1.setMobileNumber(9888999l);
		emp1.setGender("male");

		ObjectMapper mapper1 = new ObjectMapper();
		String postRequestBody = mapper1.writeValueAsString(emp1);
		httpRequest1.body(postRequestBody);

		Response response1 = httpRequest1.post();
		
		System.out.println(response1.statusCode());
		System.out.println(response1.statusLine());
		System.out.println(response1.time());
		String respBody1 = response1.body().asString();
		System.out.println(respBody1);
		
		JsonPath jsonPath =new JsonPath(respBody1);
		String id = jsonPath.getString("id");
		
		Thread.sleep(3000);
		System.err.println("------------------------------");
		
		RestAssured.baseURI="http://localhost:3000/employees/"+id;
		RequestSpecification httpRequest2 = RestAssured.given();
		httpRequest2.header("Content-Type","application/json");
		Employee emp2 = new Employee();
		emp2.setFirstName("Sujit");
		emp2.setLastName("Shah");
		emp2.setAddress("Delhi");
		emp2.setMobileNumber(555555l);
		emp2.setGender("male");
		
		ObjectMapper mapper2 =new ObjectMapper();
		String putRequestBody = mapper2.writeValueAsString(emp2);
		
		httpRequest2.body(putRequestBody);
		Response response2 = httpRequest2.put();
		System.out.println(response2.statusCode());
		System.out.println(response2.statusLine());
		System.out.println(response2.time());
		System.out.println(response2.body().asString());
		
		Thread.sleep(3000);
		System.err.println("------------------------------");
		
		RestAssured.baseURI="http://localhost:3000/employees/"+id;
		RequestSpecification httpRequest3 = RestAssured.given();
		httpRequest3.header("Content-Type","application/json");
		Employee emp3 = new Employee();
		emp3.setFirstName("Prasad");
		emp3.setAddress("Dubai");
		
		ObjectMapper mapper3 =new ObjectMapper();
		String patchRequestBody = mapper3.writeValueAsString(emp3);
	
		httpRequest3.body(patchRequestBody);
		
		Response response3 = httpRequest3.patch();
		System.out.println(response3.statusCode());
		System.out.println(response3.statusLine());
		System.out.println(response3.time());
		System.out.println(response3.body().asString());
	}
}
