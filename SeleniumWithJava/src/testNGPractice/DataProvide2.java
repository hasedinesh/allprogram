package testNGPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide2 {

	@Test(dataProvider="getData")
	public void login(String username,String password) {
		System.out.println("You have successfully logged in using username: "+username+" and password: "+password);
	}
	
	//@DataProvider (name="DATA") //we can also give different name for DataProvider method
	@DataProvider
	public Object [][] getData(){
		
		Object [][] data=new Object[3][2];
		
		data[0][0]="Dinesh";
		data[0][1]="123";
		
		data[1][0]="Hase";
		data[1][1]="456";	
		
		data[2][0]="DP";
		data[2][1]="789";
		return data;
	}
	
}
