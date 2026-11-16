/*
 *	Author: Miller Robb
 *  Date: 11/12/26
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int []arr=new int[20];
		System.out.println("----------------------------------------------------");
		System.out.println("These are the array values: ");
		for(int x=0; x<10;x++){
			arr[x]=(int)(Math.random()*9)+1;
			System.out.print(arr[x]+", ");

		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		
		int dup=(int)(Math.random()*9)+1;
		int count=0;
		System.out.println("The random number is "+dup+"!");
		for(int x=0; x<10;x++){
			if(arr[x]==dup){
				System.out.println("There is a dupicate at index "+x);
				count=count+1;
			}
		}
		System.out.println("There is "+count+" number of duplicates of "+dup+"!");
		System.out.println("----------------------------------------------------");

		System.out.println("Looking for 2 in a row");
		int countRow=0;
		for(int x=1; x<10;x++){
			if(arr[x]==arr[(x-1)]){
				System.out.println("There is a two of a row between indexes "+(x-1)+" and "+x+"!");
				countRow=countRow+1;

			}
		}
		if(countRow>0){
			System.out.println("There is "+countRow+" twos in a row!");
		}
		else{
			System.out.println("There is no twos in a row!");
		}




	}
}
