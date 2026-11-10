/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] nums=new int[(int)(Math.random()*150)+51];
		System.out.println("Elements: "+nums.length);
		
		for(int x=0; x<nums.length; x++){
			nums[x]=(int)(Math.random()*100)+1;

		}
		int min=nums.length-1;
		for(int y=0; y<nums.length; y++){
			if(nums[y]<min){
				min=nums[y];
			
			}
		}
		System.out.println("Minimum: "+min);

		int max=0;
		for(int z=0; z<nums.length; z++){
			if(nums[z]>max){
				max=nums[z];
			
			}
		}
		System.out.println("Maximum: "+max);

		int avg=0;
		int total=0;

		for(int e=0; e<nums.length; e++){
			total=total+nums[e];

		}
		System.out.println("Average: "+(total)/nums.length);






		
	}
}
