package jAVABasics;

class Parent{
	public void car(){
	System.out.println("I am car of Parent class");
	}
}
class child extends Parent{
	public void car() {
		System.out.println("I am car of child class");
	}
	public void bike() {
		System.out.println("I am bike of child class");
	}
}
public class Override1 {
	public static void main(String[] args) {	
		Parent p=new Parent();
		p.car();
		child c=new child();
		c.car();	
		Parent p1=new child();
		// p1.bike(); This will give compile time error as we cannot access child method from parent class ref variable
		Parent p2=new child();
		p2.car(); // this will run child class method due to runtime polymorphism
	}

}