package predefinedClass;

public class WrapperClassConstructorVsValueOf {

	public static void main(String[] args) {

		Integer I1 =new Integer (10);
		Integer I2 =new Integer (10);
		System.out.println(I1==I2); //false
		
		Integer I3 = Integer.valueOf(10);
		Integer I4 = Integer.valueOf(10);
		System.out.println(I3==I4);//true
	}
}
