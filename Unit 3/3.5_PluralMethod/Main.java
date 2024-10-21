import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word in singular form: ");
		String word = scan.nextLine();
	    Plural bill = new Plural(word);
	    bill.melanie(word);
		
		
	}
}
