package collection;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
public class LinkedListSpecificMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l= new LinkedList();
		l.add("Dinesh");
		l.add(30);
		l.add("Dinesh");//duplicates allowed
		l.add(null); //null allowed
		System.out.println(l);//[Dinesh, 30, Dinesh, null]
		
		l.set(2, "Hase");
		System.out.println(l);//[Dinesh, 30, Hase, null],
		
		l.addFirst("Tester");
		System.out.println(l);//[Tester, Dinesh, 30, Hase, null]
		
		l.removeLast();
		System.out.println(l);//[Tester, Dinesh, 30, Hase]	
		
		
	}
}
