package testngAnnotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdditionParametersAttributeWithMultiplaeClass {
	@Test
	  @Parameters({"a","b"})
	  public void additionMethod(int x, int y) {
		  
		  System.out.println("Sum of x and y is: "+(x+y));
	  }

}
class Substraction {	
	  @Test
	  @Parameters({"a","b"})
	  public void substarctionMethod(int x, int y) {
		  
		  System.out.println("substarction of x and y is: "+(x-y));
	  }
}

class Multiplication {
	  @Test
	  @Parameters({"a","b"})
	  public void multiplicationMethod(int x, int y) {
		  
		  System.out.println("Multiplication of x and y is: "+(x*y));
	  }
}
