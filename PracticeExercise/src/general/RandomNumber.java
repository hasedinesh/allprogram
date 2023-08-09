package general;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random n= new Random();
		System.out.println(n.nextInt(1000));
		System.out.println(n.nextInt(1000));
		System.out.println(n.nextInt(10));
		System.out.println(n.nextDouble(1000));
		

	}

}
