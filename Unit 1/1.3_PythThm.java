import java.lang.Math;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		double a;
		Scanner getA = new Scanner (System.in);
		System.out.print ("Tell me the value of a: ");
		a = getA.nextDouble();
		//squares a
		double aSqr = Math.pow (a, 2);
		
		double b;
		Scanner getB = new Scanner (System.in);
		System.out.print ("Tell me the value of b: ");
		b = getB.nextDouble();
		//squares b
		double bSqr = Math.pow(b, 2);
		
		//pythagorean theorem
		double cSqr = aSqr + bSqr;
	    //square root c
	    double c = Math.sqrt(cSqr);
	    System.out.print("The value of c is " + c);
	}
}
