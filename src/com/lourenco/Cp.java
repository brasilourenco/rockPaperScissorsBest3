package com.lourenco;

import java.util.Random;

public class Cp {
    private Random random;

    public Cp() {
        random = new Random(); //8 erros - esqueci do ()
    }

    public String cpLogic() {
        int randomNumber = random.nextInt(3);

        if (randomNumber == 1) {
            System.out.println("cp choose rock... \n");
            return "rock";
        } else if (randomNumber == 2) {
            System.out.println("cp choose paper... \n");
            return "paper";
        } else { // 9 erros - esqueci que era apenas else
            System.out.println("cp choose scissors... \n");
            return "scissors";
        }
    }
}
