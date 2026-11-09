/*
 *	Author:Miller Robb
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int num){
		int x=num-1;
		while(x>1){
			if(num%x==0){
				return false;
			}
			else{
				x=x-1;
			}
		}
		return true;

	}
	public static void printPrimes(int num){
		int count=1;

		boolean prime=true;
		while(count<num){
			count=count+1;
			prime=checkPrime(count);
			if(prime){
				System.out.println(count);
			}
	
		}
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a number and we'll print every prime number until that point: ");
		int choice=sc.nextInt();
		
		printPrimes(choice);

		
	}
}
