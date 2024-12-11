import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int a = 0;
	    int e = 0;
	    int i = 0;
	    int o = 0;
	    int u = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = scan.nextLine();
		for (int x = 0; x < word.length(); x++){
		    if (word.substring(x, x+1).equals("a"))
		        a++;
		    else if (word.substring(x,x+1).equals("e"))
		        e++;
		    else if (word.substring(x,x+1).equals("i"))
		        i++;
		    else if (word.substring(x,x+1).equals("o"))
		        o++;
		    else if (word.substring(x,x+1).equals("u"))
		        u++;
		    
		}
		
		System.out.println("a: "+a);
		System.out.println("e: "+e);
		System.out.println("i: "+i);
		System.out.println("o: "+o);
		System.out.println("u: "+u);
	}
	
}
