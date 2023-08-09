package arrayPractice;

public class SortArrayWithoutInbuiltMethodSingleFor {

	static void sortArray(int[] arrayToSort) {

		for (int i = 0; i < arrayToSort.length - 1; i++) {

			if (arrayToSort[i] > arrayToSort[i + 1]) {
				int temp = arrayToSort[i];
				arrayToSort[i] = arrayToSort[i + 1];
				arrayToSort[i + 1] = temp;
				i = -1;
			}
		}
		for (int x : arrayToSort) {
			System.out.print(x + " ");
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 10, 5, 15 };
		int b[] = { 20, 0, 2 };
		System.out.print("Sorted array a: ");
		sortArray(a);
		System.out.println("");
		System.out.print("Sorted array b: ");
		sortArray(b);
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		System.out.println("");
		for (int i = 0; i < b.length; i++) {
			c[i + a.length] = b[i];
		}
		System.out.println("");
		System.out.println("Sorted array c: ");
		sortArray(c);

	}

}
