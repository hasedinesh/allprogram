package general;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 123405689;
		int rev = 0;
		while (n != 0) {
			int rem = n % 10;
			n = n / 10;
			rev = rev * 10 + rem;
		}
		System.out.println("Reversed number of is:" + rev);
	}

}
