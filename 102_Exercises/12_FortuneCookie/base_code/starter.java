/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("You unravel the paper from the cookie and read: ");
		int number;
		number=(int)(Math.random()*(10))+1;
		boolean one= number==1;
		boolean two= number==2;
		boolean three= number==3;
		boolean four= number==4;
		boolean five= number==5;
		boolean six= number==6;
		boolean seven= number==7;
		boolean eight= number==8;
		boolean nine= number==9;
		boolean ten= number==10;

		if(one){
			System.out.println("You will understand optimization in Calculus");
		}
		if(two){
			System.out.println("*Coupon for free banana bread*");
		}
		if(three){
			System.out.println("You will pet a cute dog");
		}
		if(four){
			System.out.println("An omnipresent Dolly Parton is watching over you");
		}
		if(five){
			System.out.println("Your pillow will be cold on both sides");
		}
		if(six){
			System.out.println("You will win if you bet your all of your college savings on red");
			System.out.println("trust me I know");
		}
		if(seven){
			System.out.println("You will guess the random number in lab 14 before Grant");
		}
		if(eight){
			System.out.println("Your next quiz will be moved to next week");
		}
		if(nine){
			System.out.println("Next time you drop your phone it wont break");
		}
		if(ten){
			System.out.println("You will finally break 22 in the 50 freestyle");
		}
	}
}
