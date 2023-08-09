package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintWriter p=new PrintWriter("abc.txt");
		p.println("hello");
	}

}
