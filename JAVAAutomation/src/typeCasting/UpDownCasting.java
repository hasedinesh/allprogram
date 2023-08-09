package typeCasting;
class RBIBank1 {
	void Reporate(){
		System.out.println("RBI Common reporate");
	}
}
class PNBBank1  extends RBIBank1{
	void PNBInterestRate() {
		System.out.println("PNB Interest rate 8.0");
	}
	void PNBCreditcard(){
		System.out.println("free credit card for PNB User");
	}
 }
public class UpDownCasting {
	public static void main(String[] args) {
		
		RBIBank1 objParent= new PNBBank1();
		
		objParent.Reporate();
//		objParent.PNBInterestRate(); 
//		objParent.PNBCreditcard();  //both this child class method can't use using parent object ref variable.
		//This can be acheived 1) by creating child ref variable pointing to new child object
		//                     2) by creating downcasting of already upcasted reference variable.
		
	    PNBBank1 objchild = (PNBBank1)objParent;
	    objchild.PNBCreditcard();
	    objchild.PNBInterestRate();
	}
}
