package NumberCoding;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number to check if Prime: ");
		int checkNumber = input.nextInt();
		int flag = 0;
		
		if(checkNumber <= 1) {
			System.out.println("Number is not Prime");
		}else {
		
			for(int i=2; i<checkNumber/2; i++) {
				if(checkNumber%i == 0) {
					System.out.println("Number is not prime");
					flag = 1;
					break;
			}
		}
		if(flag == 0) {
			System.out.println("Number is prime");
		}	
			}	
		}
		

	

}
