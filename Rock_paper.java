package Javacourse;

import java.util.*;

public class Rock_paper {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            //1.computer ch
            String[] choices = {"Rock", "Paper", "Scissors"};
            String computerchoice = choices[new Random().nextInt(choices.length)];
            System.out.println("computer make move");
            //2. user choice
            String usermove;
            System.out.println("It's your turn");
            while (true) {
                System.out.println("available moves :- Rock, Paper, Scissors");
                System.out.println("Eneter your move :");
                usermove = sc.nextLine();
                if (usermove.equalsIgnoreCase("Rock") || usermove.equalsIgnoreCase("Paper") || usermove.equalsIgnoreCase("Scissors")) {
                    System.out.println();
                    break;
                }
                System.out.println("Invalid move");
                System.out.println(" please select valide move");
            }
            System.out.println("computer move " + computerchoice);
            //3.check 
            if (computerchoice.equalsIgnoreCase(usermove)) {
                System.out.println("Its tie");
            } else if (usermove.equalsIgnoreCase("Rock")) {
                if (computerchoice.equals("Paper")) {
                    System.out.println("computer won\nBetter luck next time\n");
                } else if (computerchoice.equals("Scissors")) {
                    System.out.println("You won!!!\n congratulations..");
                }

            } else if (usermove.equalsIgnoreCase("Paper")) {
                if (computerchoice.equals("Scissors")) {
                    System.out.println("computer won\nBetter luck next time\n");
                } else if (computerchoice.equals("Rock")) {
                    System.out.println("You won!!!\n congratulations..");
                }
            } else if (usermove.equalsIgnoreCase("Scissors")) {
                if (computerchoice.equals("Rock")) {
                    System.out.println("computer won\nBetter luck next time\n");
                } else if (computerchoice.equals("Paper")) {
                    System.out.println("You won!!!\n congratulations..");
                }
            }
            System.out.println("Do wanna play again.!! yes/no");
            String again =sc.nextLine();
            if(again.equalsIgnoreCase("no")){
                break;
            }
        }
    }
}
