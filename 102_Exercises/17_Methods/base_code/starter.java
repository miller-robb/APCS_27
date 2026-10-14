/*
 *	Author: Miller Robb
 *  Date: 10/14/26
 * 	Collaborator(s): Cara Terry, Grant Tuggle
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	public static boolean isLeapYear(int a){
		int x=a;
		if((x%100)==0){
			if ((x%400)==0){
				return true;
			}
			else{
				return false;
			}
		}
		
		else if ((x%4)==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static int getDigitSum(int a){
		int x=a;
		int sum=0;
		while(a>0){
			sum=sum+(a%10);
			a=a/10;

		}
		return sum;


	}
	public static void printIfConsecutive(int a, int b, int c){
		if ((b==(a+1)) && (c==(b+1))){
			System.out.println("these numbers are consecutive!");



		}
		else{
			System.out.println("These numbers are not consecutive!");
			
		}
		
	}

	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.

	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year)){
			System.out.println(year + " is a leap year!");
		}
		else{
			System.out.println(year + " is not a leap year!");
		}

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
}
