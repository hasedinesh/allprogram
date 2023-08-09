package predefinedClass;
public class WrapperClassToStringMethod {
	public static void main(String[] args) {
     Integer I =new Integer(10);
     //tostring() method in wrapper class is used to convert primitive object to String type.
     String s = I.toString();
     System.out.println(s);
     
     Boolean B=Boolean.valueOf("true");
     String s1= B.toString();
     System.out.println(s1);
     
     Character C= Character.valueOf('d');
     System.out.println(C.toString());
 	}
}
