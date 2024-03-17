package Aula.Code.CardGame.Games;

import Aula.Code.CardGame.Model.Deck;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();

        deck.shuffle();

        deck.display();

        System.out.println("\uD83C\uDCA1");
        System.out.println("\uD83C\uDCA2");
        System.out.println("\uD83C\uDCAA");
        System.out.println("\uD83C\uDCAB");

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Consola 0", Font.PLAIN, 140)));

        JOptionPane.showMessageDialog(null, "\uD83C\uDCA1");
        JOptionPane.showMessageDialog(null, "\uD83C\uDCA2");
        JOptionPane.showMessageDialog(null, "\uD83C\uDCAA");
        JOptionPane.showMessageDialog(null, "\uD83C\uDCAB");


        JOptionPane.showMessageDialog(null, deck.distribute(5));

    }
}
