package com.org.cardgame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private final List<Card> hand = new ArrayList<>();


    public Player(String name) {
        this.name = name;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }
}

enum Suit {
    Крести, Бубны, Черви, Пики
}

enum Rank {
     Два, Три, Четыри, Пять, Шесть, Семь, Восемь, Девять, Десять, Валет, Дама, Король, Туз;


}