package selenium1;
import java.time.Duration;	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait1 {
	public static void main(String[] args) throws InterruptedException {	
		WebDriver driver= new ChromeDriver();	
//		driver.get("https://demosite.executeautomation.com/");
//		WebElement login= driver.findElement(By.cssSelector("input[name=\"Login\"]"));
//		login.click();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement forgotAccount1= driver.findElement(By.cssSelector("a[class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);//this is deprecated from selenium4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		forgotAccount1.click();
	}

}
