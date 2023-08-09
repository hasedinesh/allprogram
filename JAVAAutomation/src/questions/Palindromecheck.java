package questions;
import java.util.Scanner;
public class Palindromecheck {
	public static void main(String[] args) {
		System.out.println("Enter String to check Paligrome: ");
		try (Scanner scr = new Scanner(System.in)) {
			System.out.println(Palindromecheck.palindrome(scr.next()));
		}
	}
	public static String palindrome(String str) {
		String temp="";
		String origial=str;
		for (int i =str.length()-1; i>=0; i--) {
			temp=temp+str.charAt(i);
		}
		System.out.println("reversed String is: "+ temp+ " and original was: "+str);
		if(origial.equalsIgnoreCase(temp)) 
			return "The given string is palindrome";
		else
			return "The given string is not palindrome";
	}
}
