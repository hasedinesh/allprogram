package arrayPractice;

public class SortArrayWithoutInbuitMethodDoubleForLoop {

	public static void main(String[] args) {
		
		int[] a= {10,5,2,6,1,45,5,8,9,7};	    // 5,10,2,6,1
		//int[] b= {10,5,20,6};	

		for(int i=0;i<a.length;i++){ //i=0
			
			for (int j=i;j<a.length-1;j++) { //Here we uses a.length-1 because in body we used i+1 else it will give IndexOutOfBoundException
			                                     //also we used j=1 because for next loop we need not to start comparision from 0.
			if(a[i]>a[j+1]) { //a0=5     a2=2
				
				int temp=a[i]; //temp=5
				a[i]=a[j+1];  //a0=2
				a[j+1]=temp;   //a1=5
			}
			
			}
		}
		for (int x1:a) {
			
			System.out.print(x1 +" ");
		}
		
		}
}
