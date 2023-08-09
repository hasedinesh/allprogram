package testt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class BO {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\SeleniumJavaUpdated\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	

	}
