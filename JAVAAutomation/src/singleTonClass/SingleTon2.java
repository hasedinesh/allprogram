package singleTonClass;
public class SingleTon2 {
	String s="Pune";
	private SingleTon2() {
	}
	public static SingleTon2 obj = new SingleTon2();
    static SingleTon2 getInstance() {
		return obj;
	}
    
    public void print(){
    	System.out.println("I am Print method of singleton class");
  }
    public static void main(String[] args) {
		SingleTon.obj.print();
		SingleTon2 obj2=getInstance();
		System.out.println(obj2.s);
		obj2.print();
		SingleTon2 obj3=getInstance();
		obj3.s="Mumbai";
		System.out.println(obj3.s);
		System.out.println(obj2.s);
	}
}