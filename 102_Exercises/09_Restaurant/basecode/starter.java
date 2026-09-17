/*
 *	Author:  Miller Robb
 *  Date: 9/14/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("========================================");
		System.out.println("         WELCOME RESTAURANT OWNER!");
		System.out.println("========================================");	
		System.out.println();
		System.out.print("What is the name of your restaurant?   ");
		String name = sc.nextLine();
		System.out.println();
		System.out.print("What is your name?   ");
		String owner = sc.nextLine();
		System.out.println();
		System.out.println("Great to see you, "+owner+"! Let's set up the menu for "+name+"!");
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");
		System.out.println();
		System.out.println("--- Item #1 ---");
		System.out.print("Item name: ");
		String item1 = sc.nextLine();
		System.out.print("Price of "+item1+" ($):   ");
		double price1 = sc.nextDouble();
		sc.nextLine();
		System.out.print("How many "+item1+" would you like?   ");
		int amount1 = sc.nextInt();
		sc.nextLine();
		double total1;
		total1 = price1*amount1;
		System.out.println("Added "+amount1+"x "+item1+" to your order! ("+total1+")");
		System.out.println("--- Item #2 ---");
		System.out.print("Item name: ");
		String item2 = sc.nextLine();
		System.out.print("Price of "+item2+" ($):   ");
		double price2 = sc.nextDouble();
		sc.nextLine();
		System.out.print("How many "+item2+" would you like?   ");
		int amount2 = sc.nextInt();
		sc.nextLine();
		double total2;
		total2 = price2*amount2;
		System.out.println("Added "+amount2+"x "+item2+" to your order! ("+total2+")");
		System.out.println("--- Item #3 ---");
		System.out.print("Item name: ");
		String item3 = sc.nextLine();
		System.out.print("Price of "+item3+" ($):   ");
		double price3 = sc.nextDouble();
		sc.nextLine();
		System.out.print("How many "+item3+" would you like?   ");
		int amount3 = sc.nextInt();
		sc.nextLine();
		double total3;
		total3 = price3*amount3;
		System.out.println("Added "+amount3+"x "+item3+" to your order! ("+total3+")");
		System.out.print("Nice choices! What tip percentage would you like to leave? (ex.15,18,20): ");
		int tip1 = sc.nextInt();
		sc.nextLine();
		double tippercent;
		tippercent = 0.01*tip1;
		double totalitems;
		totalitems = total1+total2+total3;
		double tiptotal;
		tiptotal = totalitems*tippercent;
		double taxtotal;
		taxtotal = totalitems*0.0975;
		double totalcost;
		totalcost = totalitems+tiptotal+taxtotal;
		System.out.println("========================================");
		System.out.println("            "+name+" - Menu for Today"+"      ");
		System.out.println("========================================");
		System.out.println("Owner: "+owner);
		System.out.println("----------------------------------------");
		System.out.println("Item                    QTY          Price");
		System.out.println("----------------------------------------");
		System.out.println(item1+"               "+amount1+"       "+price1);
		System.out.println(item2+"               "+amount2+"       "+price2);
		System.out.println(item3+"               "+amount3+"       "+price3);
		System.out.println("----------------------------------------");
		System.out.println("Subtotal:                    "+totalitems);
		System.out.println("Tax (9.75%)                  "+taxtotal);
		System.out.println("Tip                          "+tip1+"%");
		System.out.println("Tip Amount:                  "+tiptotal);
		System.out.println("========================================");
		System.out.println("TOTAL:                       "+totalcost);
		System.out.println("========================================");
		System.out.println();
		System.out.println("Thanks for eating at "+name);
		System.out.println("Come back soon -- we'll always have a byte for you");

		
		

	}
}
