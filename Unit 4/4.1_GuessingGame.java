import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		int randNumber = (int) (Math.random()*100);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = scan.nextInt();
		while (input != randNumber){
		    if (input < randNumber){
		        System.out.print("Higher: ");
		        input = scan.nextInt();
		    }
		    if (input > randNumber){
		        System.out.print("Lower: ");
		        input = scan.nextInt();
		    }
		}
		System.out.println("Congrats! You guessed the number correctly.");
	}
}
