package testngAnnotations;

import org.testng.annotations.Test;

public class TestngDescriptionAnnotationAttributeTest {

	@Test(priority=3)
	public void logout() {
		System.out.println("Logout successfully");
	}

	@Test(priority =1)
	public void login() {
		System.out.println("Login Successfully");
	}

	@Test(priority=2)
	public void credential() {
		System.out.println("Enter credentials");
	}
	
}
