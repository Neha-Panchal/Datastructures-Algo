package sortingAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunProgram {
public static void main(String arg[])throws IOException {
		
		System.out.println("Enter the number of elements to be sorted:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		int numberArray[] = new int[n];
		
		for(int i=0; i<numberArray.length; i++) {
			System.out.print(numberArray[i]+" "); 
		}
		
		for(int i=0; i<numberArray.length; i++) {
			System.out.print(numberArray[i]+" "); 
		}
		System.out.println("Enter the array of numbers to be sorted:");
		
	
		
		
	}

}
