package testngAnnotations;

import org.testng.annotations.Test;

public class groupsAnnotationAttribute {
	@Test(groups={"Smoke Test"})
	public void logout() {
		System.out.println("Logout successfully");
	}

	@Test (groups={"Regression","Smoke Test"})
	public void login() {
		System.out.println("Login Successfully");
	}

	@Test(groups="Regression")
	public void credential() {
		System.out.println("Enter credentials");
	}
}
