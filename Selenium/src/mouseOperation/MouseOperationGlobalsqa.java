package mouseOperation;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseOperationGlobalsqa {
	//creating static variable "driver", as it is used for all methods.
	static WebDriver driver;
	static Actions action;//as action variable required in all mouse operation hence making it static so that all method can use directly.
	public static void main(String[] args) {
	setUp("https://www.globalsqa.com/demo-site/");
	//creating instance of Actions class	
//	Actions action=new Actions(driver);
	////Identifying element to right click and calling method to right click
	WebElement ebooks=driver.findElement(By.linkText("FREE EBOOKS"));
//	action.moveToElement(ebooks).perform();
	MouseOperationGlobalsqa.action= new Actions(driver);//creating Actions class instance and we can use static varibale with class name or also by directly.
	mouseOverAction(ebooks);
	//Identifying element to right click and calling method to right click
	WebElement cheatSheets=driver.findElement(By.linkText("CHEATSHEETS"));
	mouseRightClick(cheatSheets);
	//DoubleClick
	driver.navigate().to("https://www.saucedemo.com/");
	WebElement doubleclickname=driver.findElement(By.id("user-name"));
	doubleClick(doubleclickname);
	//identifying drag and drop element
//	setUp("https://demo.automationtesting.in/Static.html");
//	WebElement dragDropSource=driver.findElement(By.id("angular"));
//	WebElement dragDropTarget=driver.findElement(By.id("droparea"));
//	dragDrop(dragDropSource, dragDropTarget);
	}
	public static void setUp(String appUrl) {
	driver=new ChromeDriver();
	driver.get(appUrl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public static void mouseOverAction(WebElement webelement) {
	//creating instance of Actions class	
	action.moveToElement(webelement).perform();
	}
	public static void mouseRightClick(WebElement webelement) {
	action.contextClick(webelement).perform();
	}
	
	public static void doubleClick(WebElement dcelement) {
	dcelement.sendKeys("xyz");
	action.doubleClick(dcelement).perform();
	}
	public static void dragDrop(WebElement source,WebElement target) {
	action.clickAndHold(source).moveToElement(target).build().perform();
	//or
	action.dragAndDrop(source, target).perform();
	}
	
	
}
