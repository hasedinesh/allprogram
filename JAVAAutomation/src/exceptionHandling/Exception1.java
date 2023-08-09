package exceptionHandling;
public class Exception1 {
	public static void main(String[] args) {
		
		try {
			System.out.println(100/0);//Risky Code
			/*or *********************
			int[] ar= {5,6,7,8};
			System.out.println(ar[4]);*/
			
		} catch (Exception e) {
			System.out.println(100/2);
		}
		
	}
}
