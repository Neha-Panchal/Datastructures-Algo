/**
 * 
 */
package array;

/**
 * @author nehar
 *
 *Interview Question #1
The problem is that we want to reverse a T[] array in O(N) linear time complexity 
and we want the algorithm to be in-place as well!
For example: input is [1,2,3,4,5] then the output is [5,4,3,2,1]
 */

/*	1. Declare array */
/*	2. Read array */
/*	3. Declare and initialize start and end pointers */
/*	4. Compare start and end index */
/*	a. if end>start --> swap | start++ | end -- */
/*	5. Follow loop till mid index reached */
/*	6. Print array */
public class ReverseArray {

	/**
	 * @param args
	 */
	public int[] reverseArray(int[] nums) {
		int startIndex = 0;
		int endIndex = nums.length-1;
		
		while(endIndex>startIndex) {
			swap(nums,startIndex,endIndex);
			startIndex ++;
			endIndex --;
		}
		
        return nums;
	}

	private static void swap(int[] nums, int startIndex, int endIndex) {
		// TODO Auto-generated method stub
		int temp = nums[startIndex];
		nums[startIndex] = nums[endIndex];
		nums[endIndex] = temp;		
	}
}
