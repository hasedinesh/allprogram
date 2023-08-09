package map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapMethods {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("Dinesh",101);
		hm.put("Ganesh",105);
		hm.put("Shlok",103);
		hm.put("Advika",120);
		hm.put("Dinesh", 140);//Will replace first entry of 101.
		System.out.println(hm);// {Shlok=103, A=140, Ganesh=105, Dinesh=101, Advika=120}
		Set s=hm.keySet();
		System.out.println(s);//[Shlok, Ganesh, Dinesh, Advika]
		Collection c=hm.values();
		System.out.println(c);//[103, 105, 140, 120]
		Set se=hm.entrySet();
		System.out.println(se);//[Shlok=103, Ganesh=105, Dinesh=140, Advika=120]
		
		//Methods of Entry Interface(Inner interface of Map)
		//from above entrySet se
		//to get key values from entry set we need to use iterator.(Here, We can't use ListIterator  because it is only allowed for List objects not for Set object)
		Iterator itr= se.iterator();

		while (itr.hasNext()) {
			//to get key value from entry we need to conver Iterator typr of itr to Entry type by type-casting
			Map.Entry e=(Map.Entry)itr.next();
			System.out.println("Key is: "+e.getKey()+"...."+"Value is: "+e.getValue());
			
			if (e.getKey().equals("Dinesh")) {
				
				e.setValue("Dinu");	
			}
		}
		System.out.println(hm);//{Shlok=103, Ganesh=105, Dinesh=Dinu, Advika=120}
		System.out.println(se);//[Shlok=103, Ganesh=105, Dinesh=Dinu, Advika=120]
	}

}
