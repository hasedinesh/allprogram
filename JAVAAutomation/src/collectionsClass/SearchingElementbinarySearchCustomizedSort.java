package collectionsClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class SearchingElementbinarySearchCustomizedSort {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("K");
		l.add("a");
		//l.add(10);//ClassCastException:Non-homogeneous objects as we have added sort method later.
		//l.add(null);//NullPointerException: null not allowed as we have added sort method later.
		System.out.println("ArrayList before sorting: "+l);//[Z, A, M, K, a]
		Collections.sort(l, new MyComparatorForArrayListSearch());
		System.out.println("ArrayList after sorting: "+l);//[a, Z, M, K, A]
		System.out.println(Collections.binarySearch(l,"M", new MyComparatorForArrayListSearch()));//2
		System.out.println(Collections.binarySearch(l,"N", new MyComparatorForArrayListSearch()));//-3
		System.out.println(Collections.binarySearch(l,"K"));//Unpredictable
	}
}
	class MyComparatorForArrayListSearch implements Comparator {
	
	public int compare(Object obj1, Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();	
		return s2.compareTo(s1);	
	}
}

