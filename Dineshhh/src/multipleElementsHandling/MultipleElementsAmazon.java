package multipleElementsHandling;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsAmazon {
	public static void main(String[] args) {		
		WebDriver driver= new ChromeDriver();		
		driver.get("https://www.amazon.in/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> topLabel= driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));	
		System.out.println(topLabel.size());
		for (WebElement webElement : topLabel) {
			System.out.println(webElement.getAttribute("text"));
		}
	}
}
