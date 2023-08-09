package exceptionHandling;
public class TryCatchFinally {
	public static void main(String[] args) {
		try {
            System.out.println("statement 1");
            System.out.println(34 / 0 +"statement 2");
            System.out.println("statement 3");
        }
        catch (ArithmeticException e) {
        	System.out.println("statement 4");  		
        }
        finally {  
        	System.out.println("Final");
        	System.out.println(50/0+"statement 5");
        }
		System.out.println("statement 6");
	}
}
