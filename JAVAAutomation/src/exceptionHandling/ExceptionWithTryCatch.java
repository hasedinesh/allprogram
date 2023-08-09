package exceptionHandling;
public class ExceptionWithTryCatch {
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println(2*20);
		System.out.println(5/2);
		try {
			System.out.println(100/0);//Risky code inside try block.
		}
		catch (ArithmeticException e){
			System.out.println(100/2);
		}
		System.out.println("0");
		System.out.println("0");
	}
}
