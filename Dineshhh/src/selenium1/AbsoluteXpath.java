package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		
		driver.findElement(By.xpath("html/body/div[4]/div/div/ul/li/a")).click();
	}

}
