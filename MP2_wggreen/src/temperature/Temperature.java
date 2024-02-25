package temperature;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double fahrenheit = 0;
		double centigrade = 0;
		double fahrenheitTotal = 0;
		double centigradeTotal = 0;
		int counter = 0;

		do {
			System.out.print("Enter temp in Centigrade or <= -100.0 to quit: ");
			centigrade = scan.nextDouble();
			
			if (centigrade == -100.0)
			{
				break;
			}
			
			centigradeTotal += centigrade;

			fahrenheit = 1.8 * centigrade + 32;
			fahrenheitTotal += fahrenheit;
			
			System.out.printf("Temperature: F(%.1f) C(%.1f)\n", fahrenheit, centigrade);
			
			++counter;


		} while (centigrade != -100.0);
		
		System.out.printf("Average: Centigrade(%.1f) Average: Fahrenheit(%f)", centigradeTotal / counter, fahrenheitTotal / counter);

	}

}
