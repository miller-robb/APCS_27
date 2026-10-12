/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		int num;
		int correct;
		correct=(int)(Math.random()*(1001));

		while(true){
			System.out.println("Pick a number between 1-1000: ");
			num=sc.nextInt();
			sc.nextLine();
			if (num==correct){
				System.out.println("The correct answer is "+correct);
				System.out.println("Oh my god you actully got it, you should buy a lottery ticket, or go to a casino");
				break;

			}
			else if(correct>num){
				System.out.println("Your number was smaller than the correct number");
				

			}
			else if(correct<num){
				System.out.println("Your number was larger than the correct number");
				
			}
			
			
		}
	



		
			


		


		
	}
}
