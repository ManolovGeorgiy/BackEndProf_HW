package com.org.cardgame;

public class Card {
    private final String suit;
    private final String rank;

    public Card(Suit suit, Rank rank) {
        this.suit = String.valueOf(suit);
        this.rank = String.valueOf(rank);
    }

    @Override
    public String toString() {
        return rank + " " + suit;
    }
}
