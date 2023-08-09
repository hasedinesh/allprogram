package testngAnnotations;

import org.testng.annotations.Test;

public class EnabledAnnotationAttributeTest {

	@Test(enabled=false)
	public void logout() {
		System.out.println("Logout successfully");
	}

	@Test(enabled=true)
	public void login() {
		System.out.println("Login Successfully");
	}

	@Test(enabled=false)
	public void credential() {
		System.out.println("Enter credentials");
	}
	
}
