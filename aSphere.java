/* Purpose: Write a program to that contain two rectangle objects,
 *          one with default values and other with given values.
 *          The program then displays Perimeter and Area of both rectangles.
 * 
 * Programmer: Talha Patel
 * 
 * */

// declare public class
public class aSphere 
{

	public static void main(String[] args) 
	{
		// create Rectangle Objects
		Sphere spher1 = new Sphere();
		Sphere spher2 = new Sphere(6.3);
		
		// print Surface Area and Volume of each Sphere
		System.out.println("Sphere1 Suface Area = " + spher1.getSurfaceArea());
		System.out.println("Sphere1 Surface Area = " + spher2.getSurfaceArea());
		System.out.println("Sphere1 Volume = " + spher2.getVolume());
		System.out.println("Sphere2 Volume = " + spher2.getVolume());
		
		// prompt to display programmer's info.
		System.out.println();
		System.out.println("Written by Mohammadtalha Patel, INFO 2313 S12.");
	}
	
}

// Define Sphere Class
class Sphere
{
	// declare double data fields
	double radius = 1.0;
	
	// constructor 1 (No argument)
	Sphere (){}
	
	// constructor 2 (for values of newRadius of spher2)
	Sphere (double newRadius)
	{
		radius = newRadius;
	}
	
	// declare method to return SurfaceArea
		double getSurfaceArea()
		{
			return 4 * Math.PI * (radius * radius);
		}
	
	// declare method to return Volume
	double getVolume()
	{
		return 4/3 * Math.PI * (radius * radius * radius);
	}
	
}