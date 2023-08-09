package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebElementValidationMethods {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();	
		driver.get("https://demo.actitime.com");	
		//Validation of Element of UserName Field
		WebElement userNameField=driver.findElement(By.id("username"));	
		System.out.println("whether UserNameField is displayed :" +userNameField.isDisplayed());
		System.out.println("whether UserNameField is Enabled :" +userNameField.isEnabled());
		//Validation of checkbox
		WebElement keepCheckBox =driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println("whether UserNameField is displayed :" +keepCheckBox.isSelected());
		keepCheckBox.click();
		System.out.println("whether UserNameField is displayed :" +keepCheckBox.isSelected());
		
		//To find attribute value of WebElement from attribute name
		//Ex: <input type="text" name="username" value="" id="username" class="textField" placeholder="Username">
		System.out.println(userNameField.getAttribute("type"));//text
		System.out.println(userNameField.getAttribute("name"));//username
		System.out.println(userNameField.getAttribute("value"));//blank
		System.out.println(userNameField.getAttribute("id"));//username
		System.out.println(userNameField.getAttribute("class"));//textfield
		System.out.println(userNameField.getAttribute("placeholder"));//Username
		
		//to get inner text or button name
		WebElement keepmeloggedinlabel=driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println(keepmeloggedinlabel.getText());
		
		WebElement loginButton= driver.findElement(By.id("loginButton"));
		System.out.println(loginButton.getText());
			
	}

}
