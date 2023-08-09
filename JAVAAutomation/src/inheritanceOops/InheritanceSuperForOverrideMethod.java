package inheritanceOops;
class Fruit{
		void Energy() {
		System.out.println("Fruits are the Energy booster");
		}
	void taste() {
		System.out.println("Fruits are sweet and tart in taste");
	}
	}
class Banana extends Fruit{
	void colour() {
	System.out.println("Banana is yellow in colour");	
	}
	void taste () {
	System.out.println("Banana is sweet in taste");
	}
	void properties() {
	colour();
	taste(); // this will call taste method of current class banana.
	super.taste(); // this will call taste of parent/super class fruit.
	}
}
public class InheritanceSuperForOverrideMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Banana b= new Banana();
	  b.Energy();
	  b.properties();
	}
}
