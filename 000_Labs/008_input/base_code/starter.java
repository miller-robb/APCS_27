/*
 *	Author:  Miller Robb
 *  Date: 9/8/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("What is your name?"); 
		String dog = sc.nextLine();
		System.out.println("How old are you?");
		int cat = sc.nextInt();
		System.out.println("What month were you born? (1-12)");
		int turtle = sc.nextInt();
		System.out.println("What day were you born? (1-31)");
		int hampster = sc.nextInt();
		System.out.println("What year were you born?");
		int guineapig = sc.nextInt();
		System.out.println("How much do you have if you have a dollar bill and 2 quarters?");
		double fish = sc.nextDouble();
		System.out.print("your name is "+dog+". You are "+cat+" years old. You were born on "+turtle+"/"+hampster+"/"+guineapig+".");
		System.out.print("Currently you have $"+fish+"0 in your wallet.");
	}
}
