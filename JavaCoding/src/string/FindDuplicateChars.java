package string;

import java.util.Scanner;

public class FindDuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String to check if Palindrome: ");
		String inputString = input.nextLine();
		
		char[] charString = inputString.toCharArray();
        System.out.println("Duplicate characters are:");
        
        int count = 0;
        
		for(int i = 0; i<inputString.length(); i++) {
			for(int j = i+1; j<inputString.length(); j++) {
				if(charString[i] == charString[j]) {
					System.out.println(charString[j]);
					count++;
					break;
				}
				
			}
		}

	}

}
