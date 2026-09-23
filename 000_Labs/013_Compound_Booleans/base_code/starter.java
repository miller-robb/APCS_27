/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input your first number: ");
		int dog;
		dog=sc.nextInt();
		sc.nextLine();
		System.out.println("Please input your second whole number: ");
		int cat;
		cat=sc.nextInt();
		sc.nextLine();
		System.out.println("Please input your thrid whole number: ");
		int turtle;
		turtle=sc.nextInt();
		System.out.println();
		if(dog>cat&&dog>turtle) {
			System.out.println("Your largest number was your first number");
			System.out.println(dog+" is the largest number");
		}
		if(cat>dog&&cat>turtle) {
			System.out.println("Your largest number was your second number");
			System.out.println(cat+" is the largest number");
		}
		if(turtle>cat&&turtle>dog) {
			System.out.println("Your largest number was your third number");
			System.out.println(turtle+" is the largest number");
		}
		if(dog<cat&&dog<turtle) {
			System.out.println("Your smallest number was your first number");
			System.out.println(dog+" is the smallest number");
		}
		if(cat<dog&&cat<turtle) {
			System.out.println("Your smallest number was your second number");
			System.out.println(cat+" is the smallest number");
		}
		if(turtle<cat&&turtle<dog) {
			System.out.println("Your smallest number was your third number");
			System.out.println(turtle+" is the smallest number");
		}



	}
}
