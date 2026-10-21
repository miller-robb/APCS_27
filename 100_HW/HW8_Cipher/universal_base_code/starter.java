/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Is there a key for your code?(yes or no)");
		String key=sc.nextLine();
		if(key.equalsIgnoreCase("no")){
			System.out.println("What is the encoded text?:");
			String dog=sc.nextLine();
			System.out.println(Cipher.encode(dog));

		}
		if(key.equalsIgnoreCase("yes")){

			System.out.println("What is the encoded text?:");
			String cat=sc.nextLine();
			System.out.println("What number is the key?:");
			int num=sc.nextInt();
			sc.nextLine();


			System.out.println(Cipher.keyedEncode(cat,num));

		}
		
		
		

		

	}
}
