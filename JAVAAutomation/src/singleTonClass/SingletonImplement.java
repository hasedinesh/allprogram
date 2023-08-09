package singleTonClass;
class Singletonmain {
	private static Singletonmain Single_obj=null;
	String s="Automation";
	private Singletonmain() { //Declaring constructor private to avoid creation of object.
	}
	static Singletonmain getInstance() { ////declare method static compulsory to call from another class without creating object.
		if (Single_obj==null) {
			return Singletonmain.Single_obj=new Singletonmain(); //This will create object by initiallizing above private constructor
		}
			else {
			return Single_obj;
		}
	}
	public void PrintSingleton() {
		System.out.println("only one object creation allowed");
	}
}
public class SingletonImplement{
	//Singletonmain obj=new Singletonmain(); we can't create object as constructor of SingletonMain is private
	public static void main(String[] args) {
		Singletonmain obj=Singletonmain.getInstance();
		obj.PrintSingleton();
		System.out.println(obj.s);
		Singletonmain obj2=Singletonmain.getInstance();
		obj2.s="Manual";
		System.out.println(obj2.s); //Manual
		System.out.println(obj.s); // Manual because only object reference is changed not object content.
	}
}