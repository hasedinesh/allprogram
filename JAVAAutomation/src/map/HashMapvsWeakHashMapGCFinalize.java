package map;
import java.util.HashMap;
import java.util.WeakHashMap;
public class HashMapvsWeakHashMapGCFinalize {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("****HashMap Method Starts****");
		HashMapMethodGC();
		System.out.println("****HashMap Method Ends****");
		System.out.println("****WeakHashMap Method Starts****");
		WeakHashMapMethodGC();
		System.out.println("****WeakHashMap Method Ends****");
	}
	public static void HashMapMethodGC() throws InterruptedException {
		HashMap hm= new HashMap();	
		Test t=new Test();
		hm.put(t, 10);
		System.out.println(hm);
		t=null;
		System.gc();
		Thread.sleep(3000);
		System.out.println(hm);	
	}
	public static void WeakHashMapMethodGC() throws InterruptedException {
		WeakHashMap whm= new WeakHashMap();	
		Test t=new Test();
		whm.put(t, 10);
		System.out.println(whm);
		t=null;
		System.gc();
		Thread.sleep(3000);
		System.out.println(whm);
	}
}
class Test{
	public String toString() {
		return "Dinesh";
	}
	public void finalize()  {
		System.out.println("finalize method executed");
	}
}
