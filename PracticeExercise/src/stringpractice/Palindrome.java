package stringpractice;

public class Palindrome {
		
		public static void main(String[] args) {
			System.out.println(palindromeByCharAt("Dinesh Hase"));
			palindromeByChar("Dinesh");
			System.out.println("");
			Palindrome.palindromeByCharArray("MAMA");
			System.out.println("");
			StringBuffer sbReverse=new StringBuffer("Madam");
			Palindrome.palindromeByStringBuffer(sbReverse);
			StringBuilder sbdReverse=new StringBuilder("Dinesh");
			Palindrome.palindromeByStringBuilder(sbdReverse);
		}
		
		//with charAt method of string class and using one rev string object;
		static String palindromeByCharAt(String toREverse) {
			String rev="";
			for (int i=toREverse.length()-1;i>=0;i--) {
				
				rev=rev+toREverse.charAt(i);
			}
			if (toREverse.equalsIgnoreCase(rev)) 
				System.out.println("Given word is pailndrome");
				
			else
				System.out.println("Given word is not  pailndrome");
			return rev;
			}
		
		//with charAt method of string class and without using any extra string object;
		static void palindromeByChar(String toREverse) {
			//String rev="";
			for (int i=toREverse.length()-1;i>=0;i--) {
				
				System.out.print(toREverse.charAt(i));
			}
			
			
		}
		
		 //By using char array method of string
		static void palindromeByCharArray(String toReverse) {
			char[] x=toReverse.toCharArray();
			
			for (int i=x.length-1;i>=0;i--) {
				System.out.print(x[i]);
			}
		}
		
		static void palindromeByStringBuffer(StringBuffer toReverse) {
			System.out.println(toReverse.reverse());
		}
		
		static void palindromeByStringBuilder(StringBuilder toReverse) {
			System.out.println(toReverse.reverse());
		}
		}
