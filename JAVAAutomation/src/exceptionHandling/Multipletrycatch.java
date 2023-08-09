package exceptionHandling;
public class Multipletrycatch {
	public static void main(String[] args) {
		try {
			System.out.println("****program start****");
			System.out.println(100/0);
		} catch (ArithmeticException e) {
		}
		try {
			int [] arr= {8,5};
			System.out.println(arr[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
		}
		System.out.println("****Program ends****");
	}
}
