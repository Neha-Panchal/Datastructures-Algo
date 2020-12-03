package string.reverseString.reverseStringUsingInbuiltFunctions;

import java.util.Scanner;

public class ReverseStringUsingStringInbuiltFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using Scanner object to read input form user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String you want to reverse: ");
		//storing scanner input n String variable input String
		String inputString = input.nextLine();
		//System.out.println(inputString.hashCode());
		
		//Using String builder object to reverse the string
		StringBuilder reverseString = new StringBuilder();
		
		//appending input string to reverse String
		reverseString.append(inputString);
		//System.out.println(reverseString.hashCode());
		
		//reversing the string
		reverseString=reverseString.reverse();
		//printing reverse string
		//System.out.println(reverseString.hashCode());
		System.out.println(reverseString);
	}

}
