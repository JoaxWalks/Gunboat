import java.util.Scanner;
import java.math.*;

public class gunboat 
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);													//
		System.out.println("Enter distance to target.\n");										//Asks for input
		double d = input.nextDouble(); 															//Takes the input (including decimals)
		System.out.println("Enter the height of the battery relative to the water line.\n");	//
		double h = input.nextDouble();															//
		System.out.println("Enter the velocity of the cannonball.\n");							//
		double v = input.nextDouble();															//
			
		double a = -4.9*Math.pow((d/v), 2);
		double b = (d);
		double c = a + h;
		
		double tantheta = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
		double angle = Math.atan(tantheta)*180/3.1415926;
		
		System.out.println("The angle is " + angle);
	}
}

