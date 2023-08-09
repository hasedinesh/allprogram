package collection;
import java.util.Comparator;
import java.util.TreeSet;
public class TreeMapSortStringStrinBufferLength {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyStringStringBufferComparator());
		ts.add("A");
		ts.add(new StringBuffer("ABC"));
		ts.add(new StringBuffer("AA"));
		ts.add("XX");
		ts.add("ABCD");
		ts.add("A");
		System.out.println(ts);
	}
}

class MyStringStringBufferComparator implements Comparator{
	
	public int compare(Object obj1, Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		if(s1.length()<s2.length()) {
			return -1;
		}
		else if (s1.length()>s2.length()) {
			return +1;
		}
		else {
			return s1.compareTo(s2);
			}
	}
}