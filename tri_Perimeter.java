/* Purpose: Write a program to "Compute Perimeter of a Triangle".
 *          (The program checks for a valid input from the user.
 *           A valid input is: the sum of every pair of two edges 
 *           is greater than the remaining edge)
 *  
 * Programmer: Talha Patel
 *
 * */

// Import Scanner class from Java Utilty Classes
import java.util.Scanner;

public class tri_Perimeter 

{
	public static void main(String[] args) 
	
	{
		// declare three edges for the triangle
		double edge1;
		double edge2;
		double edge3; 
		
		Scanner Input = new Scanner(System.in);
		
		// Prompt to ask user for an input
		System.out.println("Enter three edges of a Triangle: ");
		System.out.print("Edge1: ");
		edge1 = Input.nextDouble();
		
		System.out.print("Edge2: ");
		edge2 = Input.nextDouble();
		
		System.out.print("Edge3: ");
		edge3 = Input.nextDouble();
		
		// declare variables as "Sum of Two pairs"
		double sum1 = (edge1 + edge2);
		double sum2 = (edge1 + edge3);
		double sum3 = (edge2 + edge3);
		
		// declare variable P; stores sum of 3 edges
		double P = (edge1 + edge2 + edge3);
		
		// check for valid input from user
		
		// if [edge1+edge2 > edge3] and [edge1+edge3 > edge2] and [edge2+edge3 > edge1]
		// run the program
		if (sum1 > edge3 && sum2 > edge2 && sum3 > edge1)
		{
			System.out.print("Perimeter = " + P);
		}
		
		// else, display error!
		else 
		{
			System.out.println("Trangle cannot be formed!");
			System.out.println("Sum of every pair of two edges must be > the remaining edge.");
		}
		
	}

}
