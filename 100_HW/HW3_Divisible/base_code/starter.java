/*
 *	Author: Miller Robb
 *  Date: 9/24/26
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter your first integer: ");
		int num1;
		num1=sc.nextInt();
		sc.nextLine();
		System.out.print("Please enter your second integer: ");
		int num2;
		num2=sc.nextInt();
		sc.nextLine();
		boolean dog=((num1%2)==0);
		boolean cat=((num1%4)==0);
		boolean turtle=((num1%5)==0);
		boolean mac=((num2%2)==0);
		boolean cheese=((num2%4)==0);
		boolean bread=((num2%5)==0);
		if(dog&&cat&&turtle){
			System.out.println(num1+" is an even number!");
			System.out.println(num1+" is divisible by 2!");
			System.out.println(num1+" is divisible by 4!");
			System.out.println(num1+" is divisible by 5!");
		}
		else{
			if(dog){
				System.out.println(num1+" is an even number!");
				System.out.println(num1+" is divisible by 2!");
			}
			else{
				System.out.println(num1+" is an odd number!");
				System.out.println(num1+" is not divisible by 2!");
			}
			if (cat){
				System.out.println(num1+" is divisible by 4!");
			}
			else{
				System.out.println(num1+" is not divisible by 4!");
			}
			if(turtle){
				System.out.println(num1+" is divisible by 5");
			}
			else{
				System.out.println(num1+" is not divisible by 5!");
			}


		}
		System.out.println();
		if(mac&&cheese&&bread){
			System.out.println(num2+" is an even number!");
			System.out.println(num2+" is divisible by 2!");
			System.out.println(num2+" is divisible by 4!");
			System.out.println(num2+" is divisible by 5!");
		}
		else{
			if(mac){
				System.out.println(num2+" is an even number!");
				System.out.println(num2+" is divisible by 2!");
			}
			else{
				System.out.println(num2+" is an odd number!");
				System.out.println(num2+" is not divisible by 2!");
			}
			if (cheese){
				System.out.println(num2+" is divisible by 4!");
			}
			else{
				System.out.println(num2+" is not divisible by 4!");
			}
			if(bread){
				System.out.println(num2+" is divisible by 5");
			}
			else{
				System.out.println(num2+" is not divisible by 5!");
			}


		}
		
			

	

			
			
		
	}
}
