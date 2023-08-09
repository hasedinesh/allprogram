package alertAndWindowHandling;
import java.net.SocketException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.SeleniumutilsNonStaticMethods;
public class WindowHandling1 {
	static WebDriver driver;
	public static void main(String[] args) {
		SeleniumutilsNonStaticMethods obj1=new SeleniumutilsNonStaticMethods();
		obj1.setup("https://demoqa.com/browser-windows");
		driver=SeleniumutilsNonStaticMethods.driver;
		//To get ID of hometab
		String homeWindowId=driver.getWindowHandle();
		System.out.println("ID of home tab is: :"+homeWindowId);
		System.out.println(driver.getCurrentUrl());
		System.out.println("Home Window ID is: "+homeWindowId);
		//To find element
		driver.findElement(By.id("tabButton")).click();
		//to get all tab ID
		Set<String> allWindowID=driver.getWindowHandles();
		System.out.println("All window ID's are: "+allWindowID);
		//To move across all tab create cursor of Iterator interface(Iterator support any type of object)
		Iterator<String> itr=allWindowID.iterator();
		System.out.println(itr.next());
		//To move to second tab either we can remove home tab or we can type itr.next two times. 
		//itr.remove(homeWindowId);
		//System.out.println(itr.next());
		driver.switchTo().window(itr.next());//itr.next will move cursor to second windowID.
		System.out.println(driver.getCurrentUrl());
		//to close current child tab
		//driver.close();
		//System.out.println(driver.getCurrentUrl());//this will give NoSuchWindowException as window is closed.
		//when  we close current tab then driver will not automatically move to original home tab.We neet to switch again to hometab.
		driver.switchTo().window(homeWindowId);
		System.out.println("Main tab ID is: "+driver.getCurrentUrl());
		//driver.close();
		//we can close all window at a time 
		driver.quit();
		
	}

}
