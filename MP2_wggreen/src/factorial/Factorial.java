package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char keepGoing = 'y';
		int numb;
		int factorial = 1;

		do {
			factorial = 1;
			System.out.print("Enter in N: ");
			numb = scan.nextInt();

			for (int i = 1; i <= numb; i++) {
				factorial *= i;			}
			
			System.out.println("Factorial = " + factorial);
			
			System.out.print("Do you want to continue? (y/n): ");
			keepGoing = scan.next().charAt(0);
			
			System.out.println();
		} while (keepGoing == 'y');
		
		System.out.println("Have a good day");

	}

}
