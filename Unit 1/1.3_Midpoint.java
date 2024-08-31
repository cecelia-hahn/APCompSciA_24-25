import java.lang.Math;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//get x1
		double x1;
		Scanner getValue = new Scanner (System.in);
		System.out.print("What is your x1 value? ");
		x1 = getValue.nextDouble();
		
		//gety1
		double y1;
		System.out.print("What is your y1 value? ");
		y1 = getValue.nextDouble();
		
		//getx2
		double x2;
		System.out.print("What is your x2 value? ");
		x2 = getValue.nextDouble();
		
		//gety2
		double y2;
		System.out.print("What is your y2 value? ");
		y2 = getValue.nextDouble();
		
		//math
		double coord1 = (x1 + x2)/2;
		double coord2 = (y1 + y2)/2;
		System.out.print("The midpoint of (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + "(" + coord1 + "," + coord2 + ")");
		
	}
}
