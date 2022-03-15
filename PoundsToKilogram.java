/* Purpose: Write a program to "Convert Pounds to Kilogram".
 *          (The program only runs if user enters a valid (positive) input,
 *          or returns an invalid input error.)
 *
 * Programmer: Talha Patel
 *
 * */

// Import Scanner class from Java Utilty Classes
import java.util.Scanner;

// declare our class
class PoundsToKg 

{
	public static void main(String[] args) 
	
	{
		// Declare the variables we are going to store the input in.
		double Pounds;
		double Kilograms;
		
		// To read a string from the console, invoke the next() method on a Scanner object.
		// ("Input" is default stream as from text-book so, will use it as it is.)
		Scanner Input = new Scanner(System.in);
		
        // Prompt to ask user to enter the input in Pounds.
        System.out.print("Enter value in Pounds (lbs): ");
		Pounds = Input.nextDouble();
		
		// 1 Kg = 0.4536 (rounded off from 0.45359237) * value of Pounds
		Kilograms = 0.4536 * Pounds;
		
		// Display result of conversion from Pounds to Kilogram.
		
		// checking for a valid(positive) input from the user.
		if (Pounds >= 0)
		{
			System.out.print(Pounds + " lbs = " + Kilograms + " Kg.");
		}
		
		else
		{
			System.out.print("Input Invalid! Value of Pounds cannot be negative.");
		}	
	
	}

}
