package testngAnnotations;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utility.SeleniumutilsNonStaticMethods;

public class ScreenShot1 {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		SeleniumutilsNonStaticMethods obj1= new SeleniumutilsNonStaticMethods();
		obj1.setup("https://www.google.com");
		driver=SeleniumutilsNonStaticMethods.driver;
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("D:\\Selenium\\testngProject\\test-output\\Screenshot\\googleHomepage.png"));

	}

}
