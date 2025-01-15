import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the first array number: ");
		int num1 = scan.nextInt();
		System.out.print("Input the second array number: ");
		int num2 = scan.nextInt();
		System.out.print("Input the third array number: ");
		int num3 = scan.nextInt();
		System.out.print("Input the fourth array number: ");
		int num4 = scan.nextInt();
		System.out.print("Input the fifth array number: ");
		int num5 = scan.nextInt();
		
		int[] orig = {num1, num2, num3, num4, num5};
		int[] newer = new int[5];
		
		for (int i = 0; i<=orig.length - 1; i++){
		    newer[i] = orig[i]*2;
		}
		
		System.out.println("");
		System.out.println("Original array: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
        
        System.out.println("Doubled array: " + newer[0] + ", " + newer[1] + ", " + newer[2] + ", " + newer[3] + ", " + newer[4]);		
	}
}
