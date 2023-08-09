package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class EnumerationCursor1 {
	public static void main(String[] args) {
//		ArrayList a=new ArrayList();
//		for (int i = 1; i <= 10; i++) {
//			a.add(i);
//		}
//    System.out.println(a);
//    Enumeration e = Collections.enumeration(a); // creating enumeration cursor object
//    while (e.hasMoreElements()) {
//    	Integer I = (Integer) e.nextElement();
//    	if (I%2==0) {
//    		System.out.print(I+" ");
//    	}	
//    }
//    System.out.println("");
//    
    Vector v = new Vector();
    for (int i = 1; i <= 10; i++) {
		v.add(i);
	}
    System.out.println(v); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    Enumeration e1= v.elements();
    while (e1.hasMoreElements()) {	
    	Integer I = (Integer)e1.nextElement();
    	if (I%2==0) {
    		System.out.print(I+" "); //2 4 6 8 10 
    	}
    }  
	}
}
