package make_change;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dollars, cents, dollarsReceived, centsReceived, change;
		
		System.out.print("Enter price dollars: ");
		dollars = scan.nextInt();
		System.out.print("Enter price cents: ");
		cents = scan.nextInt();
		cents += dollars * 100;
		System.out.println();
		
		System.out.println("Enter money received dollars: ");
		dollarsReceived = scan.nextInt();
		System.out.println("Enter money received cents: ");
		centsReceived = scan.nextInt();
		centsReceived += dollarsReceived * 100;
		System.out.println();
		
		change = centsReceived - cents;
		
		System.out.println("Change received: ");
		System.out.println("Dollars: " + (change / 100));
		change = change % 100;
		System.out.println("Quarters: " + (change / 25));
		change = change % 25;
		System.out.println("Dimes: " + (change / 10));
		change = change % 10;
		System.out.println("Nickels: " + (change / 5));
		change = change % 5;
		System.out.println("Pennies: " + (change));
		scan.close();
	}

}
