package general;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiInputScannerPrimeNumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("How many prime number u want to check? ");
		int n = scr.nextInt();
		System.out.println("Enter " + n + " numbers for checking prime number");
		ArrayList<Integer> alst = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			Integer intObj = (Integer) scr.nextInt();
			alst.add(intObj);
		}
		System.out.println(alst);
		for (int j = 0; j < alst.size(); j++) {
			int count = 0;
			for (int i = 2; i < alst.get(j); i++) {
				if (alst.get(j) % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(alst.get(j)+" is prime");
			} else {
				System.out.println(alst.get(j)+" is not prime");
			}
		}
	}

}
