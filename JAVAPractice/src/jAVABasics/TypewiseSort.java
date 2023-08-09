package jAVABasics;

import java.util.Arrays;

public class TypewiseSort {

	public static void main(String[] args) {
		String s="cddjhfdjlccxknkv";
		sortAndRemoveDuplicate(s);
		RemoveDuplicateInBuiltMethod(s);
		
	}


	static void sortAndRemoveDuplicate(String s) {

		char[] ch= s.toCharArray();

		for(int i=0;i<s.length();i++) {

			for (int j=i;j<s.length()-1;j++) {
				if(ch[i]>ch[j+1]) {
					char temp=ch[j+1];
					ch[j+1]=ch[i];
					ch[i]=temp; 
				}
			}
		}
		String s1= String.valueOf(ch);
		System.out.println(s1);
		StringBuilder s2= new StringBuilder();
		char prev=' ';
		for(int i=0;i<s1.length();i++) {
			if(prev!=s1.charAt(i)) {
				s2.append(s1.charAt(i));
				prev=s1.charAt(i);
				
			}
		}
		//s2.append(ch[s1.length()-1]);
		System.out.println(s2);
	}

	static void RemoveDuplicateInBuiltMethod(String s) {
		String newstr="";
		char prevchar=' ';
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		String s1=String.valueOf(ch);
		System.out.println(s1);
		//String s1= new String(ch);
		//System.out.println(s1);
		
		
		for(int i=0;i<s1.length();i++) 
		{
			if(prevchar!=s1.charAt(i)) 
			{
				newstr=newstr+s1.charAt(i);
				prevchar=s1.charAt(i);
			}
		}
		System.out.println(newstr);
	}
}

