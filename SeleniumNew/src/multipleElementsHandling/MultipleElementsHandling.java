package multipleElementsHandling;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleElementsHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.google.com");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.className("gLFyf")).sendKeys("selenium testing");
		//finding all search element using XPath and storing in List object of type WebElement.		
		List<WebElement> searchList=driver.findElements(By.xpath("//ul[@class='G43f7e']/li/div/div[2]/div/div[1]/span"));
		int countSearchElement=searchList.size();
		System.out.println(countSearchElement);
		//printing all search element
//		for (int i=0; i<countSearchElement;i++) {
//			System.out.println(searchList.get(i).getText());
//			
//		}
		for (WebElement webElement : searchList) {
			System.out.println(webElement.getText());
		}
	}

}
