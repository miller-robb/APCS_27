/*
 *	Author:  Miller Robb
 *  Date: 9/24/26
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
		else{
			System.out.println("Oooh so close the correct answer was "+correct);
			if(correct>num){
				System.out.println("You were "+(correct-num)+" off of the number");
			}
			if(correct<num){
				System.out.println("You were "+(num-correct)+" off of the number");
			}
		}
	}
}
