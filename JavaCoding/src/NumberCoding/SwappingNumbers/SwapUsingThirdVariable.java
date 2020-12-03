package NumberCoding.SwappingNumbers;

import java.util.Scanner;

public class SwapUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your First Number to Swap");
		int firstNum = input.nextInt();
		System.out.println("Enter your First Number to Swap");
		int secondNum = input.nextInt();
		int temp = 0;
		
		temp = firstNum;
		firstNum=secondNum;
		secondNum=temp;
		
		System.out.println("After swap: " + firstNum + " " + secondNum);
		
	}

}
