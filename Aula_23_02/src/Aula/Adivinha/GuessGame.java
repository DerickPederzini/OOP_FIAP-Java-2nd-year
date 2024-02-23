package Aula.Adivinha;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class GuessGame {

    static Scanner input = new Scanner(System.in);

    int answerNumber;
    int tryAttemps;

    public GuessGame() {
        this.answerNumber = RandomGenerator.getDefault().nextInt(1001);
        tryAttemps = 0;
    }

    public void gameManager(){

        System.out.println("Enter Guess: ");
        int guess = input.nextInt();

        gameManager(guess);
    }

    private void gameManager(int guess){

        if(tryAttemps != 0){
            System.out.println("=============================");
            System.out.println("Enter Guess: ");
            guess = input.nextInt();
        }

        this.tryAttemps = getTentativas();

        if(guess > answerNumber){
            System.out.println("You should guess a smaller number");
            gameManager(guess);
        }else if(guess < answerNumber){
            System.out.println("You should guess a bigger number");
            gameManager(guess);
        }else{
            System.out.println("Congratulations, you got it! The answer number is "+answerNumber);
        }


    }

    public int getTentativas(){

        this.tryAttemps++;

        int maxAttempts = 8;

       if(tryAttemps == maxAttempts){
           System.out.println("Attempt Number " + this.tryAttemps+ " of "+maxAttempts);
           System.out.println("You lost");
           System.exit(0);
       }

        System.out.println("Attempt Number " + this.tryAttemps+ " of "+maxAttempts);

        return this.tryAttemps;
    }
}
