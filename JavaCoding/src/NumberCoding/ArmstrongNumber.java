package NumberCoding;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int digit,temp;  
	    int number=153; 
	    temp=number;  
	    while(number>0)  
	    {  
	    	digit=number%10;  
	    	number=number/10;  
	    	sum = sum + (digit*digit*digit);  
	    }  
	    if(temp == sum)  
	    	System.out.println(temp + " is a armstrong number");   
	    else  
	        System.out.println(temp + " is not armstrong number");   
	   }  
	}


