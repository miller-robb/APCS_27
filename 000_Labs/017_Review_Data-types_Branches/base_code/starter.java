/*
 *	Author:  Miller Robb
 *  Date: 10/2/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("Hello there traveller, what is thy name?");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("What is thy title, are thou a lord, or slayer of dragons or some other noble?");
		String title=sc.nextLine();
		System.out.println("Would thou like to become a Wizard, a Warrior, or a Rogue");
		
		String role=sc.nextLine();
		boolean wiz=role.equalsIgnoreCase("wizard");
		boolean war=role.equalsIgnoreCase("warrior");
		boolean rog=role.equalsIgnoreCase("rogue");
		if(wiz){
			System.out.println("Thou have chosen wizard!");
			System.out.println("Fireball!!");

		}
		else if(war){
			System.out.println("Thou have chosen to be a warrior!");
			System.out.println("Gear up to fight!!!");
		}
		else if(rog){
			System.out.println("Thou have chosen to be a rogue!");
			System.out.println("Have your dagger handy");
		}
		else{
			System.out.println("Thou have chosen no role");
			System.out.println("Please try again");
		}
		System.out.println();
		System.out.println("Thou have 20 dubloons to spend on thy skills of Strength, Dexterity, Intelligence, and Charisma. Spend thy gold wisely");
		System.out.println("How many dubloons would thou like to spend on Strength: (1-10)");
		int strength=sc.nextInt();
		sc.nextLine();
		if (strength<=10){
			System.out.print("Thou now have the strength of "+strength+" babies!");
		}
		else{
			System.out.println("Ahh thou have spent too many dubloons, please reload for thy refund!");
		}
		System.out.println();
		System.out.println("You now have "+(20-strength)+" dubloons remaining");
		System.out.println("How many dubloons would thou like to spend on thy dexterity?: (0-10)");
		int dexterity=sc.nextInt();
		sc.nextLine();
		if ((dexterity<=10)&&(dexterity<=(20-strength))){
			System.out.println("Thou now have the dexterity of "+dexterity+" dolphins!");
		}
		else{
			System.out.println("Ahh thou have spent too many dubloons, please reload for thy refund!");
		}
		System.out.println();
		System.out.println("Thou now have "+(20-strength-dexterity)+" dubloons remaining");
		System.out.println("How many dubloons would thou like to spend on intelligence?: (1-10)");
		int intelligence=sc.nextInt();
		sc.nextLine();
		if ((intelligence<=10)&&(intelligence<=(20-strength-dexterity))){
			System.out.println("Thou now have the intelligence of "+intelligence+" armadillos!");
		}
		else{
			System.out.println("Ahh thou have spent too many dubloons, please reload for thy refund!");
		}
		System.out.println();
		System.out.println("Thou now have "+(20-strength-dexterity-intelligence)+" dubloons remaining");
		System.out.println("How many dubloons would thou like to spend on charisma?: (1-10)");
		int charisma=sc.nextInt();
		sc.nextLine();
		if ((charisma<=10)&&(charisma<=(20-strength-dexterity-intelligence))){
			System.out.println("Thou now have the charisma of "+charisma+" skunks!");
		}
		else{
			System.out.println("Ahh thou have spent too many dubloons, please reload for thy refund!");
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Thou are "+name+" the "+title+" of the high school of the Valley of the Cresent");
		System.out.println("Thou are a "+role+". Thy stats follow!");
		System.out.println("Strength - "+strength);
		System.out.println("Dexterity - "+dexterity);
		System.out.println("Intelligence - "+intelligence);
		System.out.println("Charisma - "+charisma);
		System.out.println();
		System.out.println("Good luck on thy quest "+name+"!");

	
		




	}
}
