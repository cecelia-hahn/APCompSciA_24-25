import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    //prepare for the most inefficient code...
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter the 1st digit of your phone number: ");
	    int num1 = scan.nextInt();
	    System.out.print("2nd digit: ");
	    int num2 = scan.nextInt();
	    System.out.print("3rd digit: ");
	    int num3 = scan.nextInt();
	    System.out.print("4th digit: ");
	    int num4 = scan.nextInt();
	    System.out.print("5th digit: ");
	    int num5 = scan.nextInt();
	    System.out.print("6th digit: ");
	    int num6 = scan.nextInt();
	    System.out.print("7th digit: ");
	    int num7 = scan.nextInt();
	    System.out.print("8th digit: ");
	    int num8 = scan.nextInt();
	    System.out.print("9th digit: ");
	    int num9 = scan.nextInt();
	    System.out.print("10th digit: ");
	    int num10 = scan.nextInt();
	    
	    int[] nums = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};
	    int zeros = 0;
	    int ones = 0;
	    int twos = 0;
	    int threes = 0;
	    int fours = 0;
	    int fives = 0;
	    int sixes = 0;
	    int sevens = 0;
	    int eights = 0;
	    int nines = 0;
	    
	    for (int i = 0; i<nums.length; i++){
	        if (nums[i]==0)
	        zeros++;
	        else if(nums[i]==1)
	        ones++;
	        else if(nums[i]==2)
	        twos++;
	        else if(nums[i]==3)
	        threes++;
	        else if(nums[i]==4)
	        fours++;
	        else if(nums[i]==5)
	        fives++;
	        else if(nums[i]==6)
	        sixes++;
	        else if(nums[i]==7)
	        sevens++;
	        else if(nums[i]==8)
	        eights++;
	        else if(nums[i]==9)
	        nines++;
	    }
	    
	    int[] amount = {zeros, ones, twos, threes, fours, fives, sixes, sevens, eights, nines};
	    System.out.println("0: " + zeros);
	    System.out.println("1: " + ones);
	    System.out.println("2: " + twos);
	    System.out.println("3: " + threes);
	    System.out.println("4: " + fours);
	    System.out.println("5: " + fives);
	    System.out.println("6: " + sixes);
	    System.out.println("7: " + sevens);
	    System.out.println("8: " + eights);
	    System.out.println("9: " + nines);
	}
}
