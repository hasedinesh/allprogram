package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import files.payload;
import io.restassured.path.json.JsonPath;

public class JsonParseWithTestNG {
	
    @Test
	public void sumOfCoursePriceValidation() {
		
		JsonPath js=new JsonPath(payload.payloadForParseJason());
		int courseArraySize= js.getInt("courses.size()");
		int courseCost=0;
		for (int i = 0; i <courseArraySize ; i++) {
			int coursePrice=js.getInt("courses["+i+"].price");
			int courseCopies=js.getInt("courses["+i+"].copies");
			courseCost= courseCost+(coursePrice*courseCopies);
		}
		System.out.println(courseCost);
		Assert.assertEquals(courseCost,js.getInt("dashboard.purchaseAmount"));
		
		
	}
	
	
}
