package collectionsClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class CollectionsClassCustomizedSort {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("A");
		l.add("C");
		l.add("Z");
		l.add("B");
		l.add("X");
		//l.add(10);//ClassCastException:Non-homogeneous objects as we have added sort method later.
		//l.add(null);//NullPointerException: null not allowed as we have added sort method later.
		System.out.println("ArrayList before sorting: "+l);//[A, C, Z, B, X]
		Collections.sort(l, new MyComparatorForArrayListSort());
		System.out.println("ArrayList after sorting: "+l);//[Z, X, C, B, A]
	}
}

	class MyComparatorForArrayListSort implements Comparator {
	
	public int compare(Object obj1, Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();	
		return s2.compareTo(s1);	
	}
}
