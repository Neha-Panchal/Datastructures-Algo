package string.reverseString.reverseWithoutStringFunctions;

import java.util.Scanner;

public class ReverseStringUsingcharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using Scanner object to read input form user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String you want to reverse: ");
		//storing scanner input n String variable input String
		String inputString = input.nextLine();
		String reverse = "";
        int length = inputString.length();
        for(int i=length-1; i>=0; i--) {
        	//used inbuilt method charAt() to reverse the string
            reverse = reverse + inputString.charAt(i);   
        }
        System.out.println(reverse);
    }
	

}
