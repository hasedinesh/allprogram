//package inheritanceOops;
////WIthout Inheritance we need to create separate object for each class to access properties of class.
//class A{
//	static int a1=10;
//	double a2=40.65;
//	int a3=50;
//}
//
//class B{
//	static int b1=10;
//	double b2=40.65;
//	int b3=50;
//}
//
//class C{
//	static int c1=10;
//	double c2=40.65;
//	int c3=50;
//}
//
//public class SingleInheritance1 {
//
//	public static void main(String[] args) {
//	 A aobj=new A();
//	 System.out.println("Non-Static variable of A class are " +aobj.a2 +" and "+aobj.a3);
//	 B bobj=new B();
//	 System.out.println("Non-Static variable of B class are " +bobj.b2 +" and "+bobj.b3);
//	 C cobj=new C();
//	 System.out.println("Non-Static variable of C class are " +cobj.c2 +" and "+cobj.c2);
//
//	}
//
//}

//**********************************************************************//
//package inheritanceOops;
//class A{                   //parent class 
//	static int a1=10;
//	double a2=40.65;
//	int a3=50;
//}
//
//class B extends A{         //with extend word we are inheriting properties (non-static) 
//	static int b1=10;      //of class A into class B
//	double b2=52.35;
//	int b3=78;
//}
//
//class C extends B{          //with extend word we are inheriting properties (non-static)
//	static int c1=10;       //of class B (B+C) into class C.
//	double c2=20.3;
//	int c3=100;
//}
//
//public class SingleInheritance1 {
//
//	public static void main(String[] args) {
//	 C cobj=new C(); //Here by creating object of C only we can access non-static properties of B and A.
//	 System.out.println("Non-Static variable of A class are " +cobj.a2 +" and "+cobj.a3);
//	 System.out.println("Non-Static variable of B class are " +cobj.b2 +" and "+cobj.b3);
//	 System.out.println("Non-Static variable of C class are " +cobj.c2 +" and "+cobj.c3);
//
//	}
//
//}

package inheritanceOops;
class A{                   //parent class 
	A(){             //Constructor written explicitly to show working.If not written it will come automatically.
		
	}
	static int a1=10;
	double a2=40.65;
	int a3=50;
}
class B extends A{        
     B(){
		 super();   //Constructor written explicitly to show working.If we do not write then compiler will write it automatically.
	}
	static int b1=10;      
	double b2=52.35;
	int b3=78;
}
class C extends B{          
	 C(){
		 super();     //Constructor written explicitly to show working.If not written it will come automatically.
	}
	static int c1=10;       
	double c2=20.3;
	int c3=100;
}
public class MultilevelInheritance1 {

	public static void main(String[] args) {
	 C cobj=new C(); //Here by creating object of C only we can access non-static properties of B and A.
	 System.out.println("Non-Static variable of A class are " +cobj.a2 +" and "+cobj.a3);
	 System.out.println("Non-Static variable of B class are " +cobj.b2 +" and "+cobj.b3);
	 System.out.println("Non-Static variable of C class are " +cobj.c2 +" and "+cobj.c3);
	}
}

