package testNGPractice;

import org.testng.annotations.Test;

public class AttributesTestNG {
	
	
	@Test (dependsOnMethods= {"blogin"})
	public void alogout() {
		System.out.println("Logout sucessfully");
		
	}
	
	@Test (dependsOnMethods= {"blogin"})
	public void clogout() {
		System.out.println("Logout sucessfully");
		
	}
	
	@Test ()
	public void blogin() {
		System.out.println("Logged in sucessfully");
		
	}
	
	@Test(dependsOnMethods= {"blogin"})
	public void alogout1() {
		System.out.println("Logout1 sucessfully");
		
	}
	
	@Test
	public void moneyTrasfer() {
		System.out.println("Money Trasferred sucessfully");
		
	}
	
	

}
