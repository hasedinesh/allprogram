package collection;
import java.util.TreeSet;
public class SortedSetDemo1 {
public static void main(String[] args) {
	TreeSet t= new TreeSet();
	t.add("A");
	t.add("B");
	t.add("a");
	t.add("Z");
	t.add("P");

	
	//t.add(10); //RE:ClassCastException:Heterogeneous objects not allowed because we need to compare(Comparable interface implemented)
	//t.add(null);////RE:ClassCastException:
	System.out.println(t);//[A, B, P, Z, a]
	}

}
