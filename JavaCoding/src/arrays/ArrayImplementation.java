package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayImplementation {
	int size;
	int index;
	int value;
	int indexRem =1;
	
	public void addAllElements() {}
	
	public void insertNewElement() {
		System.out.println("Enter size of array");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] id = new int[size];
		
		System.out.println("Enter all the elements:");
		for (int i = 0; i < id.length; i++) {
			id[i] = input.nextInt();
		}
		//for (int i = 0; i < id.length; i++)
			System.out.println("Displaying original array of ids:" + Arrays.toString(id));
		
		System.out.println("Add element at index: ");
		Scanner indexInput = new Scanner(System.in);
		index = indexInput.nextInt();
		System.out.println("index is" + index);

		System.out.println("Add value for given index: " );
		Scanner valueInput = new Scanner(System.in);
		value = valueInput.nextInt();
		System.out.println("Value is: " + value);

		for (int i = size - 1; i > index; i--) {
			id[i] = id[i - 1];
			size=size+1;
		}
		id[index] = value;
		//for (int i = 0; i < size; i++)
			System.out.println("Displaying new array of ids:" + Arrays.toString(id));
		
		System.out.println("Remove element from index: ");
		Scanner indexRemove = new Scanner(System.in);
		indexRem = indexRemove.nextInt();
		System.out.println("index is" + indexRem);
		for(int i = indexRem ; i < id.length -1; i++){
	       id[i] = id[i + 1];
	       
	      }
			System.out.println("Displaying new array of ids after remove method:" +Arrays.toString(id));
	}
	

}
