package exceptionHandling;
import java.util.ArrayList;
import java.util.Scanner;
public class UserDefinedException {
	public static void main(String[] args) throws TooYoungForVote {		 
		Scanner s= new Scanner(System.in);
		System.out.println("Welcome for VOTING, Enter your age: ");
		int age=s.nextInt();
		
		if (age <18) {
			throw new TooYoungForVote("You are too young kid");
		}
		else {
			System.out.println("Your vote is welcomed");
		}	
		System.out.println("Hello ");		
		
	}
}

class TooYoungForVote extends RuntimeException {	
	public TooYoungForVote(String s) {
		super(s);
	}
}

class UserDefinedExceptionwithTryCatch {
	public static void main(String[] args) throws TooYoungForVote {		 
		Scanner s= new Scanner(System.in);
		System.out.println("Welcome for VOTING, Enter your age: ");
		int age=s.nextInt();
		
		try {
			if (age <18) {
			throw new TooYoungForVote("You are too young kid");
		}
		else {
			System.out.println("Your vote is welcomed");
		}
	}
	catch (TooYoungForVote e) {
		e.printStackTrace();
	}
		System.out.println("Hello ");		
	}
}
