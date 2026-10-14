/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static int powe(int a, int b){
		int product=a;
		int begin=b-1;
		while (begin>0){
			product=product*a;
			begin=begin-1;

		}
		return product;

	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What number would you like to be your base?");
		int base=sc.nextInt();
		sc.nextLine();
		System.out.println("What would you like to be your power?");
		int power=sc.nextInt();


		System.out.println(base+" to the power of "+power+" is: "+(powe(base,power)));





		
	}
}
