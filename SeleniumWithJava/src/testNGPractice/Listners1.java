package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

@Listeners (testNGPractice.ListnersTest.class)

public class Listners1 {
	
	String path = System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	
	
	
	
//	reporter.config().setReportName("Omayo Test Results");
//	reporter.config().setDocumentTitle("A Test Results");

	
  @Test
  public void loginTest() {
	  
	  System.out.println("Login to page");
	  Assert.assertEquals("Dinesh", "Dinesh");
	  
  }
}
