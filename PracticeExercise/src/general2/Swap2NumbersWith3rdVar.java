package general2;
public class Swap2NumbersWith3rdVar {
	public static void main(String[] args) {
		int n1 = 45;
		int n2 = 3;
		swapWith3rdVariable(n1, n2);
		swapWithout3rdVar(n1, n2);
	}
	static void swapWith3rdVariable(int n1, int n2) {
		int temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("Swapped numbers are--> n1: " + n1 + " and n2: " + n2);
	}

	static void swapWithout3rdVar(int n1, int n2) {
		
		n1=n1+n2; 
		n2=n1-n2; 
		n1=n1-n2;
		System.out.println("Swapped numbers are--> n1: " + n1 + " and n2: " + n2);
	}
}
