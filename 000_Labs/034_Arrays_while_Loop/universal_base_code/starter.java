/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int []arr1=new int[1001];
		int x=0;

		while(x<=1000){
			arr1[x]=(int)(Math.random()*10);
			System.out.println(arr1[x]);
			x=x+1;
			

		}

		
	}
}
