package exceptionHandling;
public class RuntimestackMechanism {
	public static void main(String[] args) {
		stuff();
	}
	public static void stuff() {
		morestuff();
		System.out.println("Hello stuff");
	}
	public static void morestuff() {
		
		System.out.println("Hello morestuff");
	}
}
