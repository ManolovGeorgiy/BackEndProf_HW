package com.org.cardgame;

import java.util.*;

public class CardGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers;

        while (true) {
            System.out.println("Введите количество игроков: ");

            if (scanner.hasNextInt()) {
                numberOfPlayers = scanner.nextInt();
                if (numberOfPlayers > 0) {
                    break;
                } else {
                    System.out.println("Количество игроков должно быть больше 0.");
                }
            } else {
                System.out.println("Введите корректное число игроков.");
                scanner.next();
            }
        }

        Deck deck = new Deck();
        deck.shuffle();

        List<Player> players = new ArrayList<>();
        for (int i = 1; i <= numberOfPlayers; i++) {
            players.add(new Player("Игрок " + i));
        }

        for (int i = 0; i < 5; i++) {
            for (Player player : players) {
                Card card = deck.drawCard();
                player.addCard(card);
            }
        }

        for (Player player : players) {
            System.out.println(player.getName() + " получил следующие карты:");
            for (Card card : player.getHand()) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}