package general;

public class MissingnumberfromArray1to1o {

	public static void main(String[] args) {

		int[] x= {1,2,3,4,5,6,7,9,10};
		
		int m=x.length +1;
		System.out.println(m);
		
		int sum=m*(m+1)/2;
		System.out.println(sum);
		int actSum=0;
		for (int i = 0; i<x.length; i++) {
			actSum=actSum+x[i];
		}
		System.out.println("Difference of sum and missig number is: "+(sum-actSum));
		

	}

}
