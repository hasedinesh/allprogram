package general;
import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> listOfItems = driver.findElements(By.xpath("//div[@class=\"product\"]/h4"));
		System.out.println(listOfItems.size());
		List<WebElement> e =driver.findElements(By.xpath("//button[text()=\"ADD TO CART\"]"));
		String[] itemsNeeded = {"Brocolli","Cashews","Walnuts","Walnuts","Brocolli"};
		// List<String> listofItemsneeded = Arrays.asList(itemsNeeded);
		addItems(driver, itemsNeeded, listOfItems,e);
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//button[text()=\"PROCEED TO CHECKOUT\"]")).click();
	}
	static void addItems(WebDriver driver, String[] itemsNeeded, List<WebElement> listOfItems,List<WebElement>  e)
			throws InterruptedException {
		int k = 0;
		for (int i = 0; i < itemsNeeded.length; i++) {
			l1: for (int j = 0; j < listOfItems.size(); j++) {
				String[] name = listOfItems.get(j).getText().split("-");
				String name1 = name[0].trim();
				
				if (itemsNeeded[i].contains(name1)) {
					System.out.println(itemsNeeded[i]+name1);
					Thread.sleep(2000);
					System.out.println(driver.findElements(By.xpath("//div[@class='product-action']/button")).get(j).getText());
					//List<WebElement> e =driver.findElements(By.xpath("//div[@class='product-action']/button"));
					WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='product-action']/button")));
					e.get(j).click();						
					k++;
					break l1; 
				}
				if (k == itemsNeeded.length) {
					break;
				}
			}
		}
	}
}
