package general;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExerciseRahulShettyE2E {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value=\"user\"]")).click();
		
		WebDriverWait ewait= new WebDriverWait(driver, Duration.ofSeconds(10));
		ewait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();

		Select dropDown = new Select(driver.findElement(By.xpath("//select")));
		dropDown.selectByValue("consult");
		System.out.println(dropDown.getFirstSelectedOption().getText());;
		driver.findElement(By.xpath("//input[@id=\"terms\"]")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		ewait.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop"));
		
		List<WebElement> productList= driver.findElements(By.xpath("//app-card-list//a[text()]"));
		
		System.out.println(productList.size());
		//System.out.println(productList.get(0).getText());
		
		String [] requiredItem= {"iphone X","Samsung Note 8","Nokia Edge","Blackberrydd  "};
		
		for (int i=0;i<requiredItem.length;i++) {
			
			for(int j=0;j<productList.size();j++) {
			if (requiredItem[i].matches(productList.get(j).getText())) {
				driver.findElements(By.xpath("//button[@class=\"btn btn-info\"]")).get(j).click();
			}
			}
		}
		System.out.println(driver.findElement(By.xpath("//a[@class=\"nav-link btn btn-primary\"]")));
		driver.findElement(By.xpath("//a[@class=\"nav-link btn btn-primary\"]")).click();
		//driver.findElement(By.linkText("Checkout( "+ requiredItem.length +" )")).click();
		
		
	}

}
