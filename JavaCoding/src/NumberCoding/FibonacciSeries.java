package NumberCoding;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int fiboLength = input.nextInt();
		System.out.println("Fibonacci Series of the number is:");
		
		int num1 = 0;
		int num2 = 1;
		int num3 = num1 + num2 ;
		
		for(int i = 0; i<fiboLength; i++) {
			num1 = num2;
			num2 = num3;
			num3 = num1 + num2;
			System.out.print(num1 + " " );
		}	
	}
}
