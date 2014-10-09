package com.example.Durak;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Olga on 09.10.2014.
 */
public class CardsDeckTest {

    @Test
    public void testMakeNewCardsDeck() {
        CardsDeck deck = new CardsDeck();

        ArrayList<Cards> expectDeck = new ArrayList<Cards>();
        expectDeck.add(new Cards(6, "Spades"));
        expectDeck.add(new Cards(7, "Spades"));
        expectDeck.add(new Cards(8, "Spades"));
        expectDeck.add(new Cards(9, "Spades"));
        expectDeck.add(new Cards(10, "Spades"));
        expectDeck.add(new Cards(11, "Spades"));
        expectDeck.add(new Cards(12, "Spades"));
        expectDeck.add(new Cards(13, "Spades"));
        expectDeck.add(new Cards(14, "Spades"));
        expectDeck.add(new Cards(6, "Hearts"));

        ArrayList<Cards> actualDeck;
        actualDeck = deck.makeNewCardsDeck();

        assertEquals(expectDeck, actualDeck);
    }

    @Test
    public void testGetTrumpCard() {
        CardsDeck deck = new CardsDeck();

        ArrayList<Cards> cardDeck = new ArrayList<Cards>();
        cardDeck.add(new Cards(6, "Spades"));
        cardDeck.add(new Cards(7, "Spades"));
        cardDeck.add(new Cards(8, "Spades"));

        Cards expectTrump = new Cards(6, "Spades");
        Cards actualTrump = deck.getTrumpCard(cardDeck);

        assertEquals(expectTrump, actualTrump);
    }
}
