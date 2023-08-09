package arrayPractice;
public class AnnonymousArrayForSum {

	public static void main(String[] args) {
		AnnonymousArrayForSum obj= new AnnonymousArrayForSum();
		obj.sum(new int[] {10,20,80});

	}
	public void sum(int[] x){
		int total=0;
		for (int x1:x) {
			
			total = total+x1;
		}
		System.out.println("Sum of array Element= "+total);
	}
}
