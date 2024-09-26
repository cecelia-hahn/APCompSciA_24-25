import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    //get user word
		Scanner userWord = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = userWord.nextLine();
		
		//get length
		int len = word.length();
		
		//get random value
		int randNum = (int)(Math.random()*len);
		
		//get random letter
		String randLetter = word.substring(randNum, randNum+1);
		System.out.println("Random letter from your word: " + randLetter);
		
	}
}
