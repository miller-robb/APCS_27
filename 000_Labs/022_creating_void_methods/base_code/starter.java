/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void toString(String user1){
		System.out.println("");

		System.out.println("This is using Methods");
		System.out.println(user1);
	}
	public static void toStringCombined(String guinea, String cat){
		System.out.println(cat+" "+guinea);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please write a sentence.");
		
		String dog=sc.nextLine();
		

		System.out.println("Please write another sentence.");
		String turtle=sc.nextLine();
		toString(dog);
		toStringCombined(turtle,dog);
		



		
	}
}
