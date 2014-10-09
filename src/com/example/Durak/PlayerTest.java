package com.example.Durak;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Olga on 09.10.2014.
 */
public class PlayerTest {

    @Test
    public void testGetName() {
        Player pl = new Player("Vasya");
        String s = pl.getName();

        assertEquals("Vasya", s);
    }

    @Test
    public void testGetFirstMove() {
        Player pl = new Player(false);
        boolean isMove = pl.getFirstMove();

        assertEquals(false, isMove);
    }

    @Test
    public void testGetCards() {
        ArrayList<Cards> list = new ArrayList<Cards>();
        list.add(new Cards(6, "Spades"));
        list.add(new Cards(7, "Spades"));
        list.add(new Cards(8, "Spades"));
        list.add(new Cards(9, "Spades"));
        list.add(new Cards(10, "Spades"));
        list.add(new Cards(11, "Spades"));
        list.add(new Cards(12, "Spades"));
        list.add(new Cards(13, "Spades"));

        ArrayList<Cards> expectList = new ArrayList<Cards>();
        list.add(new Cards(6, "Spades"));
        list.add(new Cards(7, "Spades"));
        list.add(new Cards(8, "Spades"));
        list.add(new Cards(9, "Spades"));
        list.add(new Cards(10, "Spades"));
        list.add(new Cards(11, "Spades"));

        Player pl = new Player();

        ArrayList<Cards> actualList;
        actualList = pl.getCards(pl, list);

        assertEquals(expectList, actualList);
    }
}
