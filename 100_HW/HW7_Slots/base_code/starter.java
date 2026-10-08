/*
 *	Author: Miller Robb
 *  Date: 10/6/26
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);


		System.out.println("Welcome to the "testing" Casino");
		System.out.println("You have $100 to begin betting with!");
		System.out.println("Each time you roll 2 of the same number your money will double!");
		System.out.println("Each time you roll 3 of the same number your money will triple!");

		int money;
		int wager;

		while(money>=0){
			int num1=(int)(Math.random()*10)+1;
			int num2=(int)(Math.random()*10)+1;
			int num3=(int)(Math.random()*10)+1;

			System.out.println("Would you like to gamble?...I mean test?");
		}
	}
}
