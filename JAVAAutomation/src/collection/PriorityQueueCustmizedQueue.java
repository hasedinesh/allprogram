package collection;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCustmizedQueue {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue(15,new MyComparatorpq());//Customized sorting order comparator 
		pq.offer("D");
		pq.offer("A");
		pq.offer("Z");
		pq.offer("Q");
		System.out.println(pq);//[Z, Q, D, A]
	}
}

class MyComparatorpq implements Comparator {	
	public int compare(Object obj1, Object obj2) {
		String s1= obj1.toString();//converting object type to string type to compare.
		String s2= (String) obj2;//converting object type to string type to compare.
		return s2.compareTo(s1);
	}
}