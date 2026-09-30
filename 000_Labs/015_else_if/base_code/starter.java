/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Pick a number between 1-1000: ");
		int num;
		num=sc.nextInt();
		sc.nextLine();
		int correct;
		correct=(int)(Math.random()*(1001));
		if (num==correct){
			System.out.println("The correct answer is "+correct);
			System.out.println("Oh my god you actully got it, you should buy a lottery ticket, or go to a casino");

		}
		else if(correct>num){
			System.out.println("Your number was smaller than the correct number");
			System.out.println("The correct number was "+correct);
		
		}
		else if(correct<num){
			System.out.println("Your number was larger than the correct number");
			System.out.println("The correct number was "+correct);
			
			
		}
	}
}
