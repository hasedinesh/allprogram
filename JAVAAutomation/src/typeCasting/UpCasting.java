package typeCasting;				
class RBIBank {
	void Reporate(){
		System.out.println("RBI Common reporate");
	}
}
class PNBBank extends RBIBank{
	void PNBInterestRate() {
		System.out.println("PNB Interest rate 8.0");
	}
	void PNBCreditcard(){
		System.out.println("free credit card for PNB User");
	}
 }

public class UpCasting {
	public static void main(String[] args) {

     PNBBank objpnb= new PNBBank(); //using child object and child reference we can call all parent and child methods.
     objpnb.Reporate();
     objpnb.PNBCreditcard();
     objpnb.PNBInterestRate();
     
     RBIBank objRBI= new PNBBank(); //here we used child object and parent ref variable.(IMPLICIT UPCAASTING by compiler)
     objRBI.Reporate(); //here we used child object with parent ref variable to call parent methods.
     //objRBI.PNBInterrestrate(); we cant access child methods using parent reference.
     //objRBI.PNBCreditcard();
     
     PNBBank objpnb1= new PNBBank();
     RBIBank objRBI1= objpnb1; // this is explicit Up-casting (done manually)
             //or//
    //RBIBank objRBI1= (RBIBank) objpnb1;  //parent Parentrefvariable =(parent) childrefvariable 
            //or//
     //RBIBank objRBI1= (RBIBank)new PNBBank();
     objRBI1.Reporate(); 
     //objRBI.PNBInterrestrate();// here also we cant access child methods using parent reference.
     //objRBI.PNBCreditcard();
	}
}
