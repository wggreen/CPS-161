package fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		int n = 1;

		while (n <= 100) {
			for (int j = 1; j <= 10; j++) {
				if (n % 3 == 0 && n % 5 == 0) {
					System.out.print("FizzBuzz ");
				} else if (n % 5 == 0) {
					System.out.print("Buzz ");
				} else if (n % 3 == 0) {
					System.out.print("Fizz ");
				} else {
					System.out.print(n + " ");
				}
				n++;
			}
			System.out.println();
		}

	}

}
