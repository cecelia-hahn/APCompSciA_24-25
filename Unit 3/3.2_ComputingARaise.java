import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    //get rating
		Scanner scan = new Scanner(System.in);
		System.out.print("Excellence Rating 1-5: ");
		String score = scan.nextLine();
		
		Scanner second = new Scanner(System.in);
		System.out.print("Input your current salary: ");
		String input = second.nextLine();
		double salary = Double.parseDouble(input);
		
		//how much raise
		if (score.equals("2")){
		    double add = salary*0.03;
		    salary=salary+add;
		}
		
		if (score.equals("3")){
		    double add = salary*0.05;
		    salary=salary+add;
		}
		    
		if (score.equals("4")){
		    double add = salary*0.08;
		    salary=salary+add;
		}

		if (score.equals("5")){
		    double add = salary*0.11;
		    salary=salary+add;
		}
		
		System.out.println("Your new salary is " + salary);

	}
}
