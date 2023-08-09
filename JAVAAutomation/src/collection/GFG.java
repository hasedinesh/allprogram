package collection;
import java.util.*;

//Main class
public class GFG {

 // Main driver method
 public static void main(String[] args)
 {
     TreeSet<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {

             public int compare(Integer i1, Integer i2)
             {
                 return i2.compareTo(i1);
             }
         });

     set.add(10);
     set.add(20);
     set.add(30);

     // Print Descending Ordered TreeSet
     System.out.println("Descending Ordered Treeset : "
                        + set);
 }
}