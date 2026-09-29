/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		String dog=input.nextLine();
		
		boolean answer=(dog.equals("hello"));
		if(answer){
			System.out.print("correct");
		}
		else{
			System.out.print("wrong");
		}



		
	}
}
