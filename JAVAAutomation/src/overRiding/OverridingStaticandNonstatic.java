package overRiding;
	class Person1{	
//		Person1(){   //This constructor will be provided by compiler implicitly. 
//			
//		}
		public static void citizen() {
			System.out.println("Any citizenship");
			
		}
		public void age(){
			System.out.println("Age above 18 year old");
		}
	}
	class Minister1 extends Person1{
//		Minister1(){
//			super();   //This constructor will be provided by compiler implicitly.
//		}
		public static void citizen() {          //static method is not overridden
			System.out.println("indian citizenship");
			
		}
		public void age() {
			super.age();
			System.out.println("Age is between 18 to 55");
		}
	}
	public class OverridingStaticandNonstatic {
		public static void main(String[] args) {
	     Person1 obj =new Minister1();
	     obj.citizen(); //here static method is not overridden hence parent class method will get executed only.
	     Person1.citizen(); //although this is correct way to call static method.
	     obj.age();
		}
	}
