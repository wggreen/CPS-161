package romancalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RomanCalculator {
	public static Scanner kbInput = new Scanner(System.in);

	public static String doMath(char operator, int firstNum, int secondNum) {
		/*
		 * This method will perform the arithmetic indicated by the operator (+ -* /),
		 * invoke convertToRoman to convert answer to Roman number, then return answer
		 */

		int total = 0;

		switch (operator) {
		case '+':
			total = firstNum + secondNum;
			break;
		case '-':
			total = firstNum - secondNum;
			break;
		case '*':
			total = firstNum * secondNum;
			break;
		case '/':
			total = firstNum / secondNum;
			break;
		default:
			System.out.println("Invalid operator");
			break;
		}

		return convertToRoman(total);

	}

	public static char getOperator() {
		/*
		 * Modify this method so when the user enters an invalid operator the program
		 * will complain and ask the user to enter again
		 */

		String operands = "+-*/";

		char operator;

		System.out.print("Enter Operator: + - * /: ");
		operator = kbInput.nextLine().charAt(0);

		while (!operands.contains(String.valueOf(operator))) {
			System.out.println("Your operand is bad ... try again:");
			System.out.print("Enter Operator: + - * /: ");
			operator = kbInput.nextLine().charAt(0);
		}

		return operator;
	}

	public static int getOperands() {
		/*
		 * This routine should prompt the user to enter Roman number. convertFromRoman
		 * needs to be invoked to convert the Roman number to an integer. If the input
		 * is invalid (-1 returned from convertFromRoman) then complain and prompt the
		 * user again.
		 */

		System.out.print("Enter operand: ");
		String operand = kbInput.nextLine();

		int operInt = convertFromRoman(operand);

		while (operInt == -1) {
			System.out.println("Your operator is bad ... try again:");
			System.out.print("Enter operand: ");
			operand = kbInput.nextLine();

			operInt = convertFromRoman(operand);
		}

		return operInt;

	}

	public static int convertFromRoman(String romanNum) {
		/*
		 * This method will convert Roman number to integer return -1 when input is
		 * invalid
		 *
		 */

		int total = 0;

		List<Integer> nums = new ArrayList<Integer>();

		for (int i = 0; i < romanNum.length(); i++) {
			switch (Character.toUpperCase(romanNum.charAt(i))) {
			case 'I':
				nums.add(1);
				break;
			case 'V':
				nums.add(5);
				break;
			case 'X':
				nums.add(10);
				break;
			case 'L':
				nums.add(50);
				break;
			case 'C':
				nums.add(100);
				break;
			case 'D':
				nums.add(500);
				break;
			case 'M':
				nums.add(1000);
				break;
			default:
				return -1;
			}
		}

		for (int i = 0; i < nums.size(); i++) {
			if (i > 0 && nums.get(i) > nums.get(i - 1)) {
				return -1;
			} else {
				total += nums.get(i);
			}
		}

		return total;

	}

	public static String convertToRoman(int num) {
		/*
		 * This method will convert integer to Roman number
		 */

		StringBuilder roman = new StringBuilder();

		int[] values = { 1000, 500,  100, 50, 10, 5, 1 };
		String[] romanLetters = { "M", "D", "C", "L",  "X",  "V",  "I" };

		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {
				num = num - values[i];
				roman.append(romanLetters[i]);
			}
		}

		return roman.toString();

	}

	public static void main(String[] args) {
		String result = "abc";
		do {

			result = doMath(getOperator(), getOperands(), getOperands());

			System.out.println(result);
			System.out.println("do you want to continue? y/n");
		} while (kbInput.nextLine().charAt(0) == 'y');
		System.out.println("Have a nice day!");
	}

}