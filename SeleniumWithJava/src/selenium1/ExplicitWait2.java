package selenium1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.ebay.com/");
		//driver.manage().window().maximize();
		WebElement Electronics= driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(Electronics).perform();
		Thread.sleep(2000);
		//WebDriverWait is a class which implements wait interface.
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement apple=wait.until(ExpectedConditions.visibilityOfElementLocated(
								By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a")));
		apple.click();

	}

}

