package selenium1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import utility.SeleniumutilsNonStaticMethods;

public class FluentWait1 {
	static WebDriver driver;
	static Actions action;
	public static void main(String[] args) {
		
		SeleniumutilsNonStaticMethods obj1= new SeleniumutilsNonStaticMethods();
		obj1.setup("https://www.ebay.com/");
		driver=SeleniumutilsNonStaticMethods.driver;
		WebElement motorsElement= driver.findElement(By.xpath("//li[@data-currenttabindex=\"1\"]"));
		action=SeleniumutilsNonStaticMethods.action;
		obj1.mouseOverMethod(motorsElement);
		
		FluentWait<WebDriver> fluentwait= new FluentWait<WebDriver>(driver);
		fluentwait.withTimeout(Duration.ofSeconds(10))
				  .pollingEvery(Duration.ofSeconds(2))
				  .withMessage("Dinesh:Element not found")
				  .ignoring(NoSuchElementException.class);
		
		fluentwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//dsdasda[@href=\"https://www.ebay.com/globaldeals/more/automotive\"]"))).click();
		
		//driver.findElement(By.xpath("//da[@href=\"https://www.ebay.com/globaldeals/more/automotive\"]")).click();
	}

}
