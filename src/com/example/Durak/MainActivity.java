package com.example.Durak;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void takeMove(Player player1, Player player2, CardsDeck cardDeck) {
        if (player1.getFirstMove()) {

        }
    }
}
