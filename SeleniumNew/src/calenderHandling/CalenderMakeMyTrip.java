package calenderHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.SeleniumutilsNonStaticMethods;
public class CalenderMakeMyTrip {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		SeleniumutilsNonStaticMethods obj1=new SeleniumutilsNonStaticMethods();
		obj1.setup("https://www.makemytrip.com/");
		driver=SeleniumutilsNonStaticMethods.driver;
		//switching to adkill frame
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.cssSelector("#webklipper-publisher-widget-container-notification-close-div")).click();
		//Switching back to main frame
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		driver.findElement(By.xpath("//div[@class='DayPicker-Months']//div[@class='DayPicker-Month'][2]//div[@class='DayPicker-Week'][3]//div[@class='DayPicker-Day'][3]")).click();
		//or using another xpath
		//driver.findElement(By.xpath("//div[@class='DayPicker-Months']//div[2]//div[3]//div[3]//div[3]")).click();
		Thread.sleep(2000);
		//To navigate to next months
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		driver.findElement(By.xpath("//div[@class='DayPicker-Months']//div[2]//div[3]//div[3]//div[3]")).click();

	}

}
