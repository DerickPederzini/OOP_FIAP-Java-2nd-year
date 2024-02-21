package Cartas;

import java.sql.Time;
import java.util.ArrayList;

public class Game {

     Player player1;
     int pointsP1;
     int pointsP2;
     Player player2;
     Cards cardVirada;

    public Game(Player player1, Player player2, Cards cardVirada) {
        this.player1 = player1;
        this.player2 = player2;
        this.cardVirada = cardVirada;
    }
}
