package arrayListCoding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of your array: ");
		int size = input.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>(size);
		System.out.println("Enter elements in your list: ");
		for(int i=1; i<=size; i++) {
			list.add(i);
		}
		
		//accessing elements using for loop
		System.out.println("For Loop:");
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)+ "");
		}
		
		//accessing elements using while loop
		System.out.println("While Loop:");
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        
		//accessing elements using advance for loop
        System.out.println("Advanced For Loop:");
        for(Object obj : list) {
            System.out.println(obj);
		
	}
	}
}
