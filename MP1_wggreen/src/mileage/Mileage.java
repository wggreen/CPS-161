package mileage;

import java.util.Scanner;

public class Mileage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int distance;
		double gallons;
		double mpg;
		
		System.out.println("Please enter the distance traveled:");
		distance = scan.nextInt();

		System.out.println("Please enter the number of gallons of gas consumed by your car:");
		gallons = scan.nextDouble();
		
		mpg = distance/gallons;
		
		System.out.printf("The mpg is %.2f", mpg);
		scan.close();
	}
}
