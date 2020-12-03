package string.StringCount.CountWordsInStrings;

import java.util.Scanner;

public class CountTheNumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using Scanner object to read input form user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String you want to reverse: ");
		//storing scanner input n String variable input String
		String inputString = input.nextLine();
		
		String stringCount[] = inputString.split(" ");
		System.out.println("Number of Words in the input String is :" +stringCount.length);
	}

}
