package general;

public class NonRepeatedChar {

	public static void main(String[] args) {
		String s = "aabbbrdddd";
		char ch[] = s.toCharArray();
		for(char c : ch){
			if(s.indexOf(c)==s.lastIndexOf(c)){
				System.out.println("First non-repeat char = "+c);
				break;
			}
		}


	}

}
