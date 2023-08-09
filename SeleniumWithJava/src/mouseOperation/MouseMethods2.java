package mouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import utility.SeleniumutilsNonStaticMethods;

public class MouseMethods2 {
	public static WebDriver driver;//if we not declare this then also fine but we need to write SeleniumutilsNonStaticMethods.driver everywhere.
	public static void main(String[] args)throws InterruptedException {
		//SeleniumutilsNonStaticMethods.driver=new EdgeDriver();
		SeleniumutilsNonStaticMethods obj1=new SeleniumutilsNonStaticMethods();
		obj1.setup("https://www.facebook.com/login/");
		driver=SeleniumutilsNonStaticMethods.driver; //writing this to avoid writing on every line of driver variable
		WebElement usernameField=driver.findElement(By.id("email"));
		usernameField.sendKeys("hasedinesh");
		obj1.doubleClickMethod(usernameField);
		obj1.rightClickMethod(usernameField);
		
		
		
	}
}
