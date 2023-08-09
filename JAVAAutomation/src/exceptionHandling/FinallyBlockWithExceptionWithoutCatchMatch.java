package exceptionHandling;
public class FinallyBlockWithExceptionWithoutCatchMatch {
	public static void main(String[] args) {
		try {
            System.out.println("inside try block");
            // Throw an Arithmetic exception
            System.out.println(34 / 0);
        }
        // catch an Arithmetic exception
        catch (IndexOutOfBoundsException e) {
            System.out.println("catch : exception handled.");
        }
        // Always execute
        finally {  
          System.out.println("finally : i execute always.");
        }
	}
}
