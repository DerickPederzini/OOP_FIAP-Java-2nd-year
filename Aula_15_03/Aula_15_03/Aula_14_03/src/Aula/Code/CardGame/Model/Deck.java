package Aula.Code.CardGame.Model;

import javax.swing.*;
import java.util.Random;

public class Deck {
    private Card [] cardDeck;
    private int top;

    public Deck() {
        this.cardDeck = new Card[52];

        int j = 0;
        for (int i = 1; i <= 13; i++) {
            cardDeck[j++] = new Card(i, Suit.OURO);
            cardDeck[j++] = new Card(i, Suit.ESPADILHA);
            cardDeck[j++] = new Card(i, Suit.PAUS);
            cardDeck[j++] = new Card(i, Suit.COPAS);
        }
        top = 51;
    }

    public Card buy(){
        Card card = cardDeck[top];
        top--;
        return card;
    }

    public Card[] distribute(int qtdCard){

        Card [] cards = new Card[qtdCard];

        for (int i = 0; i < qtdCard; i++) {
            cards[i] = buy();
        }
        return cards;
    }

    public void shuffle(){

        Random rand = new Random();

        int quantityShuffle = rand.nextInt(25,200);

        for (int i = 0; i < quantityShuffle; i++) {

            int j = rand.nextInt( 52);
            int l = rand.nextInt( 52);

            Card temp = cardDeck[j];
            cardDeck[j] = cardDeck[l];
            cardDeck[l] = temp;

        }

    }

    public void display(){

        for (int i = 0; i < cardDeck.length; i++) {

            System.out.println(cardDeck[i].toString());

        }

    }

}
