package predefinedClass;

import java.util.Scanner;

public class ScannerClassPractice {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your name");
		//String name = scan.next();
		System.out.println("your good name is :" +scan.next());
		
		System.out.println("Enter your age");
		//int age=scan.nextInt();
		System.out.println("Your age is :" +scan.nextInt());
		
		System.out.println("Are u male true or false");
		boolean gender= scan.nextBoolean();
	}
}
