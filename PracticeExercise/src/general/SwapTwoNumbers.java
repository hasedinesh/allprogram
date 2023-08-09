package general;

import java.util.Scanner;

public class SwapTwoNumbers {

	static void swapWithoutThirdVariable(int n1, int n2) {
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("After swap --> n1= " + n1 + " " + "n1= " + n2);
	}

	static void SwapTwoNumbersWithThirdVariable(int n1, int n2) {
		int temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("After swap --> n1= " + n1 + " " + "n1= " + n2);
	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter two numbers to swap");
		int n1 = scr.nextInt();
		int n2 = scr.nextInt();
		swapWithoutThirdVariable(n1, n2);
		SwapTwoNumbersWithThirdVariable(n1, n2);

	}

}
