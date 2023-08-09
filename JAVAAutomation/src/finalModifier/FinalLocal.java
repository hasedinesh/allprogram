package finalModifier;

public class FinalLocal {

	public static void main(String[] args) {

	 // m1(10);
	  m2(20);
	  m3();
	  m4();
	}
	
//	static void m1 (final int x) { //we can only use final non-access modifier in local block.
//		int x=10;                 // This will give compile time error saying reassignment of final veriable is not allowed.
//		System.out.println(x);
//		}
	static void m2 (final int x) {
		System.out.println(x);
		}
	static void m3 () {
		final int x3=10;
		System.out.println(x3);
		}
	static void m4 () {
		final int x3; //here we will not get compile time error because we have not used variable x3 anywhere although 
		}                             //we have not initialize that.
//	static void m5() {
//		final int x5; // here we will get compile time error because we have used final x5 variable but we have not initialized.
//		System.out.println(x5);
//	}
	
}





 























