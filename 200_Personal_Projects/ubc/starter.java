/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First Number: ");
		int num1 = sc.nextInt();
		System.out.println("Second number (decimal): ");
		Double num2 = sc.nextDouble();
		double answer;
		answer = Math.pow(num2,num1);
		System.out.print(num2+"to the"+num1+"power,is ");
		System.out.println(answer);
		



		
	}
}
