package exceptionHandling;
public class RunTimeException1 {
	public static void main(String[] args) {
		stuff();
	}
	public static void stuff() {
		morestuff();
		System.out.println("Hello stuff");
	}
	public static void morestuff() {
		System.out.println(10/0);
		System.out.println("Hello morestuff");
	}
}
