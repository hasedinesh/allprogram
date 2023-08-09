package interfacePractice;

interface Printable{
	void print();
}

interface Showable extends Printable{  //to inherit interface from another 
	void show();                        //interface "extends" word required.
} 

public class MultipleInheritanceInterface implements Showable, Printable {

	@Override
	public void print() {
		System.out.println("Hello Print");	
	}
	@Override
	public void show() {
	System.out.println("Hello Show");
	}
	public static void main(String[] args) {
		MultipleInheritanceInterface obj= new MultipleInheritanceInterface();
        obj.show();
		obj.print();
	}
}
