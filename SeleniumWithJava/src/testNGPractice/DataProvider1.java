package testNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

import utility.SeleniumutilsNonStaticMethods;

public class DataProvider1 {
	
	@Test(dataProvider = "dataUsernamePass")
	public void loginTC(String username, String pass) {
	SeleniumutilsNonStaticMethods obj1=new SeleniumutilsNonStaticMethods();
	obj1.setup("https://www.instagram.com/?hl=en");
	SeleniumutilsNonStaticMethods.driver.findElement(By.name("username")).sendKeys(username);
	SeleniumutilsNonStaticMethods.driver.findElement(By.name("password")).sendKeys(pass);
	SeleniumutilsNonStaticMethods.driver.findElement(By.xpath("//button[@class=\"_acan _acap _acas _aj1-\"]")).click();
	String expectedURL="XYZ.com";
	String ActualURl=SeleniumutilsNonStaticMethods.driver.getCurrentUrl();
	Assert.assertEquals(ActualURl, expectedURL);
	}
	
	@DataProvider
	@Test
	public Object[][] dataUsernamePass() {
		//Object[][] data=new Object[3][2];
		
		Object[][] data= {{"Dinesh", "dsffd6545"},{"Dinesh", "65dsfsd45"},{"Dinesh", "65dsfsd45"}};
		
		
		return data;
		
	}
	
	
}
