package general;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import graphql.Assert;

public class SpiceJetDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//div[text()=\"Select Date\"]")).isEnabled());
		
		System.out.println(driver.findElement((By.xpath("//div[text()=\"Select Date\"]"))).getAttribute("class"));
		
		if (driver.findElement((By.xpath("//div[text()=\"Select Date\"]"))).getAttribute("class").contains("r-14lw9ot")) {
			System.out.println("Return date is enabled");
			Assert.assertTrue(true);
		}
		else{
			System.out.println("Return date is Disabled");
			Assert.assertTrue(false);
		}
	}

}
