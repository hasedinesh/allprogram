package multipleElementsHandling;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MEHhttdemoautomationtesting {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		//identifying First Name Field
		WebElement firstNameField=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		//FirstNameField Validation and enter input
		System.out.println("is First Name field Displayed: "+firstNameField.isDisplayed());
		System.out.println("is First Name field Enabled: "+firstNameField.isEnabled());
		firstNameField.sendKeys("Dinesh");
		//identifying First Name Field
		WebElement LastNameField=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		//LastNameField Validation and enter input
		System.out.println("is Last Name field Displayed: "+LastNameField.isDisplayed());
		System.out.println("is Last Name field Enabled: "+LastNameField.isEnabled());
		LastNameField.sendKeys("Hase");
		//identifying Address Field
		WebElement AddressField=driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea"));
		//Address Validation and enter input
		System.out.println("is Address field Displayed: "+AddressField.isDisplayed());
		System.out.println("is Address field Enabled: "+AddressField.isEnabled());
		AddressField.sendKeys("At post wagholi, Pune");
		//identifying Email address Field
		WebElement EmailAddressField=driver.findElement(By.cssSelector("input[type='email']"));
		//EmailAddressField Validation and enter input
		System.out.println("is Last Name field Displayed: "+EmailAddressField.isDisplayed());
		System.out.println("is Last Name field Enabled: "+EmailAddressField.isEnabled());
		EmailAddressField.sendKeys("dineshhase2011@gmail.com");
		//identifying phone Field
		WebElement phoneField=driver.findElement(By.cssSelector("input[type='tel']"));
		//phoneField Validation and enter input
		System.out.println("is Last phone field Displayed: "+phoneField.isDisplayed());
		System.out.println("is Last phone field Enabled: "+phoneField.isEnabled());
		phoneField.sendKeys("9765419737");
		
		//identifying Gender radio button
		WebElement genderRadio=driver.findElement(By.xpath("//input[@type='radio' and @value='Male']"));
		System.out.println("is Gender radio button displayed: "+genderRadio.isDisplayed());
		System.out.println("is Gender radio button selected: "+genderRadio.isSelected());
		System.out.println("is Gender radio button Enabled: "+genderRadio.isEnabled());
		genderRadio.click();
		System.out.println("is Gender radio button selected: "+genderRadio.isSelected());
		
		//identifying and verifying Hobbies checkbox
		List<WebElement> hobbies=driver.findElements(By.xpath("//input[@type='checkbox' and @value='Hockey']//preceding::input[@type='checkbox']"));
		for (WebElement webElement : hobbies) {
			System.out.println("is "+webElement.getAttribute("value")+" hobbies checkbox button displayed: "+webElement.isDisplayed());
			System.out.println("is "+webElement.getAttribute("value")+" hobbies radio button selected: "+ webElement.isSelected());
			System.out.println("is "+webElement.getAttribute("value")+" hobbies radio button Enabled: "+ webElement.isEnabled());	
			webElement.click();
		}
		
		//Identifying skill DropDown element and verification
		WebElement skillDropdown=driver.findElement(By.xpath("//select[@id='Skills']"));
		Select skill=new Select(skillDropdown);
		System.out.println(skill.isMultiple());
		
		List<WebElement> skilloptions= skill.getOptions();
		System.out.println("No.of options are "+skilloptions.size());
		for (WebElement webElement : skilloptions) {
			System.out.println("List of skill options are: "+webElement.getText());
		}
		
		System.out.println(skill.getFirstSelectedOption().getText());
		skill.selectByValue("Excel");
		System.out.println(skill.getFirstSelectedOption().getText());
		
		
		
		
	}

}
