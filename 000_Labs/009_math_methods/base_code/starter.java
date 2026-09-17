/*
 *	Author: Miller Robb 
 *  Date: 9/10/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	double dog;
	dog=Math.max(13-6*11,30%7*(-2));
	System.out.println("Maximum = "+dog);
	double cat;
	cat=Math.sqrt(3*8+31%7);
	System.out.println("Square root = "+cat);
	double turtle;
	turtle=Math.pow(37/3,35%21);
	System.out.println("Power = "+turtle);
	double hampster;
	hampster=Math.max(Math.pow(2,14%3),Math.sqrt(2*6));
	System.out.println("Max = "+hampster);

	Scanner sc = new Scanner(System.in);
	System.out.print("Please provide a value (can include decimal points): ");
	double macaroni = sc.nextDouble();
	sc.nextLine();
	System.out.print("Please provide a second value (can include decimal points): ");
	double cheese = sc.nextDouble();
	sc.nextLine();
	double maximum; 
	maximum = Math.max(macaroni,cheese);
	double treeroot;
	treeroot = Math.sqrt(cheese);
	double empowered; 
	empowered = Math.pow(macaroni,cheese);
	System.out.println("Maximum of the first value: "+maximum);
	System.out.println("Squareroot of the second value: "+treeroot);
	System.out.println("The first value to the power of the second: "+empowered);
	
	}
}
