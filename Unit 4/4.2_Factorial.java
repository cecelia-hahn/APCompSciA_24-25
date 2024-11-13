import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int sum = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number that you want the factorial of (number only): ");
		int num = scan.nextInt();
		for (int i = 1; i<=num; i++){
		    sum = i*sum;
		}
		System.out.println(num + "! = " + sum);
	}
}
