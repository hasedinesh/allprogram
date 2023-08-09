package collection;
import java.util.TreeMap;
import java.util.TreeSet;
public class NavigableMapMethods {
	public static void main(String[] args) {
		TreeMap<String,String> tmn=new TreeMap<String,String>();
		tmn.put("a","Apple");
		tmn.put("c","Cat");
		tmn.put("f","fish");
		tmn.put("b","banana");
		tmn.put("m","Mango");
		System.out.println(tmn);//{a=Apple, b=banana, c=Cat, f=fish, m=Mango}
		System.out.println(tmn.ceilingKey("c"));//c
		System.out.println(tmn.higherKey("c"));//f
		System.out.println(tmn.floorKey("c"));//c
		System.out.println(tmn.lowerKey("c"));//b
		System.out.println(tmn.pollFirstEntry());//a=Apple
		System.out.println(tmn.pollLastEntry());//m=Mango
		System.out.println(tmn);//{b=banana, c=Cat, f=fish}
		System.out.println(tmn.descendingMap());//{f=fish, c=Cat, b=banana}
	}
}
