package com.example.Durak;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Olga on 03.10.2014.
 */
public class CardsDeck {
    private final int cardsDeckSize = 10;
    private final int minDegrees = 6;
    private final int maxDegrees = 14;
    private Cards trumpCard;

    /*
    Suits: "Spades", "Hearts", "Clubs", "Diamonds".
    Degrees: 11 - "Jack", 12 - "Dame", 13 - "King", 14 - "Ace".
     */

    public ArrayList<Cards> makeNewCardsDeck() {
        ArrayList<Cards> cartsDeck = new ArrayList<Cards>();
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};

        int i = 0;
        int k = 0;
        while (i <= cardsDeckSize) {
            for (int j = minDegrees; j <= maxDegrees; j++) {
                cartsDeck.add(new Cards(j, suits[k]));
                i++;
            }
            k++;
        }
        return cartsDeck;
    }

    public Cards getTrumpCard(ArrayList<Cards> cardDeck) {
        trumpCard = cardDeck.get(0);
        return trumpCard;
    }

    public void mixedCardDeck(ArrayList<Cards> cardDeck) {
        Collections.shuffle(cardDeck);
    }
}