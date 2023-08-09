package stringpractice;

public class CountStringCharacter {

	public static void main(String[] args) {
		
		String s="Dinesh Hase";
		int count=0;
		for(int i=0;i<s.length();i++) {
			
			if (s.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
