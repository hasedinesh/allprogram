package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumutilsNonStaticMethods {
	public static WebDriver driver;
	public static Actions action;
	public void setup(String appUrl) {
		driver=new EdgeDriver();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		action=new Actions(driver);
	}
	public void doubleClickMethod(WebElement elementToDC) {
		action.doubleClick(elementToDC).perform();//actions instance initiated in above setup() method already hence it is available further.
	}
	public void rightClickMethod(WebElement elementToRC) {
		action.contextClick(elementToRC).perform();
	}
	public void mouseOverMethod(WebElement mouseOverElement) {
		action.moveToElement(mouseOverElement).perform();
	}
}
