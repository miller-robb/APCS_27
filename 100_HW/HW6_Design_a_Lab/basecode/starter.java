/*
 *	Author: Miller Robb
 *  Date: 10/2/26
 * 	Collaborator:
 */

import java.util.*;


public class starter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Hello and welcome to NUMBERDLE. You have 2 guesses to guess 3 numbers in some order!");
        
        int num1=(int)(Math.random()*9)+1;
        int num2=(int)(Math.random()*9)+1;
        int num3=(int)(Math.random()*9)+1;

        

        System.out.println("What is the first number in your sequence?");
        int guess11=sc.nextInt();
        sc.nextLine();
        System.out.println("What is the second number in your sequence?");
        int guess12=sc.nextInt();
        System.out.println("What is the thrid number in your sequence?");
        int guess13=sc.nextInt();
        System.out.println("Your first guess was "+guess11+guess12+guess13);

        

        if((guess11==num1)&&(guess12==num2)&&(guess13==num3)){
            System.out.println("Correct the number sequence was "+num1+num2+num3);
        }
        else{
            if((guess11==num1)){
                System.out.println("Your first number is correct and in the right spot");
            }
            else if((guess11==num2)||(guess11==num3)){
                System.out.println("Your first number is correct but in the wrong spot");
            }
            else{
                System.out.println("Your first number is not correct");
            }
            if((guess12==num2)){
                System.out.println("Your second number is correct and in the right spot");
            }
             else if((guess12==num1)||(guess12==num3)){
                System.out.println("Your second number is correct but in the wrong spot");
            }
            else{
                System.out.println("Your second number is not correct");
            }
              if((guess13==num3)){
                System.out.println("Your third number is correct and in the right spot");
            }
             else if((guess13==num1)||(guess13==num2)){
                System.out.println("Your third number is correct but in the wrong spot");
            }
            else{
                System.out.println("Your third number is not correct");
            }
        }

            
        System.out.println();
        System.out.println("Now we move onto the second guess!");
        System.out.println("What is the first number in your sequence?");
        int guess21=sc.nextInt();
        sc.nextLine();
        System.out.println("What is the second number in your sequence?");
        int guess22=sc.nextInt();
        System.out.println("What is the thrid number in your sequence?");
        int guess23=sc.nextInt();
        System.out.println("Your first guess was "+guess21+guess22+guess23);

        if((guess21==num1)&&(guess22==num2)&&(guess23==num3)){
            System.out.println("Correct the number sequence was "+num1+num2+num3);
        }
        else{
            if((guess21==num1)){
                System.out.println("Your first number is correct and in the right spot");
            }
            else if((guess21==num2)||(guess21==num3)){
                System.out.println("Your first number is correct but in the wrong spot");
            }
            else{
                System.out.println("Your first number is not correct");
            }
            if((guess22==num2)){
                System.out.println("Your second number is correct and in the right spot");
            }
             else if((guess22==num1)||(guess22==num3)){
                System.out.println("Your second number is correct but in the wrong spot");
            }
            else{
                System.out.println("Your second number is not correct");
            }
              if((guess23==num3)){
                System.out.println("Your third number is correct and in the right spot");
            }
             else if((guess23==num1)||(guess23==num2)){
                System.out.println("Your third number is correct but in the wrong spot");
            }
            else{
                System.out.println("Your third number is not correct");
            }
        }

        System.out.println("The correct number was "+num1+num2+num3);




        
        
        
    }
}
