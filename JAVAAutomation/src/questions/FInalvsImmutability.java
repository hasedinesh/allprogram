package questions;

public class FInalvsImmutability {

	public static void main(String[] args) {
		final StringBuffer sb=new StringBuffer("Durga");
		sb.append("java");
		//we declared stringbuffer object as final and we are not getting any error 
		//because modification in member is allowed eventhough it is declared as final.Only reassignment is not allowed.
		System.out.println(sb);
		
		//sb=new StringBuffer(); reassignment of final variable is not allowed.
	}

}
