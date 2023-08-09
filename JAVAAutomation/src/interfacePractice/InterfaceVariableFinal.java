package interfacePractice;

interface interf{
	int x=15; //this is by default static final
}

public class InterfaceVariableFinal {

	public static void main(String[] args) {
		//x=888;	//this will give compile time error because we can't reinitialize final variable "x" of interface.
         int x=888; // this valid because we are creating new local variable "x" here.
         System.out.println(x);
	}

}
