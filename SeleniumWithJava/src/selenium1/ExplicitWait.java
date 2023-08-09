package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement customerService=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
		wait.until(ExpectedConditions.visibilityOf(customerService));
		customerService.click();
	}

}
