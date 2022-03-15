/* Purpose: Write a program to that contain two rectangle objects,
 *          one with default values and other with given values.
 *          The program then displays Perimeter and Area of both rectangles.
 * 
 * Programmer: Talha Patel
 * 
 * */

// declare public class
public class aRectangle 
{

	public static void main(String[] args) 
	{
		// create Rectangle Objects
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(3.5, 6.3); 
		
		// print Perimeter and Area of each Rectangle
		System.out.println("Rectangle1 Perimeter = " + rect1.getPerimeter());
		System.out.println("Rectangle2 Perimeter = " + rect2.getPerimeter());
		System.out.println("Rectangle1 Area = " + rect1.getArea());
		System.out.println("Rectangle2 Area = " + rect2.getArea());
		
		// prompt to display programmer's info.
		System.out.println();
		System.out.println("Written by Mohammadtalha Patel, INFO 2313 S12.");
	}
	
}

// Define Rectangle Class
class Rectangle
{
	// declare double data fields
	double width = 2.0;
	double length = 3.0;
	
	// constructor 1 (No argument)
	Rectangle (){}
	
	// constructor 2 (for values of Length & Width of rect2)
	Rectangle (double newWidth, double newLength)
	{
		width = newWidth;
		length = newLength;
	}
	
	// declare method to return Perimeter
	double getPerimeter()
	{
		return (2 * width) + (2 * length);
	}
	
	// declare method to return Area
	double getArea()
	{
		return width * length;
	}
	
}