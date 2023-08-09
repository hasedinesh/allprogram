package jAVABasics;

class Parent1{
	public static void car(){
	System.out.println("I am car of Parent class");
	}
}
class child1 extends Parent1{
	public static void car() {
		System.out.println("I am car of child class");
	}
	public void bike() {
		System.out.println("I am bike of child class");
	}
}
public class MethodHiding {
	public static void main(String[] args) {	
		Parent1 p=new Parent1();
		p.car();
		child1 c=new child1();
		c.car();	
		Parent1 p2=new child1();
		p2.car(); // this will run parent class method due to compile time polymorphism
	}

}