/*
 *	Author:Miller Robb
 *  Date:11/9/26
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int []arr1=new int[1001];
		int x=0;

		int []arr2=new int[1001];
		int y=0;

		while(x<=1000){
			arr1[x]=3+3*x;
			System.out.println(arr1[x]);
			x=x+1;
			

		}
		System.out.println("");
		while(y<=1000){
			arr2[y]=1000-1*y;
			System.out.println(arr2[y]);
			y=y+1;
		}

		 
	}
}
