package FactorialDynamicPrograming;

import java.util.Scanner;

public class FactorialIterative {

	private int number;

	public int getNumber() {

		return number;
	}

	public void setNumber(int number) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to calculate factorial: ");
		number = input.nextInt();
		this.number = number;
	}

	public long calcFactorial() {
		setNumber(number);
		long factorialResult = 1;
		for (long i = 1; i <= number; i++)
			factorialResult *= i;
		return factorialResult;

	}

}
