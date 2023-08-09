package abstractDemo;
abstract class shape{
	String colour;
	public shape(String colour) {  //constructor
		this.colour=colour;
	}
	public abstract double area(); // abstract method
	public void shapetcentre() {
		System.out.println("Centre is at origin ");
	}
}
class Circle1 extends shape{
	float radius;
	
	Circle1(float radius, String Colour){
		super(Colour);
		this.radius=radius;
	}
	public double area() {            //abstract method implemented in child class by overriding
		return Math.PI * Math.pow(radius, 2);
	}
}
public class AbstractOverride{
		public static void main(String[] args) {
	       Circle1 obj1= new Circle1 (2.5f,"Red");
		   obj1.area();
		   obj1.shapetcentre();
		   System.out.println( "Area of "+ obj1.colour + " Circle is "+obj1.area()); //calling overriden method
		}
}

