import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    //make island
	    Island i = new Island();
	    //get names
		Scanner scan = new Scanner(System.in);
		System.out.print("Hello! What is your first name? ");
		String name1 = scan.nextLine();
		String job1 = i.getRandJob();
		
		System.out.print("What is your friend's first name? ");
        String name2= scan.nextLine(); 
        String job2 = i.getRandJob(); 
        
        System.out.print("What is your other friend's first name? ");
        String name3= scan.nextLine(); 
        String job3 = i.getRandJob();
        
        i.survive(job1,job2,job3);
        System.out.println("You have discovered a boat in a magical cave. You must solve three puzzles correctly to escape the island.");
        i.puzzle1(name1);
        i.puzzle2(name2);
        i.puzzle3(name3);
	}
}
