package collection;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.TreeSet;
public class TreeSetCustomizedSortingDescending {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		 t.add(0);
		 t.add(20);
		 t.add(5);
		 t.add(10);
		 t.add(100);
	System.out.println(t);
	}
}

class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {	//Implementing compare method of Comparator Interface.
		Integer I1=(Integer) obj1;
		Integer I2=(Integer) obj2;
		return I2.compareTo(I1); //or -I1.compareTo(I2);
		
//		*******or**********
//		if (I1<I2) {
//			return +1;
//		}
//		else if(I1>I2) {
//			return -1;
//		}
//		else {
//			return 0;
//		}	
	}	
}
