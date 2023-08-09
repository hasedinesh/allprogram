package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementLocators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		driver.get("https://www.facebook.com");
		
		//By is predefined class is selenium and all its method are static and are known as locators.
		//Selenium supports following types of locators
		//id,name,linkText,partialLinktext,className,tagName, cssSelector, xPath
		//locate username field web element
		WebElement usernamefield=driver.findElement(By.id("email"));
		/*Actions:all the below actions can be performed on WebElement.
		 * Enter String -->sendKeys,
		 * Click -->click();
		 * clearing existing value from the field -->clear();
		 */
		usernamefield.sendKeys("hasedinesh");
		
		//locating password field web element.
		WebElement passwordfield=driver.findElement(By.id("pass"));
		
		passwordfield.sendKeys("9552352154");
		
		WebElement loginButton=driver.findElement(By.name("login"));
		
		loginButton.click();
	
		WebElement logout=driver.findElement(By.partialLinkText("https://scontent.fpnq7-3.fna.fbcdn.net/v/t39.30808-1/299115266_5516468638418522_5273557500974981529_n.jpg?stp=cp0_dst-jpg_p60x60&_nc_cat=101&ccb=1-7&_nc_sid=7206a8&_nc_ohc=QnzKFiS1NQwAX96VHqN&_nc_ht=scontent.fpnq7-3.fna&oh=00_AfDksr9VCuy1oQaOcmltun3BhCosKskVawaVl_Igey_RYA&oe=64040865"));
		logout.click();
	}

}
