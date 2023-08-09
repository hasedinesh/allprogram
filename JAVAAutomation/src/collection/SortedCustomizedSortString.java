package collection;
import java.util.Comparator;
import java.util.TreeSet;
public class SortedCustomizedSortString {
	public static void main(String[] args) {
		TreeSet ts= new TreeSet(new mySrtringComparator()); //customized sorting constructor
		ts.add("Dinesh");
		ts.add("Shlok");
		ts.add("Hase");
		ts.add("Family");
		System.out.println(ts);//[Shlok, Hase, Family, Dinesh] will sort string object descending alphabetic order.
		
	}
}

class mySrtringComparator implements Comparator {
	@Override
	public int compare(Object obj1, Object obj2) {
		String s1=(String) obj1;
		String s2=obj2.toString(); //for string both this statement are allowed.
		return s2.compareTo(s1); 
		//*****or*****//
		//return -s1.compareTo(s2);	
	}
}