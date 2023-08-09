package collectionsClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ArraysSorting {
	public static void main(String[] args) {
		System.out.println("******Sorting of Primitive int array*******");
		int [] a= {10,5,1,20,3};
		System.out.println("int array Before sorting: ");
		for (int x:a) {
			
			System.out.print(x+"\t");
		}
		System.out.println("");
		Arrays.sort(a);
		System.out.println("int array After sorting: ");
		for (int x:a) {
			
			System.out.print(x+"\t");
		}
		
		//********************************************
		System.out.println("");
		System.out.println("******Sorting of Object array*******");
		String [] s= {"Dinesh","Shlok","Advika","Swanandi"};
		System.out.println("int array Before sorting: ");
		for (String x:s) {
			
			System.out.print(x+"\t");
		}
		System.out.println("");
		Arrays.sort(s);
		System.out.println("int array After sorting: ");
		for (String x:s) {
			
			System.out.print(x+"\t");
		}
		
		//********************************************
		System.out.println("");
		System.out.println("******Sorting of Object array by customized sorting using Comparator*******");
		String [] st= {"Dinesh","Shlok","Advika","Swanandi"};
		System.out.println("int array Before sorting: ");
		for (String x:st) {
			
			System.out.print(x+"\t");
		}
		System.out.println("");
		Arrays.sort(st,new MyComparatorArray());
		System.out.println("int array After sorting: ");
		for (String x:st) {
			
			System.out.print(x+"\t");
			}
}

}


class MyComparatorArray implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
	
	
}

