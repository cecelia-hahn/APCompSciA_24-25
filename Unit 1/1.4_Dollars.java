import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a dollar amount: $");
		int dollar = input.nextInt();
		int hundreds = dollar / 100;
		dollar = dollar - 100*hundreds;
		int fifties = dollar / 50;
		dollar = dollar - 50*fifties;
		int twenties = dollar / 20;
		dollar = dollar - 20*twenties;
		int tens = dollar / 10;
		dollar = dollar - 10*tens;
		int fives = dollar / 5;
		dollar = dollar - 5*fives;
		int ones = dollar / 1;
		dollar = dollar - 1*ones;
		System.out.println(hundreds + " $100 dollar bills");
		System.out.println(fifties +" $50 dollar bills");
		System.out.println(twenties +" $20 dollar bills");
		System.out.println(tens+" $10 dollar bills");
		System.out.println(fives+" $5 dollar bills");
		System.out.print(ones+" $1 dollar bills");
		
}}
