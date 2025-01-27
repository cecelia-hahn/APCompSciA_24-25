import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers are you entering? ");
		int amount = scan.nextInt();
		int sum = 0;
		int nums [] = new int[amount];
		for (int i = 0; i<nums.length; i++){
		    System.out.print("Enter one number at a time: ");
		    int num = scan.nextInt();
		    nums[i] = num;
		    sum+=nums[i];
		}
		System.out.println("");
		System.out.println("The sum is " + sum);
		
		for (int i = 0; i<nums.length; i++){
		    double percent = ((double)nums[i]/sum)*100;
		    System.out.println(nums[i] + " is " + percent +"% of the sum");
		}
	}
}
