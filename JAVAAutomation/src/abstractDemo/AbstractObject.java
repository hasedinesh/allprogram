package abstractDemo;

abstract class Bike {
	
	abstract void run();
	void speed(int speed) {
		System.out.println("Bike Speed "+speed);
	}
} 

class Honda extends Bike{

	@Override
	void run() {
		System.out.println("Running safely");
	}
	void speed(int speed) {
	 System.out.println("Honda speed "+speed);
	}
	void engineCC() {
		System.out.println("CC:225");
	}
	
}
public class AbstractObject {
   
	public static void main(String[] args) {
		Honda obj1= new Honda();
		obj1.run();
		obj1.speed(50);
		obj1.engineCC();
		// Bike obj2= new Bike(); //This will give error because we cannot create object of abstract class.
		Bike obj3= new Honda();  // Here we can use reference of abstract class to refer object of child class.
		obj3.run();
		obj3.speed(100);
		//obj3.engineCC(); // we cannot call this method because it is child method only and cannot be accessed by parent.
	}
	
}
