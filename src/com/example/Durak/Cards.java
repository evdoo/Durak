package com.example.Durak;

/**
 * Created by Olga on 03.10.2014.
 */
public class Cards {
    private int degrees;
    private String suit;

    public Cards(int degrees, String suit) {
        this.degrees = degrees;
        this.suit = suit;
    }

    public int getDegrees(Cards card) {
        return card.degrees;
    }

    public String getSuit(Cards card) {
        return card.suit;
    }
}
