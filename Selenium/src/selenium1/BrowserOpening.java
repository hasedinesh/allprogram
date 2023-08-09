package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserOpening {

	public static void main(String[] args) {
		BrowserTypeMethod("chrome");
		BrowserTypeMethod("edge");
		BrowserTypeMethod("firefox");
	}
	
	static void BrowserTypeMethod(String Browsertype) {
		
		if(Browsertype.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.drivers", "./drivers/chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
			}else if(Browsertype.equalsIgnoreCase("edge")){
				System.setProperty("webdriver.edge.drivers", "./drivers/msedgedriver.exe");
				EdgeDriver cd=new EdgeDriver();
				}else {
					System.setProperty("webdriver.gecko.drivers", "./drivers/geckodriver.exe");
					FirefoxDriver cd=new FirefoxDriver ();
				}
		}	
}
