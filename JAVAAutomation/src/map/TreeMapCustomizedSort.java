package map;
import java.util.Comparator;
import java.util.TreeMap;
public class TreeMapCustomizedSort {
	public static void main(String[] args) {
		TreeMap tm=new TreeMap(new MyComparator());
		tm.put("XXX", 10);
		tm.put("AAA", 30);
		tm.put("ZZZ", 50);
		tm.put("LLL", 15);
		System.out.println(tm);	
	}
}
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1=(String) obj1;
		String s2=obj2.toString();	
		return s2.compareTo(s1);
	}
}
