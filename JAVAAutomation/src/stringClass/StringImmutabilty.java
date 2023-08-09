package stringClass;

public class StringImmutabilty {

	public static void main(String[] args) {
		String s= "Dinesh";
		s.concat("Hase");
		System.out.println("immutable String Object: " +s);
        
		StringBuffer sb= new StringBuffer("Dinesh");
		sb.append(" Hase");
		System.out.println("Mutable String Buffer object: "+sb);
	}

}
