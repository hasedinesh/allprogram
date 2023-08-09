package collection;
import java.util.Comparator;
import java.util.TreeSet;
public class TreesetSortingForOwnClassEmployee implements Comparable { //we need to implement Comparable for default sorting
	String empname;
	int empid;
	public TreesetSortingForOwnClassEmployee(String empname, int empid) {
		this.empname=empname;
		this.empid=empid;
	}	
	@Override
	public String toString() {
		return empname+"-->"+empid ;
	}
	public static void main(String[] args) {
		
		TreesetSortingForOwnClassEmployee employee1 = new TreesetSortingForOwnClassEmployee("Dinesh",201);
		TreesetSortingForOwnClassEmployee employee2 = new TreesetSortingForOwnClassEmployee("Ganesh",105);
		TreesetSortingForOwnClassEmployee employee3 = new TreesetSortingForOwnClassEmployee("Mayur",108);
		
		TreeSet ts=new TreeSet();
		ts.add(employee1);
		ts.add(employee2);
		ts.add(employee3);
		System.out.println("Sorting as per ascending order of empID: "+ts);
		TreeSet ts2=new TreeSet(new MyStringComparator());
		ts2.add(employee1);
		ts2.add(employee2);
		ts2.add(employee3);
		System.out.println("Sorting as per alphabetical order of empname	: "+ts2);
	}
	public int compareTo(Object obj) {	
		
		int empid1=this.empid;
		Integer e1=empid1; //wrapping to object since compreTo method required object to compare.(else we can use if else to compare below)
		TreesetSortingForOwnClassEmployee employee =(TreesetSortingForOwnClassEmployee) obj;
		
		int empid2= employee.empid;
		Integer e2=empid2;	
		return e1.compareTo(e2);
	}
}

/*****Class to sort as per Employee Name****/

  class MyStringComparator implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		TreesetSortingForOwnClassEmployee emp1=(TreesetSortingForOwnClassEmployee) obj1;//typecasting to class type so that we can get variabel access
		TreesetSortingForOwnClassEmployee emp2=(TreesetSortingForOwnClassEmployee) obj2;
		String empname1=emp1.empname;
		String empname2=emp2.empname;
		return empname1.compareTo(empname2);
	
	}
}



