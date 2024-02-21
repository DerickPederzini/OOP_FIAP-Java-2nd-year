package Cartas;

import java.util.ArrayList;

public class Hand {
    ArrayList<Cards> trucoHand;

    public Hand(ArrayList<Cards> trucoHand) {
        if(trucoHand.size() > 3) throw new RuntimeException("TAMO JOGANDO TRUCO PARCEIRO, SÃO 3 CARTAS");
        this.trucoHand = trucoHand;
    }
}
