package map;
import java.util.TreeMap;
public class TreeeMapMethods {
	public static void main(String[] args) {
		TreeMap tm= new TreeMap();	
		tm.put(100, "ZZZ");
		tm.put(104, "YYY");
		tm.put(101, "XXX");
		tm.put(109,150);// Heterogeneous value allowed
		//tm.put("EEE", 102);//RE:CCE (Heterogeneous key not allowed)
		//tm.put(null, 205);//RE:NPE
		System.out.println(tm);//{100=ZZZ, 101=XXX, 104=YYY, 109=150} with default sorting order of Keys.	
	}
}
