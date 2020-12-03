package arrays;

import java.util.Scanner;

public class RunProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare array
		String [] names;
		//static array
		names=new String []{"swati", "deven", "neha"};
		
		//Accessing elements
		for (int i = 0; i < names.length; i++)
			System.out.println("Elements of names array static at array " + i + " : "+ names[i]);
		
		//Declaring array literal
		String [] firstNames = new String []{"swati", "deven", "neha"};
			 
		ArrayImplementation implementation = new ArrayImplementation();
		implementation.addAllElements();
		implementation.insertNewElement();
//		implementation.removeElement();
//		implementation.printArray();
		 
		//Course c = new Course(0, null);
		/*
		 * Course [] course = new Course [6];
		 * 
		 * 
		 * course[0]=new Course(111,"AED"); course[1]=new Course(222,"Web Design");
		 * course[2]=new Course(333,"PSA"); course[3]=new Course(444,"UIUX");
		 * course[4]=new Course(555,"Cloud");
		 * 
		 * try { for(int i = 0; i < course.length; i++) {
		 * System.out.println("Displaying Course Array:"+course[i].courseNumber+" "
		 * +course[i].courseName); }} catch(NullPointerException e) {
		 * System.out.println("NullPointerException thrown!"); }
		 */
					
	}

}
