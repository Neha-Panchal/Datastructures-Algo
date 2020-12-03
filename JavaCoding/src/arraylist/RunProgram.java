package arraylist;

import java.util.ArrayList;

public class RunProgram {

	public static void main(String[] args) {
		int size = 10;
		
		ArrayList<Integer> list = new ArrayList<Integer>(size);
		
		//Adding elements to ArrayList
		for(int i=1;i<=size;i++) {
			list.add(i);
		}
		//print original ArrayList
		System.out.println("Displaying original arrayList: " + list);
		
		//remove elements
		list.remove(1);
		
		//print new ArrayList
		System.out.println("Displaying new arrayList: "+ list);
		
		//update ArrayList
		list.set(4, 10);
		//print updated ArrayList
		System.out.println("Displaying updated arrayList: "+ list);
		
		
	}	
}
