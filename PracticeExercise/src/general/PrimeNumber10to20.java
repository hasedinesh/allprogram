package general;

public class PrimeNumber10to20 {

	public static void main(String[] args) {			
	
		for (int i = 10; i <=20; i++) {
			int count=0; //we need to declare count here only else if we declare above then it will not work
			for(int j=2;j<i;j++) {
				
				if(i%j==0)
					count++;
			}
			if (count==0)
				System.out.println(i+" is prime number");
			else
				System.out.println(i+" is not prime number");		
	}
	}
}
