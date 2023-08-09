package collectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionReverseMethod {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("Z");
		al.add("A");
		al.add("M");
		al.add("K");
		al.add("a");
		System.out.println(al);//[Z, A, M, K, a]
		Collections.reverse(al);
		System.out.println(al);//[a, K, M, A, Z]
	}
}
