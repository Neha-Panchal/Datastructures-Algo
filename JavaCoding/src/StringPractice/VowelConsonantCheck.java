package StringPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class VowelConsonantCheck {
	
	public static void main(String[] args) throws IOException {
		
		//1. Take String input
		System.out.println("Enter a String:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = br.readLine();
		System.out.println("Entered String is:" +inputString);
		countVowelsConsonants(inputString);
		
		//System.out.println("Count of Vowels and Consonents is:");	
	}
	
	//2. function to convert input string to char[]
//	public static char[] stringConvertToChar(String inputString) {
//		
//		String str = (inputString.toLowerCase()).trim();
//		char[] stringToChar = str.toCharArray();
//		for (char output : stringToChar) {
//			System.out.println(output);
//		}
//				return stringToChar;
//	}
	
	
	//3. function to count number of vowels and consonants
	public static void countVowelsConsonants(String inputString) {
		
		int vowelCount= 0;
		int consonantCount=0;
		
		String str = (inputString.toLowerCase()).trim();
		
		//1.String is Empty return String is empty
		if(str.isEmpty()) {
			System.out.println("String is empty");
		}
		else {
			//char[] calc = stringConvertToChar(str);
			char[] stringToChar = str.toCharArray();
			for (char output : stringToChar) {
				System.out.println(output);
			}
			
			for (char output : stringToChar) {
			//if(output == ('a'||'e'||'i'||'o'||'u')) {
				if(output == 'a'|| output == 'e'||output == 'i'||output == 'o'||output == 'u') {
				vowelCount++;
			}else {
				consonantCount++;
			}
			}
			System.out.println("Count of Vowels is:"+vowelCount);
			System.out.println("Count of Consonents is:"+consonantCount);
		}
		
		
	}


}
