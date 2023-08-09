package jAVABasics;

public class StarPatternMain {

	public static void main(String[] args) {
		System.out.println("1) ");
		starPattern1(5);
		System.out.println();
		System.out.println();
		System.out.println("2) ");
		starPattern2(5);
		System.out.println();
		System.out.println();
		System.out.println("3) ");
		starPattern3(5);
		System.out.println();
		System.out.println();
		System.out.println("4) ");
		starPattern4(5);
		System.out.println();
		System.out.println();
		System.out.println("5) ");
		starPattern5(5);
	}
	
/*--------------------------------------------------
 * 		* 
 		* * 
 		* * * 
 		* * * * 
 		* * * * * 
 * 
 */
	static void starPattern1(int n) {
	for (int i=1;i<=n;i++) {
		
		for (int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	}


	/*--------------------------------------------------
	 * 		* * * * * 
	 		* * * * 
	 		* * * 
	 		* * 
	 		*  
	 * 
	 */

	static void starPattern2(int n) {
		for (int i=1;i<=n;i++) {
			for (int j=n;j>=i;j--) {
				System.out.print("* ");
			}
		System.out.println();
		}
	}



/*--------------------------------------------------
 * 		* 
 		* * 
 		* * * 
 		* * * * 
 		* * * * * 
 		* * * * 
 		* * * 
 		* * 
 		*  
 * 
 */

	static void starPattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i=1;i<=n;i++) {
			for (int j=n-1;j>=i;j--) {
				System.out.print("* ");
			}
		System.out.println();
		}
		
	}

	/*4) --------------------------------------------------
	*				        * 
					      * * 
					    * * * 
					  * * * * 
					* * * * *  
	 * 
	 */
	static void starPattern4(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	/*5) --------------------------------------------------
	*				        * 
					      * * 
					    * * * 
					  * * * * 
					* * * * *  
	 * 
	 */
	
	static void starPattern5(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println("");

			}
	}
}






