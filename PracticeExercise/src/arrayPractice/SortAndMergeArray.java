package arrayPractice;

import java.util.Arrays;

public class SortAndMergeArray {
	public static void main(String[] args) {
		int[] a = { 5, 1, 9, 4,0,56 };
		int[] b = { 20, 2, 14, 3,89,56 };
		// arraysSortMerge(a,b);
		sortLogic(a);
		sortLogic(b);
		mergeLogic(a,b);
	}

	static void arraysSortMerge(int[] x, int[] y) {
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		Arrays.sort(y);
		System.out.println(Arrays.toString(y));
		int clen = x.length + y.length;
		int[] c = new int[clen];
		System.arraycopy(x, 0, c, 0, x.length);
		System.arraycopy(y, 0, c, x.length, y.length);
		System.out.println(Arrays.toString(c));
	}
	static void sortLogic(int[] x) {
		for (int i = 0; i < x.length - 1; i++) {
			if (x[i] > x[i + 1]) {
				int temp = x[i];
				x[i] = x[i + 1];
				x[i + 1] = temp;
				i = -1;
			}
		}
		System.out.println(Arrays.toString(x));
	}
	static void mergeLogic(int [] m, int[] n) {
		
		int[] c= new int [m.length+n.length];
		
		for(int i=0;i<c.length;i++) {
			if(i<m.length) 
			{
				c[i]=m[i];
			}
			if(i>=m.length) 
			{
				c[i]=n[i-m.length];
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
