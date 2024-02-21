package Cartas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cards as = new Cards(2, '♣');

        System.out.println(as);
        Cards card = new Cards(3, '♠');
        Cards card2 = new Cards(3, '♠');
        Cards card3 = new Cards(3, '♠');

        ArrayList<Cards> cardsP1 = new ArrayList<>();
        cardsP1.add(card);
        cardsP1.add(card2);
        cardsP1.add(card3);

        Hand handPlayer1 = new Hand(cardsP1);

        Player player1 = new Player(handPlayer1);


        Cards cardd = new Cards(2, '♠');
        Cards cardd2 = new Cards(2, '♠');
        Cards cardd3 = new Cards(2, '♠');

        ArrayList<Cards> cardsP2 = new ArrayList<>();
        cardsP1.add(cardd);
        cardsP1.add(cardd2);
        cardsP1.add(cardd3);

        Hand handPlayer2 = new Hand(cardsP2);

        Player player2 = new Player(handPlayer2);

        Cards cardVirada = new Cards(1, '♠');

        Game game = new Game(player1, player2, cardVirada);

        for (int i = 0; i < 3; i++) {
            if(handPlayer1.trucoHand.get(i) == handPlayer2.trucoHand.get(i)) {
                System.out.println("1 point to both "+(i+1));
                game.pointsP1++;
                game.pointsP2++;
            }
        }


    }
}
