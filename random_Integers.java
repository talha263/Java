/* Purpose: Write a program that prints random numbers from 1 to 10 for 1 billion times,
 *          stores the count of each number and display the result of each count. 
 *          
 * Programmer: Talha Patel
 * 
 * */

public class random_Integers
{
	public static void main(String[] args) 
	{
		// display prompt
		System.out.println("The random number from 1 - 10 (1 billion times) are:");
		
		// declare constant
		final int ARRAY_SIZE = 1000;
		
		// declare the array
        int [] myArray = new int [ARRAY_SIZE];
            for (int i = 1; i < myArray.length; i++)
        	    myArray[i] = (int) (Math.random() * 11);
        
        // print the array
        printArray (myArray);
            
        System.out.println();
    	System.out.println("Written by Mohammadtalha Patel, INFO 2313 S12.");
	}
	// main
	
	// printArray-myArray
	
	/*
	 public static void bubbleSort (double[] list)
	 {
	     for (i = 0; i < list.length; i++)
	     
	     System.out.print(list[i] + " ")
	 * */
	public static void printArray(int[] myArray) 
	{
		for (int i = 1; i < myArray.length; i++)

			//print array
			System.out.print(myArray[i] + "  ");
		    System.out.println();
	}
}
