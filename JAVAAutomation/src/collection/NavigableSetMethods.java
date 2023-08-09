package collection;
import java.util.TreeSet;
public class NavigableSetMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tsn=new TreeSet<Integer>();
		tsn.add(10);
		tsn.add(50);
		tsn.add(20);
		tsn.add(80);
		tsn.add(30);
		System.out.println(tsn);//[10, 20, 30, 50, 80]
		System.out.println(tsn.ceiling(30));//30
		System.out.println(tsn.higher(30));//50
		System.out.println(tsn.floor(30));//30
		System.out.println(tsn.lower(30));//20
		System.out.println(tsn.pollFirst());//10
		System.out.println(tsn.pollLast());//80
		System.out.println(tsn);//[20, 30, 50]
		System.out.println(tsn.descendingSet());//[50, 30, 20]
	}

}
