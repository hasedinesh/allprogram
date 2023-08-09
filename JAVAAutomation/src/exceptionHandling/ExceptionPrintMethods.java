package exceptionHandling;

public class ExceptionPrintMethods {

	public static void main(String[] args) {
		
		try {
			
			System.out.println(100/0);  //Risky Code
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		

	}

}
