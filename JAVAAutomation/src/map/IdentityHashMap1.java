package map;
import java.util.HashMap;
import java.util.IdentityHashMap;
public class IdentityHashMap1 {

	public static void main(String[] args) {
	 hashmapMethod();
	 identityHashmapMethod();
	}
	public static void hashmapMethod(){
		HashMap hm=new HashMap();
		Integer I1=new Integer (10);
		Integer I2=Integer.valueOf(10);//JVM will call .equals() internally.
		hm.put(I1,"Kalyan");
		hm.put(I2,"Pawan");
		System.out.println(hm); //{10=Pawan}
	}
	public static void identityHashmapMethod(){
		IdentityHashMap idhm=new IdentityHashMap();
		Integer I1=new Integer (10);
		Integer I2=Integer.valueOf(10);//JVM will call (==) internally for content comparision.
		idhm.put(I1,"Kalyan");
		idhm.put(I2,"Pawan");
		System.out.println(idhm); //{10=Kalyan, 10=Pawan}
	}
}
