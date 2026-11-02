/*
 *	Author:  Miller Robb
 *  Date: 10/30/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		PooleDwarf num1=new PooleDwarf(randName(),(int)(Math.random()*100));
		PooleDwarf num2=new PooleDwarf(randName(),(int)(Math.random()*100));
		PooleDwarf num3=new PooleDwarf(randName(),(int)(Math.random()*100));
		PooleDwarf num4=new PooleDwarf(randName(),(int)(Math.random()*100));
		PooleDwarf num5=new PooleDwarf(randName(),(int)(Math.random()*100));
		PooleDwarf num6=new PooleDwarf(randName(),(int)(Math.random()*100));
		PooleDwarf num7=new PooleDwarf(randName(),(int)(Math.random()*100));

		boolean s12;
		boolean s13;
		boolean s14;
		boolean s15;
		boolean s16;
		boolean s17;


		s12=num1.isSameName(num2.getName());
		s13=num1.isSameName(num3.getName());
		s14=num1.isSameName(num4.getName());
		s15=num1.isSameName(num5.getName());
	 	s16=num1.isSameName(num6.getName());
		s17=num1.isSameName(num7.getName());

		int same=0;

		if(s12){
			same=same+1;

		}
		if(s13){
			same=same+1;

		}
		if(s14){
			same=same+1;

		}
		if(s15){
			same=same+1;

		}
		if(s16){
			same=same+1;

		}
		if(s17){
			same=same+1;

		}

	

		System.out.println(num1.getName()+" has "+same+" dwarven brothers with the same name");

		
	}
}
