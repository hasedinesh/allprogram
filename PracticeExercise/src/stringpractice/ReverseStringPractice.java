package stringpractice;

import java.util.Iterator;

public class ReverseStringPractice {

	public static void main(String[] args) {
		reverseByChar("Dinesh");
		reverseBySplit("Dinesh");
		StringBuffer sb=new StringBuffer("Dinesh Hase");
		reverseStringBuffer(sb);
	}

	
	static void reverseByChar(String s) {
		String rev="";
		for(int i=s.length()-1; i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}
	
	static void reverseBySplit(String s) {
		String[] s1= s.split("");
		String rev="";
		for (int i = s1.length-1; i >=0; i--) {
			rev=rev+s1[i];
		}
		System.out.println(rev);
	}
	
	static void reverseStringBuffer(StringBuffer sb) {
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
	}
}
