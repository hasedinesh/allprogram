package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateClassMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.zerodha.com");
		driver.manage().window().setSize(new Dimension(500, 400));
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Signup")).click();
		Thread.sleep(2000);
		//back navigation
		driver.navigate().back();
		Thread.sleep(2000);
		//forward navigation
		driver.navigate().forward();
		//navigate to another page
		driver.navigate().to("https://www.gmail.com");
		
	}

}
