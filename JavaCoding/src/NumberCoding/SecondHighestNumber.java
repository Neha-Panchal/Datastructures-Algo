package NumberCoding;

public class SecondHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrayInput[] = {23,45,5,32,11,95,3};
		int largestNumber = 0;
		int secondLargestNumber = 0;
		
		System.out.println("Given array is: ");
		for(int i=0; i<arrayInput.length; i++) {
			System.out.println(arrayInput[i]);
		}
		
		
		for(int i=0; i<arrayInput.length; i++) {
			if(arrayInput[i]>largestNumber) {
			secondLargestNumber = largestNumber;
			largestNumber = arrayInput[i];
		}else if(arrayInput[i]>secondLargestNumber) {
			secondLargestNumber=arrayInput[i];
		}
			
		}
		System.out.println("Second Largest Number is: " + secondLargestNumber);

	}

}