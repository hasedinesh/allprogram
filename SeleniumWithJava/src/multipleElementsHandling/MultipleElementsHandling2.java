package multipleElementsHandling;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsHandling2 {
	public static void main(String[] args) {		
		WebDriver driver= new ChromeDriver();		
		driver.get("https://demosite.executeautomation.com/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		List<WebElement> topLabel= driver.findElements(By.xpath("//div[@id='cssmenu']/ul/li/a/span"));	
		System.out.println(topLabel.size());
		for (WebElement webElement : topLabel) {
			System.out.println(webElement.getText());
		}
	}
}
