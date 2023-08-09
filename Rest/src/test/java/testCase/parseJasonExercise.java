package testCase;
import java.util.Scanner;

import org.testng.Assert;

import files.payload;
import io.restassured.path.json.JsonPath;
public class parseJasonExercise {

	public static void main(String[] args) {	
	//parse the json
	JsonPath jp= new JsonPath(payload.payloadForParseJason());
	
	//1) Print No of courses returned by API
	int noOfCourses=jp.getInt("courses.size()");
	System.out.println("Number of courses in given API are: "+noOfCourses);
	
	//2) Print Purchase Amount
	int purcahseAmount= jp.get("dashboard.purchaseAmount"); //for child value follow the path i.e. parent.child
	System.out.println("Total purchase amount: "+ purcahseAmount);
	
	//3) Print Title of the first course 
	String firstCourseTitle=jp.get("courses[0].title");
	System.out.println(firstCourseTitle);
	
	//4)Print All course titles and their respective Prices (use dynamic logic)
	System.out.println("List of courses with their prices: ");
	for(int i=0;i<jp.getInt("courses.size()");i++) {
		
		System.out.println("Course name: "+jp.getString("courses["+i+"].title"));
		System.out.println("course price: "+jp.getInt("courses["+i+"].price"));
	}
	//5)Print no of copies sold by XYZ (Ex:RPA) Course  (dont hardcode)
	Scanner scan= new Scanner(System.in);
	
	System.out.println("Enter course name for which you want number of copies: ");
	scan.next();
	
	for(int j=0;j<jp.getInt("courses.size()");j++) {
			if(jp.getString("courses["+j+"].title").equalsIgnoreCase("RPA")) {
				System.out.println(jp.getString("courses["+j+"].copies"));
				break;
		}
	}
	//6) Verify if Sum of all Course prices matches with Purchase Amount
			int totalCalculatedPurchaseAmount=0;
			for(int k=0;k<jp.getInt("courses.size()");k++) {
			int coursePrice=jp.getInt("courses["+k+"].price");
			int noOfcopies=jp.getInt("courses["+k+"].copies");
			int courseAmount=coursePrice*noOfcopies;
			totalCalculatedPurchaseAmount= totalCalculatedPurchaseAmount+courseAmount;
			}
			
			System.out.println("TotalCalculated Purchace amount is: "+totalCalculatedPurchaseAmount);
			Assert.assertEquals(totalCalculatedPurchaseAmount, purcahseAmount);
		
	}	
}
