package string.reverseString.reverseWithoutStringFunctions;

import java.util.Scanner;

public class ReverseStringWithoutUsingInbuiltFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using Scanner object to read input form user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String you want to reverse: ");
		//storing scanner input n String variable input String
		String inputString = input.nextLine();
		
		// converted to character array and printed in reverse order
        char chars[] = inputString.toCharArray();  
        for(int i=chars.length-1; i>-1; i--) {
            System.out.print(chars[i]);
        }
	    
	}

}
