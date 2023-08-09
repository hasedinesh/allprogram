//package interfacePractice;
//
//interface IntrfaceImplementationMethod {
//
//	void m1();
//	void m2();
//}
//
////we need to declare this class as abstract as all methods in interface are not implemented.
//abstract class Serviceprovider implements IntrfaceImplementationMethod {
//
//	@Override
//	public void m1() {      // we need to declare method as public otherwise we will get compile time error.
//	    System.out.println("Method 1 with public access modifier");
//	}
//      
//	}
//	
//class Service extends Serviceprovider {
//	@Override
//	public void m2() {
//		System.out.println("Method 2 with public access modifier");
//	}
//	public static void main(String[] args) {
//	 Service obj2=new Service();
//	 obj2.m2();
//	 obj2.m1();
//	}
//	
//	
//}