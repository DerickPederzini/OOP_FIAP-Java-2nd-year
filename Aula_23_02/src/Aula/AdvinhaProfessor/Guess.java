package Aula.AdvinhaProfessor;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Guess {

    private int attempts;
    private final int sorted;

    public Guess() {
        this.attempts = 0;
        this.sorted = RandomGenerator.getDefault().nextInt(1000) + 1;
    }
    public int getAttempts() {return attempts;}

    public String guess(int guess){

        this.attempts += attemptCounter();

        if(guess == sorted) {
            return "You got It! ";

        }else if(guess < sorted) {
            System.out.println("Attempt number "+this.attempts);
            return "Put Bigger Number";

        }else{
            System.out.println("Attempt number "+this.attempts);
            return "Put Smaller Number";

        }

    }
    public int attemptCounter(){

        return 1;

    }



}
