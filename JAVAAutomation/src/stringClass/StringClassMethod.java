package stringClass;

public class StringClassMethod {

	public static void main(String[] args) {
		String s="Core Java Basics";
				//or
		//String s=new String("CoreJavaBasics");
		
		System.out.println("Lenth of String is : "+s.length());
		
		System.out.println("Character at 5th index : "+s.charAt(5));
		
		System.out.println("Substring from 5th Index: "+s.substring(5));
		
		System.out.println("Substring Basics : " +s.substring(10,14));
		
		String s1="Selenium";
		
		System.out.println("Concatanation of s and s1 string literals : "+s.concat(" "+s1));
		//or
		System.out.println("Concatanation of s and s1 string literals : "+s+" "+s1);
		
		System.out.println("starting Index of string Basi  "+s.indexOf("Basi"));
		
		System.out.println("Starting index of 'a' counting from 9th index: "+s.indexOf("a",9));
		
		String s2="Java";
		String s3="java";
		String s4="Java";
		System.out.println("s2 and s3 are equal: "+s2.equals(s3)); //false
		System.out.println("s2 and s4 are equal: "+s2.equals(s4)); //true
		System.out.println("with ignoring case, s2 and s3 are equal : "+s2.equalsIgnoreCase(s3)); //true
		
		String s5="SEleNiuM";
		
		System.out.println("after lowercase of s5: "+s5.toLowerCase());//selenium
		
		String s6="  Java   Core Basics   ";
		System.out.println("Trimmed s6 String literal is: "+ s6.trim());//Java   Core Basics);
		
		String s7="Woman";
		System.out.println("After replacing a with e: " +s7.replace('a', 'e'));
		
		
	}

}
