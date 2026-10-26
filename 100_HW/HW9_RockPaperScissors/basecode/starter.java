/*
 *	Author:Miller Robb
 *  Date:10/25/26
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static String getObject(){
        int rps=(int)(Math.random()*3)+1;
        String rock="rock";
        String paper="paper";
        String scissors="scissors";
        if (rps==1){
            return rock;
        }
         if (rps==2){
            return paper;
        }
         if (rps==3){
            return scissors;
        }
        else{
            return "no object";
        }
    }
    public static String compare2(String user,String random){
        String userIn=user;
        String comIn=random;
        if(user.equalsIgnoreCase(random)){
            return "tie";
        }
        if(userIn.equalsIgnoreCase("rock")&&comIn.equalsIgnoreCase("scissors")){
            return "win";
           }
        if(userIn.equalsIgnoreCase("scissors")&&comIn.equalsIgnoreCase("paper")){
           return "win";
        }
        if(userIn.equalsIgnoreCase("paper")&&comIn.equalsIgnoreCase("rock")){
            return "win";
        }
        if(userIn.equalsIgnoreCase("rock")&&comIn.equalsIgnoreCase("paper")){
           return "loss";
        }
        if(userIn.equalsIgnoreCase("scissors")&&comIn.equalsIgnoreCase("rock")){
           return "loss";
        }
        if(userIn.equalsIgnoreCase("paper")&&comIn.equalsIgnoreCase("scissors")){
          return "loss";
        }
        else{
           return "none";
        }
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Would you like to play rock, paper, scissors?(yes/no/done):");
        String play=sc.nextLine();
        String userObj;
        String wlt;
        int gameAmount;
        int x;
        String com1;
        String com2;
        String comResult;
        int tie;
        int win;
        int loss;
        while(play.equalsIgnoreCase("yes")||play.equalsIgnoreCase("no")){
            if (play.equalsIgnoreCase("yes")){
                System.out.println("Which object would you like to use?(Rock/Paper/Scissors):");
                userObj=sc.nextLine();
                wlt=compare2(userObj,getObject());
                if(wlt.equals("win")){
                    System.out.println("You won!");
                    System.out.println("----------------------------------------");

                }
                if(wlt.equals("loss")){
                    System.out.println("You lost!");
                    System.out.println("----------------------------------------");
                }
                if(wlt.equals("tie")){
                    System.out.println("You tied!");
                    System.out.println("----------------------------------------");
                }
                else if(wlt.equals("none")){
                    System.out.println("Please play again");
                    System.out.println("----------------------------------------");
                }
                System.out.println("What would you like to do now?");
                System.out.println("Would you like to play rock, paper, scissors?(yes/no/done):");
                play=sc.nextLine();

            



            }
            if(play.equalsIgnoreCase("no")){
                System.out.println("How many times would you like the computer to play?");
                gameAmount=sc.nextInt();
                sc.nextLine();
                x=0;
                tie=0;
                win=0;
                loss=0;

                while (x<=gameAmount){
                    com1=getObject();
                    com2=getObject();
                    comResult=compare2(com1,com2);
                    if(comResult.equals("win")){
                        win=win+1;
                        x=x+1;
                    }
                    else if(comResult.equals("loss")){
                        loss=loss+1;
                        x=x+1;
                    }
                    else if(comResult.equals("tie")){
                        tie=tie+1;
                        x=x+1;

                    }
                   
                        
                    


                }
                System.out.println("Wins: "+win);
                System.out.println("Losses: "+loss);
                System.out.println("Ties: "+tie);
                System.out.println("----------------------------------------");
                System.out.println("What would you like to do now?");
                System.out.println("Would you like to play rock, paper, scissors?(yes/no/done):");
                play=sc.nextLine();
            }

        }
       

    }
}
