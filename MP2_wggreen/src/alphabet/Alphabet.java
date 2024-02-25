package alphabet;

public class Alphabet {

	public static void main(String[] args) {

		for (char i = 'a'; i <= 'z'; i++) {
			char j = i;
			switch (j) {
			case 'a', 'e', 'i', 'o', 'u', 'y':
				System.out.println(j + " is a vowel");
				break;
			case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z':
				System.out.println(j + " is a consonant");
				break;
			default:
				break;
			}

		}

	}
}
