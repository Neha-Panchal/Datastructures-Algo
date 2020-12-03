package leetCode;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter size of nums array");
//		int size = sc.nextInt();
//		
		int[] nums = new int[] {2,7,11,13};
//		System.out.println("Enter your array of numbers");
//		for(int i=0; i<size;i++) {
//			nums[i]=sc.nextInt();
//		}
//		
//		System.out.println("Enter your target");
//		int target = sc.nextInt();
		
		twoSum(nums, 9);
	}
	
//	class Solution {
	    public static int[] twoSum(int[] nums, int target) {
	        //variable to store difference
	        int difference;
	        
	        //Hashmap to store the values
	        HashMap<Integer,Integer> map = new  HashMap<Integer,Integer>();
	        
	        //loop to check every element in the array
	        for(int i = 0; i<nums.length; i++){
	            //calculate the difference
	            difference = target - nums[i];
	            
	             //if we already have the difference in HashMap, return an array that contains indices of them.
	            if(map.containsKey(difference)){
	                return new int[] {i,map.get(difference)};
	            }
	           
	            //if its difference is not in HashMap but in the array,
	            //they will be matched when the differnce is the current element.
	            //add current element into HashMap.
	            map.put(nums[i], i);
	        }
	          throw new IllegalArgumentException("No solution");
	    
	    }
	      
	//}
	        
}
