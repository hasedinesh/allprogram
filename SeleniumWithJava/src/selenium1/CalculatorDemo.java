package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.calculator.net/bmi-calculator.html");
		
		WebElement age=driver.findElement(By.id("cage"));
		age.clear();
		Thread.sleep(2000);
		age.sendKeys("28");
		
		WebElement radio=driver.findElement(By.xpath("//*[@id=\"calinputtable\"]/tbody/tr[2]/td[2]/label[2]/span"));
		radio.click();
		
		WebElement height=driver.findElement(By.id("cheightmeter"));
		height.clear();
		Thread.sleep(2000);
		height.sendKeys("163");
		WebElement weight=driver.findElement(By.id("ckg"));
		weight.clear();
		Thread.sleep(2000);
		weight.sendKeys("72");
		
		driver.findElement(By.cssSelector("input[value='Calculate']")).click();
		
	}

}
