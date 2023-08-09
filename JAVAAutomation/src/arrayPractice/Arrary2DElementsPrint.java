package arrayPractice;

public class Arrary2DElementsPrint {

	public static void main(String[] args) {
		
		int [][] x= {{3,5},{4,6},{7,8}};
		System.out.println("No.of rows :"+x.length);
		System.out.println("No.of common cloumns :"+x[0].length);
		for (int i=0;i<x.length ;i++) {
			
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}

}
