package inheritanceOops;

class D{                //parent class 
	
	D(){               
	}
	static int a1=10;
	double a2=40.65;
	int a3=50;
}
class E extends D{        
     E(double i){
	//	 super(); // compiler will write super() statement implicitly.   
		 }
	static int b1=10;      
	double b2=52.35;
	int b3=78;
}
class F extends E{          
	 F(int i){
		 super(20.5);     
	}
	static int c1=10;       
	double c2=20.3;
	int c3=100;
}
public class InheritanceParameterConstrSuper {

	public static void main(String[] args) {
	 F fobj=new F(10); 
	 System.out.println("Non-Static variable of A class are " +fobj.a2 +" and "+fobj.a3);
	 System.out.println("Non-Static variable of B class are " +fobj.b2 +" and "+fobj.b3);
	 System.out.println("Non-Static variable of C class are " +fobj.c2 +" and "+fobj.c3);
	}
}
