package string;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String to check if Palindrome: ");
		String palindromeInput = input.nextLine();
		
		String reverseString = new StringBuilder(palindromeInput).reverse().toString();
		//System.out.println(reverseString);
		
		if(palindromeInput.equalsIgnoreCase(reverseString)) {
			System.out.println(palindromeInput + " is a Palindrome");
		}else {
			System.out.println(palindromeInput + " is not a palindrome");
		}			
	}	
}

//for (int i =length-1; i>=0; i--) {
//reverse = reverse + original.charAt(i);
//}
//System.out.println("reverse is:" +reverse);
//
//if(original.equals(reverse)) 
//System.out.println("The number is palindrome");
//else
//System.out.println("The number is not a palindrome");

//}