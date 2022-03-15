/* Purpose: Write a program to play Bean Game, where user will be asked 
 *          to drop number of balls into the slots, and accumulation of 
 *          each ball in a slot will be displayed as a result.
 * 
 * Programmer: Talha Patel
 * 
 * */

// import scanner class
import java.util.Scanner;

public class bean_Machine 
{
    public static void main(String[] args) 
    {
    	// daclare variables
        int numOfballs = total_balls();
        int numOfslots = 8;
        
        // method dropBall and its arguments
        dropBall(numOfballs, numOfslots);
    }

    public static int total_balls() 
    {
        Scanner n_balls = new Scanner(System.in);
        
        // prompt game details
        System.out.println("Welcome to the Bean Game!");
        System.out.println();
        System.out.println("You will drop balls in the Bean Game.");
        System.out.println("They will hit series of nails and fall into one of the 8 slots.");
        System.out.println("After all balls are dropped, ");
        System.out.println("resulting accumulation in each slot "
        		           + "will be displayed for you to see.");
        System.out.println();
        
        // prompt to ask user to enter number of balls and return "scanner" value
        System.out.print("Enter the number of balls to drop: ");
        return n_balls.nextInt();
    }

    // declare method dropBall
    public static void dropBall(int numberOfBalls, int numberOfSlots) 
    {
    	// declare slots_Array
        int[] slots_Array = new int[numberOfSlots];
        int slot;
        
        // ball_count to print result with each iteration
        int ball_count = 1;
        for (int i = 0; i < numberOfBalls; i++) 
        {
        	// ball number
        	System.out.print("Ball " + ball_count++ + ":   ");
            slot = 0;
            for (int chance = 0; chance < numberOfSlots - 1; chance++) 
            {
            	// Math.random() < 0.5 for 50% probability to get "R"
                if (Math.random() < 0.5) 
                {
                    System.out.print("R");
                } 
                
                // or else, 50% to get "L"
                else 
                {
                    System.out.print("L");
                    slot++;
                }
            }
            
                // call array, and print result of path followed by each ball
                System.out.println();
                slots_Array[slot]++;
        }
        
                System.out.println();
                printGameResults(slots_Array);
    }

    // printGameResults
    public static void printGameResults(int[] t_slots) 
    {
    	System.out.println("The game results are:");
    	
        int Total = Total(t_slots);
        for (int i = Total; i >0; i--) 
        {
            for (int slot : t_slots) 
            {
                if (slot >= i) System.out.print("0|");
                else System.out.print(" |");
            }
            
            System.out.println();
            
        }
            System.out.println();
            System.out.println("Written by Mohammadtalha, INFO 2312 S12");
    }

    // method "Total"
    public static int Total(int[] my_Array) 
    {
    	// Total = first element of array
        int Total = my_Array[0];
        for (int i = 1; i < my_Array.length; i++) 
        {
            if (my_Array[i] > Total) Total = my_Array[i];
        }
        
        return Total;
    }
}