package com.lourenco;

import java.util.Scanner;

public class User {
    private Scanner scanner;

    public User() {
        scanner = new Scanner(System.in); //6 erros - esqueci do (System.in)
    }

    public String userLogic() {
        byte input = scanner.nextByte();

        if (input == 1) {
            System.out.println("you choose rock... \n");
            return "rock";
        } else if (input == 2) {
            System.out.println("you choose paper... \n");
            return "paper";
        } else if (input == 3) {
            System.out.println("you choose scissors... \n");
            return "scissors";
        } else {
            System.err.println("Invalid Input");
            System.exit(0);
            return ""; // 7 erros - esqueci do return ""
        }
    }
}