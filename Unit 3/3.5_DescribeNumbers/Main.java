import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scan.nextInt();
		
		CheckNumber c = new CheckNumber();
		c.findPosNegZero(input);
		c.findEvenOddZero(input);
		c.print();
	}
}
