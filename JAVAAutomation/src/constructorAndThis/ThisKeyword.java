package constructorAndThis;

public class ThisKeyword {

	public void thiskeyword() {
		System.out.println(this);  // output of both same that means "this" keyword instance of current class.
		
	}	
	public static void main(String[] args) {
		ThisKeyword obj= new ThisKeyword();
		System.out.println(obj);
		obj.thiskeyword();
	}
	
}
