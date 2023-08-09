package assertion;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class HardAseertion1Test {
  @Test
  public void loginTest() throws IOException {	
	  
	  WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login.php");
		WebElement loginfieldElement = driver.findElement(By.name("email"));
		Assert.assertTrue(loginfieldElement.isDisplayed());// further code will be execute iff loginfield element is
													// visible
		Properties property = new Properties();
		FileInputStream fis = new FileInputStream("D:\\eclipse-workspace\\MavenSelenium\\src\\test\\resources\\abc.properties");
		property.load(fis);
		loginfieldElement.sendKeys(property.getProperty("Username"));

		WebElement passfieldElement = driver.findElement(By.name("pass"));
		Assert.assertTrue(passfieldElement.isDisplayed());
		passfieldElement.sendKeys(property.getProperty("Password"));

		driver.findElement(By.className("_9lsa")).click();
		passfieldElement.sendKeys(Keys.ENTER);
	  
	  
  }
}
