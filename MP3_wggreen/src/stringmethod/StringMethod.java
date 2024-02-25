package stringmethod;

import java.util.Scanner;

public class StringMethod {

	public static int countOccurrences(String stringOne, String stringTwo) {
		int occurrences = 0;

		int index = stringOne.indexOf(stringTwo);

		while (index != -1) {
			occurrences++;

			index = stringOne.indexOf(stringTwo, index + stringTwo.length());
		}
		return occurrences;
	}

	public static int countUppercaseLetters(String myStr) {
		int uppers = 0;

		for (int i = 0; i < myStr.length(); i++) {
			if (Character.isUpperCase(myStr.charAt(i))) {
				uppers++;
			}
		}

		return uppers;
	}

	public static String pigLatin(String word) {
		String vowels = "aeiouyAEIOUY";
		int firstVowelIndex = 0;

		for (int i = 0; i < word.length(); i++) {
			if (vowels.contains(String.valueOf(word.charAt(i)))) {
				firstVowelIndex = i;
				break;
			}
		}
		
		return word.substring(firstVowelIndex) + word.substring(0, firstVowelIndex) + "ay";

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first string:");
		String stringOne = scan.nextLine();

		System.out.println("Enter the second string:");
		String stringTwo = scan.nextLine();

		System.out.println("\"" + stringTwo + "\"" + " occurs " + countOccurrences(stringOne, stringTwo)
				+ " time(s) in " + "\"" + stringOne + "\"");

		System.out.println("\nEnter another string:");
		String stringThree = scan.nextLine();

		System.out.println("\"" + stringThree + "\"" + " had " + countUppercaseLetters(stringThree) + " uppercase letter(s)");

		System.out.println("\nEnter another string:");
		String stringFour = scan.nextLine();
		
		System.out.println("\"" + stringFour + "\"" + " in Pig Latin is " + pigLatin(stringFour));

	}

}
