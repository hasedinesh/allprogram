package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabOpeningWebsite {

	public static void main(String[] args) {
		
		//creating instance of chromedriver class and upcast it to webdriver interface.
		WebDriver browser=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//open required webpage
		browser.get("https://www.google.com");
		//get page title
		System.out.println("Current page title is: "+browser.getTitle());
		//to get current URL
		System.out.println("Current URL is: "+browser.getCurrentUrl());
		//to get page source
		System.out.println("page source is: "+browser.getPageSource());
		//close browser
		browser.close();

		

	}

}
