import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> nums = new ArrayList<>();
	    System.out.println("Input positive integers: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		while (num>=0){
		   nums.add(num);
		   num = scan.nextInt();
		}
		System.out.println(nums);
	}
}
