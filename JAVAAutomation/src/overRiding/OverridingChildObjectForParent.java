package overRiding;

class Person{
//	Person(){   //This constructor will be provided by compiler implicitly. 
//		
//	}
	public void age(){
		System.out.println("Age above 18 year old");
	}
}
class Minister extends Person{
//	Minister(){
//		super();   //This constructor will be provided by compiler implicitly.
//	}
	public void age() {
		super.age();
		System.out.println("Age is between 18 to 55");
	}
}
public class OverridingChildObjectForParent {
	public static void main(String[] args) {
     Person obj =new Minister(); 
     obj.age(); //WHEN WE COMPILE PROGRAM COMPILER WILL CHECK WHEATHER FOR obj OF TYPE PERSON, METHOD age IS PRESENT OR NOT
	}           //  AS IN PERSON CLASS AGE METHOD IS PRESENT IT WON'T GIVE COMPILE TIME ERROR. BUT while 
}
