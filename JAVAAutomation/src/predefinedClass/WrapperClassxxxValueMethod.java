package predefinedClass;

public class WrapperClassxxxValueMethod {

	public static void main(String[] args) {
		
		Integer I= Integer.valueOf(130);
		System.out.println(I);
		
		System.out.println(I.intValue());
		System.out.println(I.floatValue());
		System.out.println(I.doubleValue());
		System.out.println(I.longValue());
		System.out.println(I.byteValue());
		System.out.println(I.shortValue());
		
		Character C= Character.valueOf('a');
		System.out.println(C.charValue());
		
		Boolean B=Boolean.valueOf(false);
		System.out.println(B.booleanValue());
		
		
		System.out.println(B.toString());
	}
}