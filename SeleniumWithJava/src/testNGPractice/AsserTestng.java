package testNGPractice;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsserTestng {
	// Soft Assertion = if we want to execute all statement of TC without abruptly
	// failing at earlier failed assertion then we have to use Softassertion.
	// case 1: SoftAssertion with PASS Status and without result of failure
	// asserertion. (TC will Pass)
	@Test
	public void softAssert() {
		int a = 10;
		int b = 15;
		SoftAssert softassert = new SoftAssert();// For SoftAssertion, we need to create object for SoftAssertion class
													// as methods are non-static
		softassert.assertTrue(a > b);// false
		System.out.println("This is SoftAssert");
		softassert.assertTrue(a < b);
	}
	// case 2: SoftAssertion with PASS Status and with result of failure asserertion
	// using "assertAll()". (TC will fail)
	@Test
	public void softAssert1() {
		int a = 10;
		int b = 15;
		SoftAssert softassert = new SoftAssert();// For SoftAssertion, we need to create object for SoftAssertion class
													// as methods are non-static
		softassert.assertTrue(a > b);// false
		System.out.println("This is SoftAssert1 with assertall()");
		softassert.assertTrue(a < b);
		softassert.assertEquals(a, b, "a and b are not equal"); // exception with message
		softassert.assertAll(); //
	}
	// HardAssertion
	@Test
	public void HardAssert() {
		String s1 = "Dinesh";
		String s2 = "Dinesh";
		Assert.assertNotEquals(s1, s2, "Both String are equal");
		Assert.assertEquals(s1, s2, "Both String not equal");

	}
}