package general;

public class DuplicateElementArray {
	public static void main(String[] args) {
		int [] x= {10,20,50,20,80,10,30};
		
		for (int i = 0; i < x.length; i++) {
			
			for (int j = i+1; j < x.length; j++) {
				
				if (x[i]==x[j])
					System.out.println("The repeated numbers is: "+x[i]);
			}
			
		}
	}
}
