package collection;
import java.util.Vector;
public class VectorDemo1 {
	public static void main(String[] args) {
		//vector object with default capacity constructor
		Vector v=new Vector();
		System.out.println(v.capacity());//10 Since capacity of default vector object is 10.
		for(int i=1;i<=11;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		v.addElement("Dinesh");
		System.out.println(v.elements());
		System.out.println(v);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Dinesh]
		System.out.println(v.capacity());//20 since when we try to add one extra element than its initial capacity-->
											//New capacity become double.

		//vector object with Specified capacity with  constructor
		Vector v1=new Vector(10,5); // capacity=10, incremental size=5	
		System.out.println(v1.capacity());//10 Since capacity of default vector object is 10.
		for(int i=100;i<=110;i++)
		{
			v1.addElement(i);
		}
		System.out.println(v1);//[100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110]
		v1.addElement("Tester");
		System.out.println(v1);//[100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, Tester]
		System.out.println(v1.capacity());//15 since when we try to add one extra element than its initial capacity
											//-->New capacity become 10+5=15.
	}
}
