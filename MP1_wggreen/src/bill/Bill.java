package bill;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String itemOne, itemTwo, itemThree;
		int quantityOne, quantityTwo, quantityThree;
		double priceOne, priceTwo, priceThree, totalOne, totalTwo, totalThree, tip, tax, subtotal, total;
		
		
		System.out.println("Input name of dish 1:");
		itemOne = scan.nextLine();
		System.out.println("Input quantity of dish 1:");
		quantityOne = scan.nextInt();
		System.out.println("Input price of dish 1:");
		priceOne = scan.nextDouble();
		totalOne = quantityOne * priceOne;
		scan.nextLine();

		System.out.println("Input name of dish 2:");
		itemTwo = scan.nextLine();
		System.out.println("Input quantity of dish 2:");
		quantityTwo = scan.nextInt();
		System.out.println("Input price of dish 2:");
		priceTwo = scan.nextDouble();
		totalTwo = quantityTwo * priceTwo;
		scan.nextLine();
		
		System.out.println("Input name of dish 3:");
		itemThree = scan.nextLine();
		System.out.println("Input quantity of dish 3:");
		quantityThree = scan.nextInt();
		System.out.println("Input price of dish 3:");
		priceThree = scan.nextDouble();
		totalThree = quantityThree * priceThree;
		scan.nextLine();

		
		subtotal = (quantityOne * priceOne) + (quantityTwo * priceTwo) + (quantityThree * priceThree);
		
		tip = 0.18 * subtotal;
		tax = 0.06 * subtotal;
		
		total = subtotal + tip + tax;
		
		System.out.println("Your bill:");
		System.out.printf("%-30s %-5s %10s %10s\n", "Dish", "Quantity", "Price", "Total");
		System.out.printf("%-30s %-5s %10.2f %10.2f\n", itemOne, quantityOne, priceOne, totalOne);
		System.out.printf("%-30s %-5s %10.2f %10.2f\n", itemTwo, quantityTwo, priceTwo, totalTwo);
		System.out.printf("%-30s %-5s %10.2f %10.2f\n", itemThree, quantityThree, priceThree, totalThree);
		
		System.out.printf("%-30s $%.2f\n", "Subtotal", subtotal);
		System.out.printf("%-30s $%.2f\n", "18% tip(before tax)", tip);
		System.out.printf("%-30s $%.2f\n", "6% sales tax", tax);
		System.out.printf("%-30s $%.2f\n", "Total", total);
		scan.close();
	}

}
