import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		String getName;
		Scanner name = new Scanner (System.in) ;
		System.out.println ("What is your first name?") ;
		getName = name.nextLine();
		
		int getYear;
		Scanner birth = new Scanner (System.in) ;
		System.out.println ("What is your birth year?") ;
		getYear = birth.nextInt();
		
		double getNum;
		Scanner num = new Scanner (System.in) ;
		System.out.println ("What is your favorite number?") ;
		getNum = num.nextDouble();
		
	    System.out.println ("Your name is " + getName + "." + " You were born in " + getYear + " and your favorite number is " + getNum + ".");
	}
}
