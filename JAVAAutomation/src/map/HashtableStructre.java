package map;
import java.util.Hashtable;
public class HashtableStructre {
	public static void main(String[] args) {
		Hashtable ht=new Hashtable();
		ht.put(new Test10(5),"A");
		ht.put(new Test10(2),"B ");
		ht.put(new Test10(6),"C");
		ht.put(new Test10(15),"D");
		ht.put(new Test10(23),"E");
		ht.put(new Test10(16),"F");
		//ht.put(new Test10(3),null);RE:NullPointerException
		System.out.println(ht);
	}
}
class Test10{
	int i;
	public Test10(int i) {
		this.i=i;
	}
	@Override
	public int hashCode() {

		return i;
	}	
	public String toString(){
		return i+"";
	}	
}