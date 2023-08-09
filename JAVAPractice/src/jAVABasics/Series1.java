package jAVABasics;

public class Series1 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			int k = 1;
			for(int j=1;j<=i+1;j++) {
				
				System.out.print((i+1)*k);
				System.out.print(" ");
				k++ ;
			}
			System.out.println();
		}

	}

}
