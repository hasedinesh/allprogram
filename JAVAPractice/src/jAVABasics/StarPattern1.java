package jAVABasics;

public class StarPattern1 {

	public static void main(String[] args) {
		
		pattern1(5);
		pattern2(5);
		pattern3(5);
		patterncombined(5);
	}

	static void pattern1(int n) {
		for (int row=1;row<=n;row++) {
			for (int col=1; col<=row;col++) { //for row 1= no. of column is 1 i.e. for each row, no. of column = no.of row 
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	static void pattern2(int n) {
		for (int row=1;row<=n;row++) {
			
			for (int col=1;col<=n-row+1;col++) {  // column in row 1= total coloumn or row - position of row +1
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
		static void pattern3(int n) {
			for (int row=1;row<=n;row++) {
				for (int col=1; col<=row;col++) { //for row 1= no. of column is 1 i.e. for each row, no. of column = no.of row 
					System.out.print(col+ " ");
				}
				System.out.println();
			}
		}
		
		static void patterncombined(int n) {
			for (int row=1; row<=n;row++) {
				for (int col = 1; col <=row; col++) {
					System.out.print("* ");
				}
			System.out.println();
			}
			
			for(int row=1;row<=n-1;row++) {
				for (int col=1;col<=(n-1-row-1);col++) {
					System.out.println("* ");
				}
				System.out.println();
			}
			
		}
		
	
}
