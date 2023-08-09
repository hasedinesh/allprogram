package inheritanceOops;

class person{
	int id;
	String emp_name;
	public person(int id, String emp_name) {
		this.id=id;
		this.emp_name=emp_name;
	}
}
class Employee extends person{
	float salery;
	public Employee(int id,String emp_name,float salery ) {
		super(id ,emp_name);
		this.salery=salery;
	}
	void display() {
		System.out.println("EMP-ID of Employee: "+id);
		System.out.println("Name of Employee: "+emp_name);
		System.out.println("Salery of Employee: "+salery);
	}
}
public class InheritanceSuperThisCombined {
	public static void main(String[] args) {
		Employee obj = new Employee(101,"Dinesh",69000f);
		obj.display();
	}
}
