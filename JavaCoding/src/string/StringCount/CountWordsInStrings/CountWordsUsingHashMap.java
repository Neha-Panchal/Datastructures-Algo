package string.StringCount.CountWordsInStrings;

import java.util.HashMap;
import java.util.Scanner;

public class CountWordsUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using Scanner object to read input form user
				Scanner input = new Scanner(System.in);
				System.out.println("Enter the String you want to reverse: ");
				//storing scanner input n String variable input String
				String inputString = input.nextLine();
				String[] strSplit = inputString.split(" ");
				
				HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
				int count = 0;
				for(int i = 0; i<strSplit.length;i++) {
					if(hashMap.containsKey(strSplit[i])) {
						hashMap.get(strSplit[i]);
						hashMap.put(strSplit[i], count+1);
						
					}else{
						hashMap.put(strSplit[i], 1);
					}
					
				}
				System.out.println(hashMap);
				//System.out.println(count);
	}

}
