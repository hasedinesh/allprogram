package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Selenium1 {

	public static void main(String[] args) {
		System.setProperty("webdrivers.chrome.driver","./SeleniumJava/drivers/chromedriver.exe");
		
		ChromeDriver cd=new ChromeDriver();
		EdgeDriver ed=new EdgeDriver();
		FirefoxDriver fd=new FirefoxDriver();
	}

}
