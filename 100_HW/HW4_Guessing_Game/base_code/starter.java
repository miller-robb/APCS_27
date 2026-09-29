/*
 *	Author: Miller
 *  Date: 9/27/26
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("The goal of the game is to guess the word with two hints");

		int question=(int)(Math.random()*(4-1))+1;
		if(question==1){
			System.out.println("Hint 1: it is an animal");
			System.out.println("What is your guess?: ");
			String guess11=sc.nextLine();
			if(guess11.equals("Turtle")||guess11.equals("turtle")){
				System.out.println("Correct the answer was turtle");

			}
			else{
				System.out.println("Nope. Heres your second hint: it has a hard shell");
				System.out.println("What is your guess: ");
				String guess12=sc.nextLine();
				if(guess12.equals("Turtle")||guess12.equals("turtle")){
					System.out.println("Correct the answer was turtle");
				}
				else{
					System.out.println("Nope. The answer was turtle. Better luck next time");
				}

			}
		}
			if(question==2){
			System.out.println("Hint 1: it is a food");
			System.out.println("What is your guess?: ");
			String guess11=sc.nextLine();
			if(guess11.equals("Spagetti")||guess11.equals("spagetti")){
				System.out.println("Correct the answer was spagetti");

			}
			else{
				System.out.println("Nope. Heres your second hint: it is usally served with meatballs");
				System.out.println("What is your guess: ");
				String guess12=sc.nextLine();
				if(guess12.equals("Spagetti")||guess12.equals("spagetti")){
					System.out.println("Correct the answer was spagetti");
				}
				else{
					System.out.println("Nope. The answer was spagetti. Better luck next time");
				}

			}


		}
		if(question==3){
			System.out.println("Hint 1: it is an item of clothing");
			System.out.println("What is your guess?: ");
			String guess11=sc.nextLine();
			if(guess11.equals("Socks")||guess11.equals("socks")){
				System.out.println("Correct the answer was socks");

			}
			else{
				System.out.println("Nope. Heres your second hint: they are put on before shoes");
				System.out.println("What is your guess: ");
				String guess12=sc.nextLine();
				if(guess12.equals("Socks")||guess12.equals("socks")){
					System.out.println("Correct the answer was socks");
				}
				else{
					System.out.println("Nope. The answer was socks. Better luck next time");
				}

			}
		}
	}
}
