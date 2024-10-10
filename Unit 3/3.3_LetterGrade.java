import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input letter grade as a capital letter: ");
		String grade = scan.nextLine();
		
		if (grade.equals("A"))
		    System.out.println("Your percentage range is 90%-100%.");
		else if (grade.equals("B"))
		    System.out.println("Your percentage range is 80%-89%.");
		else if (grade.equals("C"))
		    System.out.println("Your percentage range is 70%-79%.");
		else if (grade.equals("D"))
		    System.out.println("Your percentage range is 60%-69%.");
	    else if (grade.equals("F"))
		    System.out.println("Your percentage range is 0%-59%.");
		else
		    System.out.println("Please input your letter grade with a capital letter.");
		
	}
}
