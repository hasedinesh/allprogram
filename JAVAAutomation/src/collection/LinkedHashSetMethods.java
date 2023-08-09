package collection;
import java.util.LinkedHashSet;
public class LinkedHashSetMethods {
	public static void main(String[] args) {
		LinkedHashSet h=new LinkedHashSet();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add(10);
		h.add(null);
		
		System.out.println(h.add("A"));
		System.out.println(h);

	}

}
