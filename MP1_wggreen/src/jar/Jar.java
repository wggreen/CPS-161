package jar;

import java.util.Scanner;

public class Jar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quarters, dimes, nickels, pennies, total;
		
		System.out.println("Enter in the number of quarters in the jar:");
		quarters = scan.nextInt();
		System.out.println("Enter in the number of dimes in the jar:");
		dimes = scan.nextInt();
		System.out.println("Enter in the number of nickels in the jar:");
		nickels = scan.nextInt();
		System.out.println("Enter in the number of pennies in the jar:");
		pennies = scan.nextInt();
		
		total = (quarters * 25) + (dimes * 10) + (nickels * 5) + pennies;
		
		System.out.println("The jar contains " + total + " cents");
		scan.close();
	}

}
