package alertAndWindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Seleniumutils;

public class alertHandle1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Seleniumutils.setup("https://demoqa.com/alerts");
		driver = Seleniumutils.driver;
		// 1) To click on simple alert button
		driver.findElement(By.id("alertButton")).click();
		// To switch to alert popup and get text of alert
		System.out.println(driver.switchTo().alert().getText());
		// Thread.sleep(2000);
		// to accept the confirmation popup
		driver.switchTo().alert().dismiss();

		// 2) To click on confirmation button
		driver.findElement(By.id("confirmButton")).click();
		// To switch to alert popup and get text of alert
		System.out.println(driver.switchTo().alert().getText());
		// Thread.sleep(2000);
		// to dismiss the confirmation popup
		driver.switchTo().alert().dismiss();
		System.out.println("Result: " + driver.findElement(By.id("confirmResult")).getText());

		// 3) To click on confirmation button
		driver.findElement(By.id("promtButton")).click();
		// To switch to alert popup and get text of alert
		System.out.println(driver.switchTo().alert().getText());
		// Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Thanks");
		// to dismiss the confirmation popup
		driver.switchTo().alert().accept();
		System.out.println("Result: " + driver.findElement(By.id("promptResult")).getText());

	}

}
