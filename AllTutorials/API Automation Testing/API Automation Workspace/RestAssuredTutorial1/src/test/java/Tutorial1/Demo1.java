package Tutorial1;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.User;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		RestAssured.baseURI="http://localhost:5000/users";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type","application/json");
		
		ObjectMapper mapper = new ObjectMapper();

		File file = new File(System.getProperty("user.dir") + "//src//test/resources//userTestData.json");
		
		JsonNode jsonNode = mapper.readTree(file);
		
		User user = mapper.treeToValue(jsonNode.get("createUser"), User.class);
		
		String RequestBody = mapper.writeValueAsString(user);
		
		httpRequest.body(RequestBody);
		
		Response response = httpRequest.post();
		
		System.out.println(response.statusCode());
		System.out.println(response.statusLine());
		System.out.println(response.time());
		System.out.println(response.body().asString());
	}

}
