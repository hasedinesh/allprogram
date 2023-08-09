package interfacePractice;

interface IntrfaceImplementationMethod {

	void m1();
	void m2();
}

//we need to declare this class as abstract as all methods in interface are not implemented.
abstract class Service1 implements IntrfaceImplementationMethod {

	@Override
	public void m1() {      // we need to declare method as public otherwise we will get compile time error.
	    System.out.println("Method 1 with public access modifier");
	}
	}
class Service extends Service1 {
	@Override
	public void m2() {
		System.out.println("Method 2 with public access modifier");
	}
	public static void main(String[] args) {
	 Service obj2=new Service();
	 obj2.m2();
	 obj2.m1();
	 IntrfaceImplementationMethod obj3= new Service(); //we can't create object of Interface but 
	 obj3.m1();                                        // can use it's reference variable to call child class method.
	}
}