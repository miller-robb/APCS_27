/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Dog odie= new Dog("Odie",12);
		Dog frankie=new Dog("Frankie","Labrador");

		boolean mailman=odie.isSleeping();
		if(mailman==true){
			odie.bark();
		}
		else{
			System.out.println(odie.getName()+" is asleep and doesn't bark");
		}

		if(mailman==true){
			frankie.bark();
		}
		else{
			System.out.println(frankie.getName()+" doesn't hear "+odie.getName()+" bark, so they don't bark!");
		}



	}
}
