package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumutils {
	public static WebDriver driver;
	public static Actions action;
	public static void setup(String appurl) {
		//creating instance of ChromeDriver and upcast to webdriver I.
		driver=new EdgeDriver();
		driver.get(appurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		action=new Actions(driver);
	}
	
	public static void mouseOverOperation(WebElement elementmove) {
		action.moveToElement(elementmove).perform();
	}
	

	public static void doubleclickmethod(WebElement elementdoubleClick) {
		action.doubleClick(elementdoubleClick).perform();
		//or
		//action.moveToElement(elementdoubleClick).doubleClick().build().perform();
	}
	

}
