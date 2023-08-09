package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteOpenCss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demosite.executeautomation.com/");
		System.out.println(driver.getTitle());
		
		WebElement getUNElement=driver.findElement(By.name("UserName"));
		
		getUNElement.sendKeys("execution");
		
		WebElement getPassElement =driver.findElement(By.name("Password"));
		
		getPassElement.sendKeys("admin");
		
	   WebElement loginButton=driver.findElement(By.cssSelector("input[name='Login']"));
	   
	   loginButton.click();
		
	   //Thread.sleep(2000);
	   WebElement logOutButton=driver.findElement(By.cssSelector("a[href='Login.html']"));
	   logOutButton.click();
	}

}
