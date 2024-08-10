package Tutorial2;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) {
		// Step 1: Configure Base URI in Rest Assured

		RestAssured.baseURI = "https://reqres.in/api/users/2";

		// Step 2: get the RequestSpecification interface object so we can select HTTP
		// DELETE Request

		RequestSpecification httpRequest = RestAssured.given();

		// step 3: select HTTP DELETE Request
		Response response = httpRequest.delete();

		// step 4: capture status code
		int a = response.getStatusCode();
		System.out.println(a); // 204

		// step 5: capture status line
		String b = response.getStatusLine();
		System.out.println(b); // HTTP/1.1 204 No Content

		// step 6: capture response time
		long c = response.getTime();
		System.out.println(c);

		System.out.println("---------------------------");
		// step 7: capture response headers
		Headers allHeader = response.getHeaders();

		for (Header abc : allHeader) {
			String key = abc.getName();
			String value = abc.getValue();

			System.out.println(key + "  ::  " + value);
		}

	}

}
