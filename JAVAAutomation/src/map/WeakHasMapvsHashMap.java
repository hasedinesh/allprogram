package map;
import java.util.HashMap;
import java.util.WeakHashMap;
public class WeakHasMapvsHashMap {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("****HashMap Method Starts");
		HashMapMethodGC();
		System.out.println("****HashMap Method Ends");
		System.out.println("****WeakHashMap Method Starts");
		WeakHashMapMethodGC();
		System.out.println("****WeakHashMap Method Ends");
	}
	public static void HashMapMethodGC() throws InterruptedException {
		HashMap hm=new HashMap();
		Integer I1=new Integer(10);
		hm.put(I1, "Dinesh");
		System.out.println(hm);
		I1=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(hm);
	}
	public static void WeakHashMapMethodGC() throws InterruptedException{
		WeakHashMap whm=new WeakHashMap();
		Integer I1=new Integer(10);
		whm.put(I1, "Dinesh");
		System.out.println(whm);
		I1=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(whm);
	}
}
