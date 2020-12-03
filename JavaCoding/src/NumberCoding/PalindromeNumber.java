package NumberCoding;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number to check if Palindrome: ");
		String palindromeInput = input.nextLine();
		
		String reverseString = new StringBuilder(palindromeInput).reverse().toString();
		
		System.out.println(reverseString);
		
		if(palindromeInput.equals(reverseString)) {
			System.out.println("String is a Palindrome");
		}else {
			System.out.println("String is not a palindrome");
		}

	}
}
	
	
//	for (int i =length-1; i>=0; i--) {
//        reverse = reverse + original.charAt(i);
//    }
//    System.out.println("reverse is:" +reverse);
//     
//    if(original.equals(reverse)) 
//        System.out.println("The number is palindrome");
//    else
//        System.out.println("The number is not a palindrome");
     
//}
	
	
	
	
	
	

