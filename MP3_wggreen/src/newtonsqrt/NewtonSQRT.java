package newtonsqrt;

import java.util.Scanner;

public class NewtonSQRT {

	public static double mySQRT(double N) {
		double last_guess = N / 2;

		double new_guess = ((N / last_guess) + last_guess) / 2;

		while (Math.abs(new_guess - last_guess) >= 0.000001) {
			last_guess = new_guess;

			new_guess = ((N / last_guess) + last_guess) / 2;
		}

		return new_guess;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N;

		System.out.print("Enter in N for Newton: ");

		N = scan.nextInt();

		double javaResult = Math.sqrt(N);
		double methodResult = mySQRT(N);

		System.out.println("mySQRT(" + N + ")=" + methodResult);
		System.out.println("Math.sqrt(" + N + ")=" + javaResult);

	}
}
