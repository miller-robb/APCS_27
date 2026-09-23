/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("What is your first variable: ");
		int dog=sc.nextInt();
		sc.nextLine();
		System.out.println("What is your second Variable");
		int cat=sc.nextInt();
		sc.nextLine();
		boolean same= dog==cat;
		boolean different= dog!=cat;
		if(different){
			System.out.println("The variables are different");
		}
		if(same){ 
			System.out.println("The variables are the same");
		}

	}
}
