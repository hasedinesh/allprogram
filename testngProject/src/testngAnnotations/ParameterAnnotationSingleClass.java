package testngAnnotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotationSingleClass {
  
  @Test
  @Parameters({"a","b"})
  public void addition(int x, int y) {
	  
	  System.out.println("Sum of x and y is: "+(x+y));
  }

  @Test
  @Parameters({"a","b"})
  public void substarction(int x, int y) {
	  
	  System.out.println("substarction of x and y is: "+(x-y));
  }

  @Test
  @Parameters({"a","b"})
  public void Multiplication(int x, int y) {
	  
	  System.out.println("Multiplication of x and y is: "+(x*y));
  }
}



