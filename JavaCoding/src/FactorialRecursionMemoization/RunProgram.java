package FactorialRecursionMemoization;

import java.util.Scanner;

public class RunProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RecursionFactorialMemoization recursememo = new RecursionFactorialMemoization();
		System.out.println("Enter number to calculate factorial: " );
		Scanner input = new Scanner(System.in);
		recursememo.setNumber(input.nextInt());
        input.close();
        
		System.out.println("Factorial of "+recursememo.getNumber()+ " is " + recursememo.getfactorialResult());
		recursememo.printmemo();

		
	}
}
	
	
