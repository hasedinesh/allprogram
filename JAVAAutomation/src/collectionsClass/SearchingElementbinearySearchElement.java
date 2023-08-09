package collectionsClass;
import java.util.ArrayList;
import java.util.Collections;
public class SearchingElementbinearySearchElement {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("Z");
		al.add("A");
		al.add("M");
		al.add("K");
		al.add("a");
		System.out.println(al);//[Z, A, M, K, a]
		Collections.sort(al);
		System.out.println(al);//[A, K, M, Z, a]
		System.out.println(Collections.binarySearch(al,"Z"));//3
		System.out.println(Collections.binarySearch(al,"U"));//-4
	}
}
