package recursion;

public class FactorialRecursion {

	private long number;
	public long factorialResult;

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public long getFactorialResult() {
		return factorialResult = calcFactorial(getNumber());
	}

	public void setFactorialResult(long factorialResult) {
		this.factorialResult = factorialResult;
	}

	/* 
	 * 3 rules for recursion
	 * 1. Finding where and how problem is same 
	 * 2. Trying to solve the problem for current stage
	 * 3. Stopping criteria for recursion
	 */
	
//	calcFactorial() calls itself till n = 0
	public long calcFactorial(long number) {
		if (number != 0)  //  3. Stopping criteria for recursion
            return number * calcFactorial(number-1); // recursive call - 1. Finding where and how problem is same 
        else
            return 1;
    }


}

