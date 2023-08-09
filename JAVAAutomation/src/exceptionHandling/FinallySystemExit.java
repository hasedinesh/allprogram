package exceptionHandling;
public class FinallySystemExit {
	public static void main(String[] args) {
		try {
            System.out.println("inside try block");
            // Throw an Arithmetic exception
            System.exit(0);
            System.out.println(34 / 0);   
            //System.exit(0); this statement does not have any impact because 
                               //as exception occur in above line this statement never execute
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
