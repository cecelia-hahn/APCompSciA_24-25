import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner userWord = new Scanner(System.in);
		System.out.print("Enter a 5 letter word: ");
		
		String word = userWord.nextLine();
		System.out.println("");
		
		//define letters using substrings
		String letter1 = word.substring(0,1);
		String letter2 = word.substring(1,2);
		String letter3 = word.substring(2,3);
		String letter4 = word.substring(3,4);
		String letter5 = word.substring(4,5);
		
		//print letters
		System.out.println("The first letter is " + letter1 + ".");
		System.out.println("The second letter is " + letter2 + ".");
		System.out.println("The third letter is " + letter3 + ".");
		System.out.println("The fourth letter is " + letter4 + ".");
		System.out.println("The fifth letter is " + letter5 + ".");
	}
}
