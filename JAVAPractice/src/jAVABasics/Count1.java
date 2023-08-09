package jAVABasics;

public class Count1 {

	public static void main(String[] args) {

		String s= "AA BBB CC DDD";
		String[] arr=s.split(" ");
		//System.out.println(arr[0]);
		
		for (String arr1: arr) {
			
			System.out.print(arr1.charAt(0)+""+arr1.length());
			System.out.print(" ");
			
			//char s2= arr1.charAt(0);
			
			
			
		}
		
	

	}

}
