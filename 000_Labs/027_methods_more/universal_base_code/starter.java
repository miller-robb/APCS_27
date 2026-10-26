/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);
		String name;
		BankAccount person=null;

		System.out.println("Hello and welcome to the ATM.");
		System.out.println("What information do you know?");
		System.out.println("1-Nothing");
		System.out.println("2-Owner");
		System.out.println("3-Owner and Initial deposit");
		System.out.println("(1-3):");
		int create=sc.nextInt();
		sc.nextLine();
		if(create==1){
			
			person=new BankAccount();

		}
		if(create==2){
			System.out.println("What is the owners name?");
			name=sc.nextLine();
			
			person=new BankAccount(name);

		}
		if(create==3){
			System.out.println("What is the owners name?");
			name=sc.nextLine();
			System.out.println("What is the initial deposit?");
			int depot=sc.nextInt();
			sc.nextLine();
			person=new BankAccount(name,depot);

		}

		person.infoIntoString();



		System.out.println("Would you like to check the accounts balance?(yes/no):");
		String check=sc.nextLine();
		
		if(check.equalsIgnoreCase("yes")){
			System.out.println(person.returnBalance());
		}
		System.out.println("Thanks for using this ATM!");
		
			
		






		
		
		

		
	}
}
