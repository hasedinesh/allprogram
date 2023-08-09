package collectionsClass;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionsClassSortMethodDNSO {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("A");
		l.add("C");
		l.add("Z");
		l.add("B");
		l.add("X");
		//l.add(10);//ClassCastException:Non-homogeneous objects as we have added sort method later.
		//l.add(null);//NullPointerException: null not allowed as we have added sort method later.
		System.out.println(l);//[A, C, Z, B, X]
		Collections.sort(l);
		System.out.println(l);//[A, B, C, X, Z]

	}

}
