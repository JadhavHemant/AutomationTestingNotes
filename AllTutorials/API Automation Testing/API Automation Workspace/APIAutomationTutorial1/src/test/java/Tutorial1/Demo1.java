package Tutorial1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) {
		// Step 1: configure Base URI
		RestAssured.baseURI = "http://localhost:3000/employees/3";

		// Step 2: get the RequestSpecification interface object so we can select HTTP
		// GET Request

		RequestSpecification httpRequest = RestAssured.given();

		// Step 3: select the HTTP GET Request

		Response response = httpRequest.get();

		response.then().log().all();

	}

}
