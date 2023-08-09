
package mainMethod;
public class MainMethodHiding {

	public static void main(String[] args) {
		System.out.println("I am parent class main() method");	
	}
}
class Child1 extends MainMethodHiding{
	
	public static void main(String[] args) {
		System.out.println("I am child1 class main() method");	
	}
}

