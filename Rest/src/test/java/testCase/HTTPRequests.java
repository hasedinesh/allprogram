package testCase;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class HTTPRequests {
	//@Test
	void getUserList() {
		
		given()
		
		.when()
			.get("https://reqres.in/api/users?page=2")  //
		
		.then()
			.statusCode(200)
			.body("total",equalTo(12))
			.log().all();
	}
	
//	@Test
//	void createUser() {
//		//we need to post/create data in form of key-value pairs
//		//so we will create hashmap object.
//		HashMap<String, String> hm=new HashMap<String, String>();
//		hm.put("name", "Dinesh");
//		hm.put("job","Software Tester")
//		
//		
//		given()
//		.when()
//		.then();
//		
//	}
}
