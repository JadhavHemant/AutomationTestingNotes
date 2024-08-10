package Tutorial9;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		RestAssured.baseURI = "http://localhost:3000/employees";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");

		// create object of ObjectMapper class
		ObjectMapper mapper = new ObjectMapper();

		// create object of File class by passing file location
		File file = new File(System.getProperty("user.dir") + "//src//test/resources//Emp.json");

		// read all value from json file and set to the POJO classes
		Employee emp = mapper.readValue(file, Employee.class);

		// convert POJO class object into JSON of String of object
		String requestBodyTestData = mapper.writeValueAsString(emp);

		httpRequest.body(requestBodyTestData);

		Response response = httpRequest.post();
		
		System.out.println(response.statusCode());
		System.out.println(response.statusLine());
		System.out.println(response.time());
		System.out.println(response.body().asString());
	}

}
