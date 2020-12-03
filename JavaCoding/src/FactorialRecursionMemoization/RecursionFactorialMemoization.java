package FactorialRecursionMemoization;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RecursionFactorialMemoization {
	
	 private Map<Long, Long> memo = new HashMap<Long, Long>();
	 private long number;
	 private long factorialResult;
	 
	 public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}
	
	public long getfactorialResult() {
		return calcFactorial(getNumber());
	}

	public void setfactorialResult(long factorialResult) {
		this.factorialResult = factorialResult;
	}
	 

	public long calcFactorial(long number) {
		if(number<0) {
			System.out.println("Invalid number");
		}else if(number==1) {
			return 1;
		}		
		 if(memo.containsKey(number)) {
	            return memo.get(number);
		 }
		 long factorialResult = number * calcFactorial(number-1);
		 memo.put(number,factorialResult);
		 return factorialResult; 	 
	 }

	public void printmemo() {
		Set<Long> keys = memo.keySet();	
		// Obtaining iterator over set entries
		Iterator<Long> iterate = keys.iterator();
		long intKey = 0;
		System.out.println("Displaying the memoization for Recursive Factorial Program: " );
		System.out.println("number  |  factorial ");
		System.out.println("---------------------");
		
		while (iterate.hasNext()) {
			// Getting Key
			intKey = iterate.next();
			System.out.println(intKey + "       |       " + memo.get(intKey));
		}
	}
}
