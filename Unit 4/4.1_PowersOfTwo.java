import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many powers of two would you like to see? ");
		int input = scan.nextInt();
		int count = 1;
		
		while (count <= input){
		    int ans = count*count;
		    System.out.println(count + "^2 = " + ans);
		    count++;
		}
	}
}
