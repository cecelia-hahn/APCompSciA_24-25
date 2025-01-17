import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a temperature: ");
		int temp1 = scan.nextInt();
		System.out.print("Enter a temperature: ");
		int temp2 = scan.nextInt();
		System.out.print("Enter a temperature: ");
		int temp3 = scan.nextInt();
		System.out.print("Enter a temperature: ");
		int temp4 = scan.nextInt();
		System.out.print("Enter a temperature: ");
		int temp5 = scan.nextInt();
		System.out.print("Enter a temperature: ");
		int temp6 = scan.nextInt();
		System.out.print("Enter a temperature: ");
		int temp7 = scan.nextInt();
		System.out.print("Enter a temperature: ");
		int temp8 = scan.nextInt();
		System.out.print("Enter a temperature: ");
		int temp9 = scan.nextInt();
		System.out.print("Enter a temperature: ");
		int temp10 = scan.nextInt();
		
		int[] temps = {temp1, temp2, temp3, temp4, temp5, temp6, temp7, temp8, temp9, temp10};
		double average = 0;
		int days = 0;
		for (int run: temps){
		    average+=run;
		}
		average/=10;
		
		for (int calc: temps){
		    if (calc>average)
		    days++;
		}
		
		System.out.println("Days above average: " + days);
		
	}
}
