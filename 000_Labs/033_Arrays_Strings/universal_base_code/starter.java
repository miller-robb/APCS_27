/*
 *	Author:  Miller Robb
 *  Date: 11/9/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		String[]arr=new String[10];

		arr[0]="We wish you a merry Christmas";
		arr[1]="We wish you a merry Christmas";
		arr[2]="We wish you a merry Christmas";
		arr[3]="And a happy new year";
		arr[4]="Good tidings we bring to you and your kin;";
		arr[5]="Good tidings for Christmas and a Happy New Year!";
		arr[6]="Now bring us some figgy pudding,";
		arr[7]="Now bring us some figgy pudding,";
		arr[8]="Now bring us some figgy pudding, and a cup of good cheer!";
		arr[9]="We won't go until we get some,";

		int x=0;

		while(x<=9){
			System.out.println(arr[x]);
			x=x+1;
			
		}
		

		
	}
}
