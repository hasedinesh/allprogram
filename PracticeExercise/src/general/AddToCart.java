package general;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> listOfItems = driver.findElements(By.xpath("//div[@class=\"product\"]/h4"));
		System.out.println(listOfItems.size());
		String[] itemsNeeded = { "Brocolli", "Beetroot", "Brinjal", "Potato" };
		List<String> listofItemsneeded = Arrays.asList(itemsNeeded);
		addItems(driver,listofItemsneeded, listOfItems);
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//button[text()=\"PROCEED TO CHECKOUT\"]")).click();
	}
//	    for(WebElement list:listOfItems)
//	    {
//	    	String [] name= list.getText().split("-");
//	    	String actualName=name[0].trim();
//	 System.out.println(actualName);
	static void addItems(WebDriver driver,List<String> listofItemsneeded, List<WebElement> listOfItems) throws InterruptedException {
		Iterator<WebElement> itr = listOfItems.iterator();
		int i = 0;
		int j = 0;
		while (itr.hasNext()) {
			String[] name1 = itr.next().getText().split("-");
			String actualName1 = name1[0].trim();
			if (listofItemsneeded.contains(actualName1)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				Thread.sleep(2000);
			}
			i++;
			
			if (j == listofItemsneeded.size()) {
				break;
			}
		}
	}
}
