package inheritanceOops;


class Vehicle {
    int maxSpeed = 120;
}
 
// sub class Car extending vehicle
class Car extends Vehicle {
    int maxSpeed = 180;
 
    void display()
    {
        // print maxSpeed of base class (vehicle)
        System.out.println("Maximum Speed of vehicle: "+ super.maxSpeed);
        System.out.println("Maximum Speed of car: "+ maxSpeed);
    }
}
 
// Driver Program
public class InheritanceSuperForVariable {
    public static void main(String[] args)
    {
        Car C = new Car();
        C.display();
    }
}