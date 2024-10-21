import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("What year were you born? ");
		String input = scan.nextLine();
		int year = Integer.parseInt(input);
		
		int divBy4 = year % 4;
		int divBy100 = year % 100;
		int divBy400 = year % 400;
		
		if (divBy4 != 0)
		System.out.println ("The year " + year +" is not a leap year.");
		
		if (divBy4 == 0)
		    if(divBy100 != 0)
		    System.out.println ("The year " + year +" is a leap year.");
		
		if (divBy100 == 0)
		    if (divBy400 == 0)
		    System.out.println ("The year " + year +" is a leap year.");
		
		else
		    System.out.println ("The year " + year +" is not a leap year.");
		
	}
}
