package collection;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorMethods1 {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		for (int i = 0; i <=10; i++) {
			al.add(i);
		}
		System.out.println(al);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		Iterator<Object> itr= al.iterator(); //return type of iterator() method is Iterator.
		while (itr.hasNext()) {
			Integer I = (Integer) itr.next();
			if (I%2==0) {
				System.out.print(I+" "); //0 2 4 6 8 10 
			}
			else {
				itr.remove();
			}
		}
		System.out.println();
		System.out.println(al);//[0, 2, 4, 6, 8, 10]
	}
}
