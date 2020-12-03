package recursion;

import java.util.Scanner;

public class RunProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactorialRecursion recurse = new FactorialRecursion();
		
		System.out.println("Enter number to calculate factorial: " );
		Scanner input = new Scanner(System.in);
        recurse.setNumber(input.nextInt());
        input.close();
        
        System.out.println("Factorial of number is: " + recurse.getFactorialResult());	
        }

}
