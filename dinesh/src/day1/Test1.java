package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test1 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.edge.driver", "D:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");
		
	}

}
