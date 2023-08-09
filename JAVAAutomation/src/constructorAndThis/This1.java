package constructorAndThis;

public class This1 {
    String x="1";
    
	public static void main(String[] args) {
      This1 obj = new This1();
      obj.method1(20);
      obj.method2();
	}
   void method1(int x) {//20
	   x=10; //10
	   System.out.println("value of instance variable= "+this.x); //1 --> here "this" keyword refers to instance of class hence output is "1"
	   System.out.println("value of local variable= "+x);//10 --> x refers to local variable.JVM will first check "x" inside method. 
   }
   void method2() {
	   int x=50;//50
	   System.out.println("value of instance variable= "+this.x);//1
	   System.out.println("value of local variable= "+x);//50
	   this.method1(90); //this can also be used to call another non static method.
   }

}
