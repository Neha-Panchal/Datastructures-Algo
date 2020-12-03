package array;

public class arrayPrac {

	public static void main(String args[]) {
		
		int array[]= {1,2,3,4,5};
		
		ReverseArray reverseArray = new ReverseArray();
		int[] reversedArray = reverseArray.reverseArray(array);
		
		for (int i=0; i<reversedArray.length;i++) {
			System.out.println(reversedArray[i]+"");
		}
	}	
}
