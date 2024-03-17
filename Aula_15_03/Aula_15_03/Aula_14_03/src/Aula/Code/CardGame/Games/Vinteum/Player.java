package Aula.Code.CardGame.Games.Vinteum;

import Aula.Code.CardGame.Model.Card;

import java.util.Scanner;

public class Player {

    private Card [] cards;
    private int points;
    private int top;

    public Player(Card card1, Card card2) {
        points = 0;
        top = 0;
        cards = new Card[15];

        receiveCard(card1);
        receiveCard(card2);
    }

    public void receiveCard(Card newCard){

        if(newCard.getValue() > 10)
            points += 10;
        else
            points += getPoints();

        cards[top] = newCard;
        top++;

    }

    public boolean wantCards(){

        Scanner input = new Scanner(System.in);
        System.out.println("Quer carta" + points + " (s/n)?");
        String ans = input.next();

        if(ans.equalsIgnoreCase("s"))
            return true;
        else
            return false;

    }


    public int getPoints() {
        return points;
    }
}
