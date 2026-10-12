/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int x=0;
		System.out.println("What is your name?");
		String name=sc.nextLine();
		System.out.println("How many times would you like to print your name?");
		int amount=sc.nextInt();
		
		while(true){
			if(x==amount){
				break;
			}
			System.out.println(name);

			x=x+1;

		}



		
	}
}
