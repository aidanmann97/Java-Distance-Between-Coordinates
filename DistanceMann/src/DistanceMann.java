// ******************************************************************
// Programmer Name: Aidan Mann
// Date: O2/24/20
// Version: 1.0
// Code Description: Computes the distance between two points
// ******************************************************************
import java.util.*;
public class DistanceMann {
	/**
	 * main Method
	 * @param args
	 */

	public static void main(String[] args) {
		double x1, y1, x2, y2;							// coordinates of 2 points
		double distance;								// distance between points
		Scanner input = new Scanner(System.in);
		
		// read in the two points
		System.out.println("Enter the coordinates of the first point " + "(put a space between them) : ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		
		System.out.println("Enter the coordinates of the second point : ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		// compute distance
		distance = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		
		// print out answer
		System.out.println("The distance between the points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is: " + distance);
		
		
	}

}
