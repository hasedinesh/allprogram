package exceptionHandling;
public class ThiswithStaticVariable {
	static ArithmeticException e1= new ArithmeticException("demo");
	//static ArithmeticException e;
	public static void main(String[] args) {
		throw e1;
		//throw e;
	}
}
