package predefinedClass;
public class StudentEqualsMethodOverride {
String name;
int rollno;
public StudentEqualsMethodOverride(String name, int rollno ) {
	this.name=name;
	this.rollno=rollno;
}
	public static void main(String[] args) {
		StudentEqualsMethodOverride obj1= new StudentEqualsMethodOverride("Durga",101);
		StudentEqualsMethodOverride obj2 = new StudentEqualsMethodOverride("Durga",101);
        System.out.println(obj1.equals(obj2));
	}
//public boolean equals(Object o) {
//	String x=this.name;
//	int i=this.rollno;
//	
//	StudentEqualsMethodOverride s=(StudentEqualsMethodOverride)o;
//	String x1=s.name;
//	int i1=s.rollno;
//	
//	if (x.equals(x1) && i==i1) {
//		return true;
//	}
//	else {
//		return false;
//	}	
//}
public boolean equals(Object o) { //obj2=Object o //Implicit up-casting
	StudentEqualsMethodOverride s=(StudentEqualsMethodOverride)o; //Explicit downcasting tp convert object type into StudentEqualsMethodOverride class type.
	if ((this.name).equals(s.name) && rollno==s.rollno) {
	return true;
	}
	else {
		return false;
	}
}
}