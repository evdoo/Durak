package com.example.Durak;

import java.util.ArrayList;

/**
 * Created by Olga on 04.10.2014.
 */
public class Player {

    private String name;
    private boolean firstMove;
    private ArrayList<Cards> playerCards;

    public Player(String name) {
        this.name = name;
    }

    public Player(){
    }

    public Player(boolean move) {
        this.firstMove = move;
    }

    public Player(ArrayList<Cards> playerCards) {
        this.playerCards = playerCards;
    }

    public Player(String name, boolean isFirstMove, ArrayList<Cards> playerCards) {
        this.name = name;
        this.firstMove = isFirstMove;
        this.playerCards = playerCards;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Cards> getPlayerCards() {
        return playerCards;
    }

    public boolean getFirstMove() {
        return firstMove;
    }

    public ArrayList<Cards> getCards(Player player, ArrayList<Cards> cardsDeck) {
        ArrayList<Cards> playerCardsSet = new ArrayList<Cards>();
        if (!cardsDeck.isEmpty()) {
            int i = 0;
            while (i < cardsDeck.size() && i < 6) {
                playerCardsSet.add(cardsDeck.get(i));
                cardsDeck.remove(i);
                i++;
            }
        }
        return playerCardsSet;
    }
}
