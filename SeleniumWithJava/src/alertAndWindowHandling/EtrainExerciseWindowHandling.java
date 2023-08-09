package alertAndWindowHandling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.SeleniumutilsNonStaticMethods;;

public class EtrainExerciseWindowHandling {
	static WebDriver driver;//// to avoid repeating code declaring driver variable again

	public static void main(String[] args) throws InterruptedException {
		SeleniumutilsNonStaticMethods obj1 = new SeleniumutilsNonStaticMethods();// creating object to use methods of
																					// SeleniumutilsNonStaticMethods
																					// class
		obj1.setup("https://etrain.info/in");// calling setup method
		driver = SeleniumutilsNonStaticMethods.driver;// to save SeleniumutilsNonStaticMethods class driver variable
														// into current class
		String homeWindowId = driver.getWindowHandle();// to get home window ID
		System.out.println("Home window handleID: " + homeWindowId);
		SeleniumutilsNonStaticMethods.driver.findElement(By.xpath("//i[@class='icon-facebook']")).click();
		Set<String> allWindowHandles = driver.getWindowHandles();// To get all tab windowID
		Iterator<String> itr = allWindowHandles.iterator();// To get cursor for given set
		itr.next();// to get next handle
		driver.switchTo().window(itr.next());// to switch to child window
		System.out.println("child window handleID: " + SeleniumutilsNonStaticMethods.driver.getWindowHandle());
		Thread.sleep(5000);
		driver.findElement(By.linkText("About")).click();
		// driver.findElement(By.xpath("//*[@id=\"mount_0_0_lW\"]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div/div[4]/div/div/div/div[1]/div/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[2]/ul/li/div/div/div[1]/span")).getText();
		driver.close();
		driver.switchTo().window(homeWindowId);
		driver.findElement(By.id("cbafi1")).sendKeys("pune");
		driver.findElement(By.id("suggest_row1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cbafi2")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//div[@id=\"suggest_row2\"]")).click();
		driver.findElement(By.id("cbasbmtbtn")).click();
		Thread.sleep(5000);
		List<WebElement> allAvailableTrain = driver
				.findElements(By.xpath("//tr[@class=\"even\"]//td[@class=\"pd5 bx3_bgl nobr\"]"));// To get all train
																									// name
		System.out.println("Total train avaiilable are: " + allAvailableTrain.size());
		Iterator<WebElement> itrtrain = allAvailableTrain.iterator();// creating cursor to iterate over list element
		System.out.println("All train available are: ");
		while (itrtrain.hasNext()) {
			System.out.println(itrtrain.next().getText());
		}
		/********** or ***************/
		System.out.println("Train name by anothr logic");
		// by using dynamic xpath
		List<WebElement> rowElements = driver
				.findElements(By.xpath("//*[@id=\"lowerdata\"]/table/tbody/tr/td/div/table/tbody/tr[1]"));
		int rowSize = rowElements.size();// to get
		System.out.println("No.of Trains available are: " + rowSize);
		for (int i = 0; i < rowSize; i++) {
			System.out.println(driver
					.findElement(By.xpath(
							"//*[@id=\"lowerdata\"]/table/tbody/tr[" + (i + 4) + "]/td/div/table/tbody/tr[1]/td[1]"))
					.getText());
		}

	}
}
