package singleTonClass;
class SingleTon {
	private SingleTon() {
	}
	static SingleTon obj = new SingleTon();
    static SingleTon getInstance() {
		System.out.println(obj);
    	return obj;
	}
    void print(){
    	System.out.println("I am Print method of singleton class");
    }
}

public class SingleTonClass1{
	
	public static void main(String[] args) {
		//SingleTon.getInstance();
		SingleTon.obj.print(); //we can call method using static reference variable of object i.e. without creating new object.
		//System.out.println(obj1);
	}
}