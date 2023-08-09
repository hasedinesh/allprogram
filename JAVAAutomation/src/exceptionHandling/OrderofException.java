package exceptionHandling;
public class OrderofException {
	public static void main(String[] args) {
//		try {
//			System.out.println("****program start****");
//			System.out.println(100/0);
//		}
//		catch (Exception e) {
//			System.out.println("Exception");
//		}
//		catch (ArithmeticException e) {
//			System.out.println("ArithmaticException");
//		}
//	}
		try {
			System.out.println("****program start****");
			System.out.println(100/0);
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmaticException");
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
	}
}
