/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("Would you like to become a Wizard, Warrior, or Rogue");
		Scanner sc=new Scanner(System.in);
		String user=sc.nextLine();
		boolean wiz=user.equalsIgnoreCase("wizard");
		boolean war=user.equalsIgnoreCase("warrior");
		boolean rog=user.equalsIgnoreCase("rogue");
		if(wiz){
			System.out.println("You have chosen wizard!");
			System.out.println("Fireball!!");

		}
		else if(war){
			System.out.println("You have chosen to be a warrior!");
			System.out.println("Gear up to fight!!!");
		}
		else if(rog){
			System.out.println("You have chosen to be a rogue!");
			System.out.println("Have your dagger handy");
		}
		else{
			System.out.println("You have chosen no role");
			System.out.println("Please try again");
		}

	}
}
