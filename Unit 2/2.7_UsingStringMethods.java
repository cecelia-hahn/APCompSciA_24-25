import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    //gets word from user
		Scanner newWord = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = newWord.nextLine();
		System.out.println("");
		
		//how long word is
		int letters = word.length();
		System.out.println("Your word is " + letters + " letters long.");
		
		//first letter
		String firstLetter = word.substring(0,1);
		System.out.println("The first letter of your word is " + firstLetter + ".");
		
		//last letter
		String lastLetter = word.substring(word.length()-1);
		System.out.println("The last letter of your word is " + lastLetter + ".");
		
		//middle letter
		String midLetter = word.substring(word.length()/2, word.length()/2+1);
		System.out.println("The middlest letter of your word is " + midLetter + ".");
		
		
	}
}
