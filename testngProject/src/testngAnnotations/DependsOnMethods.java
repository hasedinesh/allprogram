package testngAnnotations;

import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test(dependsOnMethods ={"login","credential"})
	public void logout() {
		System.out.println("Logout successfully");
	}

	@Test
	public void login() {
		int i=10/0;
		System.out.println("Login Successfully");
	}

	@Test
	public void credential() {
		System.out.println("Enter credentials");
	}
}
