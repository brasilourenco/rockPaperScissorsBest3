package com.lourenco;

import java.util.Scanner;

public class Logic {
    private Scanner scanner;
    private User user;
    private Cp cp;

    public Logic() {
        scanner = new Scanner(System.in); //2 erros - esqueci do (System.in)
        user = new User(); //3 erros - esqueci do ()
        cp = new Cp(); //4 erros - esqueci do ()
    }

    public void game() {
        while (true) {

            System.out.println("Hi there, do you wanna play rock, paper, scissors? \n" + "enter 1 to rock; \n" + "enter 2 for paper \n" + "enter 3 for scissors \n");

            //user.userLogic(); - n era necessário

            String userGame = user.userLogic();
            String cpGame = cp.cpLogic();
            int counterUser = 0;
            int counterCp = 0;

            if (userGame.equals(cpGame)) {
                System.out.println("DRAW!");
                System.out.println("Do you wanna play again?");
            } else if (userGame.equals("rock") && cpGame.equals("scissors")) {
                counterUser++;
                if (counterUser == 3) {
                    System.out.println("YOU WIN!");
                }
                System.out.println("YOU WIN THE SET!");
                System.out.println("Wow, good! Do you wanna play again?");
            } else if (userGame.equals("paper") && cpGame.equals("rock")) {
                counterUser++;
                if (counterUser == 3) {
                    System.out.println("YOU WIN!");
                }
                System.out.println("YOU WIN THE SET!");
                System.out.println("Wow, good! Do you wanna play again?");
                counterUser++;
            } else if (userGame.equals("scissors") && cpGame.equals("paper")) {
                counterUser++;
                if (counterUser == 3) {
                    System.out.println("YOU WIN!");
                }
                System.out.println("YOU WIN THE SET!");
                System.out.println("Wow, good! Do you wanna play again?");
            } else if (userGame.equals("rock") && cpGame.equals("paper")) {
                counterCp++;
                if (counterCp == 3) {
                    System.out.println("YOU LOSE!");
                }
                System.out.println("YOU LOSE THE SET!");
                System.out.println("Yeah, I win! Do you wanna play again?");
            } else if (userGame.equals("paper") && cpGame.equals("scissors")) {
                counterCp++;
                if (counterCp == 3) {
                    System.out.println("YOU LOSE!");
                }
                System.out.println("YOU LOSE THE SET!");
                System.out.println("Yeah, I win! Do you wanna play again?");
            } else if (userGame.equals("scissors") && cpGame.equals("rock")) {
                counterCp++;
                if (counterCp == 3) {
                    System.out.println("YOU LOSE!");
                }
                System.out.println("YOU LOSE THE SET!");
                System.out.println("Yeah, I win! Do you wanna play again?");
            }

            System.out.println("enter 1 for continue; \n" + "enter 2 for close; \n");
            byte input = scanner.nextByte();

            if (input == 2) {
                System.out.println("Bye!");
                System.exit(0); //5 erros - equeci do  System.exit(0);
            }
        }
    }
}
