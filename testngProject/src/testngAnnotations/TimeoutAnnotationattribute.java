package testngAnnotations;

import org.testng.annotations.Test;

public class TimeoutAnnotationattribute {

	@Test
	public void logout() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("Logout successfully");
	}

	@Test(timeOut = 100)
	public void login() throws InterruptedException {
		Thread.sleep(50);
		System.out.println("Login Successfully");
	}

	@Test(timeOut=100)
	public void credential() throws InterruptedException {
		Thread.sleep(200);
		System.out.println("Enter credentials");
	}
	
}