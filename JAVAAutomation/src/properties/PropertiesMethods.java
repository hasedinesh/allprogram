package properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesMethods {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("abc.properties");
		p.load(fis);
		//for properties both key and value should be String Type.
		System.out.println(p);
		System.out.println(p.getProperty("Shlok"));//will return value of given property.
		p.setProperty("Advika", "Hase");
		System.out.println(p);
		FileOutputStream fos=new FileOutputStream("abc.properties");
		p.store(fos,"Hey how are you? lets start work!");
		System.out.println(p);
	}

}
