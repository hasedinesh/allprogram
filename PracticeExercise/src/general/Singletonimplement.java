package general;
class SingletonMain {
	public static SingletonMain singletonObject = null;
	private SingletonMain() {
	}
	public static SingletonMain getinstance() {   //declare method static compulsory to call from another class without creating object.
		if (singletonObject == null) {
			return SingletonMain.singletonObject = new SingletonMain();
		} else {
			return SingletonMain.singletonObject;
		}
	}
	void print() {
		System.out.println("I am method of Singletonmain Class");
	}
}

public class Singletonimplement {

	public static void main(String[] args) {

		// SingletonMain obj=new SingletonMain(); //can't create obj as constructor is
		SingletonMain obj1=SingletonMain.getinstance();
		obj1.print();
		System.out.println(obj1);//general.SingletonMain@4617c264
		SingletonMain obj2=SingletonMain.getinstance();
		System.out.println(obj2);//general.SingletonMain@4617c264
		obj2.print();
	}
}
