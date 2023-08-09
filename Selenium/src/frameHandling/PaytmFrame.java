package frameHandling;
import org.openqa.selenium.By;
import utility.SeleniumutilsNonStaticMethods;
public class PaytmFrame {

	public static void main(String[] args) {
	SeleniumutilsNonStaticMethods obj=new SeleniumutilsNonStaticMethods();
	obj.setup("https://www.paytm.com");
	SeleniumutilsNonStaticMethods.driver.findElement(By.xpath("//div[@class='_1YPz_']//span")).click();
	SeleniumutilsNonStaticMethods.driver.switchTo().frame(0);
	String heading=SeleniumutilsNonStaticMethods.driver.findElement(By.xpath("//p[text()=\"To Login into your Paytm Web account\"]")).getText();
	System.out.println("frame text is: "+heading);
	SeleniumutilsNonStaticMethods.driver.switchTo().defaultContent();
	SeleniumutilsNonStaticMethods.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div/a")).click();
	SeleniumutilsNonStaticMethods.driver.findElement(By.xpath("//div[@class=\"IA_rP\"]")).click();
	obj.mouseOverMethod(SeleniumutilsNonStaticMethods.driver.findElement(By.xpath("//a[@href=\"javascript://\"]")));
	
	}

}
