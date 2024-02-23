package Aula.AdvinhaProfessor;

import java.util.Scanner;

public class Game {

    public void GetGame() {
        Scanner input = new Scanner(System.in);
        Guess game = new Guess();

        int maxAttempts = 12;

        while (game.getAttempts() != maxAttempts) {
            System.out.println("Input your guess: ");
            int guess = input.nextInt();


            String resp = game.guess(guess);

            System.out.println(resp);

            if (resp.equalsIgnoreCase("Você Acertou")) {
                System.out.println(game.getAttempts() + "attempts");
            }
        }
    }
}
