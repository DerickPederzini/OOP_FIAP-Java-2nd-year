package Aula.Code.CardGame.Model;

public class Card {

    private final int value;
    private final Suit suit;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    public String toString(){

        String val = Integer.toString(value);

        switch (value){
            case 1:
                val = "A";
                break;
            case 11:
                val = "J";
                break;
            case 12:
                val = "Q";
                break;
            case 13:
                val = "K";
                break;


        }

        if(suit == Suit.OURO)
            return val + "♦";
        if(suit == Suit.PAUS)
            return val + "♣";
        if(suit == Suit.ESPADILHA)
            return val + "♠";

        return val + "♥";

    }
}
