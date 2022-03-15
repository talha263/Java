/* Purpose: Write a program to generate a 6X6 matrix of random numbers from 1 to 50,
 *          and calculate the sum of the last column of the matrix, and print results. 
 *          
 * Programmer: Talha Patel.
 * 
 * */

public class sumOf_LastColumn 
{
	public static void main(String[] args) 
	{
		System.out.println("The 6 X 6 Matrix is: ");
		System.out.println();
		
		// declaring constants
        final int ARRAY_SIZE = 6;
        
        // declare 2D-Array
        int [][] array2D = new int [ARRAY_SIZE][ARRAY_SIZE];
            for (int row = 0; row < array2D.length; row++)
                for (int col = 0; col < array2D[row].length; col++)
        
        array2D[row][col] = (int) (Math.random() * 100);
       
        // print the array
        sumLastColumn (array2D);
        
            int[] firstRow = array2D[0];
            int[] secondRow = array2D[1];
            int[] thirdRow = array2D[2];
            int[] fourthRow = array2D[3];
            int[] fifthRow = array2D[4];
            int[] sixthRow = array2D[array2D.length - 1];

            // call element of last column in each row            
            int lastColumn_Row1 = firstRow[firstRow.length - 1]; 
            int lastColumn_Row2 = secondRow[secondRow.length - 1];
            int lastColumn_Row3 = thirdRow[thirdRow.length - 1];
            int lastColumn_Row4 = fourthRow[fourthRow.length - 1];
            int lastColumn_Row5 = fifthRow[fifthRow.length - 1];
            int lastColumn_Row6 = sixthRow[sixthRow.length - 1];  

            int Sum = (lastColumn_Row1 + lastColumn_Row2 + lastColumn_Row3 + lastColumn_Row4 + lastColumn_Row5 + lastColumn_Row6);
            
            // print sum and prompt programmer's info
            System.out.println();
            System.out.println("Sum of the last column = " + Sum);
            System.out.println();
    		System.out.println("Written by Mohammadtalha Patel, INFO 2313 S12.");
	}
	// main
	
	// sumLastColumn-array2D
	public static void sumLastColumn(int[][] array2D) 
	{
		for (int row = 0; row < array2D.length; row++)
		{
		    for (int col = 0; col < array2D[row].length; col++)
		    System.out.print(array2D[row][col] + " ");
		    System.out.println();
		}    
	}
}