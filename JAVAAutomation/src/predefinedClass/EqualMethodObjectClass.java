package predefinedClass;
class Complex {
    private double x, y;   
     
    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
// Driver class to test the Complex class
public class EqualMethodObjectClass {
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(10, 15);
        if (c1 == c2) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal "); // Not Equal since object reference of 
        }									//c1 and c2 is different although content is different.
    }
}