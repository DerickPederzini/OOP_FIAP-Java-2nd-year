package Aula.Code;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Forca forca = new Forca();

        System.out.println("Want to start the Forca?");
     //   char startGame = input.next().toLowerCase().charAt(0);

        while(!forca.acertou() && !forca.enforcou() ){

            System.out.println("Make your first letter guess: ");
            char letterGuess = input.next().toLowerCase().charAt(0);

            forca.guess(letterGuess);

        }
        if(forca.enforcou()){
            System.out.println("Enforcou mano");
        }else{
            System.out.println("Boa mano");
        }

    }
}
