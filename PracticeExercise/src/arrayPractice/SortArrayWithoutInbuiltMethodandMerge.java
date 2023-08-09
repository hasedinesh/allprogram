package arrayPractice;

public class SortArrayWithoutInbuiltMethodandMerge {
	public static void main(String[] args) {
		int a[] = { 1, 10, 5, 15 };
		int b[] = { 20, 0, 2 };

		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] > a[i + 1]) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
				i = -1;
			}
		}
		for (int i = 0; i < b.length - 1; i++) {
			if (b[i] > b[i + 1]) {
				int temp = b[i];
				b[i] = b[i + 1];
				b[i + 1] = temp;
				i = -1;
			}
		}
		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println("");
		for (int x : b) {
			System.out.print(x + " ");
		}
		
		int [] c=new int [a.length+b.length];
		for (int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		System.out.println("");
		for (int i=0;i<b.length;i++) {
			c[i+a.length]=b[i];
		}
		
		for (int x :c) {
			System.out.print(x + " ");
		}
	}

	 
}
