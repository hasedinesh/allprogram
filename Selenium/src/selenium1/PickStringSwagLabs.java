package selenium1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PickStringSwagLabs {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		//open the URL
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//finding the usernames from page
		WebElement username=driver.findElement(By.xpath("//div[@id=\"login_credentials\"]"));
		//System.out.println(username.getText());
		String allUsername=username.getText();
		String[] usernameArray= allUsername.split("\n");
		System.out.println(usernameArray.length);
		for(String UN:usernameArray) {
			//usernames
			System.out.println(UN.toString());
		}
		//or
//		String username1=username.getText().split("\n")[1];//direct way
//		String username2=username.getText().split("\n")[2];
		WebElement usernameField=driver.findElement(By.id("user-name"));
		usernameField.sendKeys(usernameArray[1].toString());
		
		//getting password
		WebElement passwordElement=driver.findElement(By.xpath("//div[@class=\"login_password\"]"));
		String password=passwordElement.getText().split("\n")[1];
		//locating passwordField
		driver.findElement(By.id("password")).sendKeys(password);
		
		//locating login button element
		driver.findElement(By.id("login-button")).click();
		
		//adding item1 to cart
		//locate first item to add in cart
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		//loacte price element and convert from string to integers
		String item1price=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();
		item1price=item1price.replaceAll("[^0-9 and .]", "");
		System.out.println(item1price);
		double price1=Double.parseDouble(item1price);
		System.out.println(price1);
	
		//adding item2 to cart
		//locate first item to add in cart
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		//locate price element and convert from string to integers
		String item2price=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div")).getText();
		item2price=item2price.replaceAll("[^0-9 and .]", "");
		System.out.println(item2price);
		double price2=Double.parseDouble(item2price);
		System.out.println(price2);
		
		//go to cart
		WebElement shoppingCart= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		shoppingCart.click();
		
		//checkout
		driver.findElement(By.id("checkout")).click();
		//locating input field
		driver.findElement(By.id("first-name")).sendKeys("Dinesh");
		driver.findElement(By.id("last-name")).sendKeys("HAse");
		driver.findElement(By.id("postal-code")).sendKeys("412205");
		driver.findElement(By.id("continue")).click();
		
		//locating total price element
		String totalPrice=driver.findElement(By.xpath("//div[@class='summary_info_label summary_total_label']")).getText();
		System.out.println(totalPrice);
		totalPrice=totalPrice.replaceAll("[^0-9 and . and   ]","");
		totalPrice=totalPrice.replace("a","");
		double totalPriceint= Double.parseDouble(totalPrice);
		System.out.println(totalPriceint);
		
		//taxvalue element
		String taxPrice=driver.findElement(By.xpath("//div[@class='summary_tax_label']")).getText();
		System.out.println(taxPrice);
		taxPrice=taxPrice.replaceAll("[^0-9 and . and   ]","");
		taxPrice=taxPrice.replace("a","");
		double taxPriceint= Double.parseDouble(taxPrice);
		System.out.println(taxPriceint);
		
		
		Double sumofTotalActual=price1+price2+taxPriceint;
		
		if (sumofTotalActual==totalPriceint) {
			System.out.println("The given Total label amount is correct");
			
		} else {
			System.out.println("The given Total label amount is not correct");
		}
	}

}
