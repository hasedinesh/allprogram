package stringClass;
public class OverriddenEqualsMethod {
	public static void main(String[] args) {
		String s1= new String ("Dinesh");
		String s2= new String ("Dinesh");
		System.out.println("for String class equals method is overridden "+s1.equals(s2));
		System.out.println(s1==s2);//Equal comparision always coampare reference not content
        
		StringBuffer sb1= new StringBuffer("Hase");
		StringBuffer sb2= new StringBuffer("Hase");
		System.out.println("for String Buffer class equals method not overridden "+sb1.equals(sb2));
		System.out.println(sb1==sb2);//Equal comparision always coampare reference not content
	}
}
