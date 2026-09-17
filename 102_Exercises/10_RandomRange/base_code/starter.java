/*
 *	Author: Miller Robb
 *  Date: 9/17/26
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 numbers to create a range for your random number");
	System.out.print("Please enter an integer: ");
	int dog = sc.nextInt();
	sc.nextLine();
	System.out.print("Please enter another integer (greater than first): ");
	int cat = sc.nextInt();
	System.out.println("Your range is "+dog+" to "+cat+".");
	System.out.println("Here are 5 numbers generated in that range.");
	System.out.print(((int)(Math.random()*(cat-dog))+dog)+", ");
	System.out.print(((int)(Math.random()*(cat-dog))+dog)+", ");
	System.out.print(((int)(Math.random()*(cat-dog))+dog)+", ");
	System.out.print(((int)(Math.random()*(cat-dog))+dog)+", ");
	System.out.println(((int)(Math.random()*(cat-dog))+dog)+", ");

	}
}
