import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//get temp
		Scanner scan = new Scanner(System.in);
		System.out.print("What temperature is it today? ");
		String input = scan.nextLine();
		int temp = Integer.parseInt(input);
		
		if (temp >= 80)
		    System.out.println("Stay inside, it's very hot!");
		if (temp>=60 && temp<80)
		    System.out.println("Play some sports outside.");
		if (temp>=40 && temp<60)
		    System.out.println("Take a hike or a jog.");
		if (temp < 40)
		    System.out.println("Go inside and stay warm! It's very cold.");
		
		
	}
}
