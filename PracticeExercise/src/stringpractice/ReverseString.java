package stringpractice;

public class ReverseString {

	
	public static void main(String[] args) {
		System.out.println(reversByCharAt("Dinesh Hase"));
		reversByChar("Dinesh");
		System.out.println("");
		ReverseString.reverseByCharArray("Dinesh");
		System.out.println("");
		StringBuffer sbReverse=new StringBuffer("Dinesh");
		ReverseString.reverseByStringBuffer(sbReverse);
		StringBuilder sbdReverse=new StringBuilder("Dinesh");
		ReverseString.reverseByStringBuilder(sbdReverse);
	}
	
	//with charAt method of string class and using one rev string object;
	static String reversByCharAt(String toReverse) {
		String rev="";
		for (int i=toReverse.length()-1;i>=0;i--) {
			
			rev=rev+toReverse.charAt(i);
		}
		return rev;
		
		}
	
	//with charAt method of string class and without using any extra string object;
	static void reversByChar(String toReverse) {
		//String rev="";
		for (int i=toReverse.length()-1;i>=0;i--) {
			
			System.out.print(toReverse.charAt(i));
		}
		
	}
	
	 //By using char array method of string
	static void reverseByCharArray(String toReverse) {
		char[] x=toReverse.toCharArray();
		
		for (int i=x.length-1;i>=0;i--) {
			System.out.print(x[i]);
		}
	}
	
	static void reverseByStringBuffer(StringBuffer toReverse) {
		System.out.println(toReverse.reverse());
	}
	
	static void reverseByStringBuilder(StringBuilder toReverse) {
		System.out.println(toReverse.reverse());
	}
	}
