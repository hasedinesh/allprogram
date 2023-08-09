package mouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.Seleniumutils;

public class MouseopTest1 {
//By implementing static methods of class from another package with that class reference
	public static void main(String[] args) throws InterruptedException {
		Seleniumutils.setup("https://www.amazon.in/");
		Seleniumutils.action=new Actions(Seleniumutils.driver);
		WebElement mouseoverElement=Seleniumutils.driver.findElement(By.linkText("Prime"));
		Seleniumutils.mouseOverOperation(mouseoverElement);
		Thread.sleep(2000);
		WebElement searchField=Seleniumutils.driver.findElement(By.id("twotabsearchtextbox"));
		searchField.sendKeys("Mobile");
		//Seleniumutils.driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div[1]/div"));
		Seleniumutils.doubleclickmethod(searchField);
	
		
	}

}
