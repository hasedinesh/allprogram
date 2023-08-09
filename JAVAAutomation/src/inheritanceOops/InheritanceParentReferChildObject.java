package inheritanceOops;

class G{                //parent class 
	
	G(){               
	}
	static int a1=10;
	double a2=40.65;
	int a3=50;
}
class H extends G{        
     H(double i){
	//	 super(); // compiler will write super() statement implicitly.   
		 }
	static int b1=10;      
	double b2=52.35;
	int b3=78;
}
class I extends H{          
	 I(int i){
		 super(20.5);     
	}
	static int c1=10;       
	double c2=20.3;
	int c3=100;
}
public class InheritanceParentReferChildObject {

	public static void main(String[] args) {
	 H hobj=new I(10); //Here we are creating child object.That child object is used by parent class "H".
	                    //but here parent can't access child properties.
	 System.out.println("Non-Static variable of A class are " +hobj.a2 +" and "+hobj.a3);
	 System.out.println("Non-Static variable of B class are " +hobj.b2 +" and "+hobj.b3);
	 //System.out.println("Non-Static variable of C class are " +hobj.c2 +" and "+hobj.c3);
	}                       ////This will give compile time error as parent cant access child variable "c2" and "c3"
}

