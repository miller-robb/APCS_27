/*
 *	Author: Miller Robb
 *  Date: 10/6/26
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);


		System.out.println("Welcome to the testing Casino");
		System.out.println("You have $100 to begin betting with!");
		System.out.println("Each time you roll 2 of the same number your money will double!");
		System.out.println("Each time you roll 3 of the same number your money will triple!");
		System.out.println("");

		int money=100;
		int wager;
		String gamble;

		

		while(money>0){
			int num1=(int)(Math.random()*10)+1;
			int num2=(int)(Math.random()*10)+1;
			int num3=(int)(Math.random()*10)+1;

			System.out.println("Would you like to gamble? (Yes/yes/Y/y)");
			gamble=sc.nextLine();
			if(gamble.equalsIgnoreCase("Y")||gamble.equalsIgnoreCase("yes")){
				System.out.println("");
				System.out.println("Good you have $"+money+" left");
				System.out.println("How much would you like to wager?");
				wager=sc.nextInt();
				sc.nextLine();
				if(wager<=money){
					System.out.println("|"+num1+"|"+num2+"|"+num3+"|");
					if((num1==num2)&&(num1==num3)){
						System.out.println("");
						System.out.println("You have won the jackpot!! You tripled your money!!");
						money=(money-wager)+(wager*3);
						System.out.println("You now have $"+money+"!!");
					}
					else if((num1==num2)||(num1==num3)||(num3==num2)){
						System.out.println("");
						System.out.println("You won!! You doubled your money!!");
						money=(money-wager)+(wager*2);
						System.out.println("You now have $"+money+"!!");
					}
					else{
						System.out.println("");
						System.out.println("You lost, better luck next time!!");
						money=money-wager;
						System.out.println("You now have $"+money+"!!");
					}
				}
				else{
					System.out.println("You simply don't have the funds to bet that");
				}
			}
			else if(gamble.equalsIgnoreCase("no")||gamble.equalsIgnoreCase("n")){
				System.out.println("Im sorry that is the wrong option...");
				System.out.println("Please come back with a better attitude...we'll hold onto your $"+money+" until then...");
				break;
			}
			
		}
		System.out.println("Come back soon");
	}
}
