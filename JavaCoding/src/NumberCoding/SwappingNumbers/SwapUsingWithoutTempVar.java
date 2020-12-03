package NumberCoding.SwappingNumbers;

import java.util.Scanner;

public class SwapUsingWithoutTempVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your First Number to Swap");
		int firstNum = input.nextInt();
		System.out.println("Enter your First Number to Swap");
		int secondNum = input.nextInt();
		
		secondNum = secondNum - firstNum;
		firstNum = secondNum + firstNum;
		secondNum = firstNum - secondNum;
		
		System.out.println("After swap: " + firstNum + " " + secondNum);
		
	

	}

}
