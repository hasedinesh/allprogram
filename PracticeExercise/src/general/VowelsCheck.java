package general;

public class VowelsCheck {

	public static void main(String[] args) {

		String s = "aeiou";
		vowelCheckSwitch(s);
		System.out.println("The given string contains vowel?: "+vowelCheck(s));
	}

	static void vowelCheckSwitch(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			switch (s.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			default:
				break;
			}

		}
		System.out.println("Number of vowels are: " + count);

	}

	static boolean vowelCheck(String s) {
		return s.toLowerCase().matches(".*[aeiou].*");

	}

}
