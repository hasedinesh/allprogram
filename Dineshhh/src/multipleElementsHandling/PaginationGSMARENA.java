package multipleElementsHandling;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PaginationGSMARENA {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.gsmarena.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		driver.findElement(By.cssSelector("a[href=\"apple-phones-48.php\"]")).click();	
		List<WebElement> pagination=driver.findElements(By.xpath("//div[@class=\"nav-pages\"]/a"));	
		int countOfPagination=pagination.size()+1;	
		if(countOfPagination>1) { //to check whether pagination available or not
			System.out.println("pagination available and total pagination are " +countOfPagination );
			
			for (WebElement webElement : pagination) { //to print pagination number and link
				System.out.println("Pagination number: "+webElement.getText()+" "
						           +" and Link of pagination is "+webElement.getAttribute("href"));
			}
		}
	}
}
