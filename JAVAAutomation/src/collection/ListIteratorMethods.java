package collection;
import java.util.ArrayList;
import java.util.ListIterator;
public class ListIteratorMethods {
	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add("Shlok");
		ar.add("Dinesh");
		ar.add("Hase");
		ar.add("Tester");
		System.out.println(ar);
		ListIterator litr= ar.listIterator();//here litr reference variable will pointing arraylist ar.
		System.out.println(litr.nextIndex());//0
//		System.out.println(litr.next());//Shlok
//		System.out.println(litr.next());//Dinesh
//		System.out.println(litr.next());//Hase
//		System.out.println(litr.hasNext());//True
//		System.out.println(litr.next());//Tester
//		System.out.println(litr.hasNext());//False
		while (litr.hasNext()) {
			String s= (String) litr.next();
			if(s.equals("Hase")) {
				litr.set("Hase Patil");
				System.out.println(ar);//[Shlok, Dinesh, Hase Patil, Tester]
			}
			else if (s.equals("Tester")) {
				litr.remove();
				System.out.println(ar); //[Shlok, Dinesh, Hase Patil]
				litr.add("Developer");
				System.out.println(ar);//[Shlok, Dinesh, Hase Patil, Developer]
			}		
		}
		
	}
}
