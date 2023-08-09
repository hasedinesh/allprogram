package testngAnnotations;

import org.testng.annotations.Test;

public class TestngPriorityAnnotationAttribute {

	@Test(description = "This is testcase1")
	public void testcase1() {
		System.out.println("HR");
	}

	@Test(description = "This is testcase3")
	public void testcase3() {
		System.out.println("QA Analyst");
	}
}
