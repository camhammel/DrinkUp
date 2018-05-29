package com.cameronhammel.cam.drinkup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class Eight extends AppCompatActivity
{

    String [] texts;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);

        texts = new String[10];
        texts[0] = "@, have 8 sips!";
        texts[1] = "@, take a drink!";
        texts[2] = "@, take a sip each time you swear in the next 5 turns";
        texts[3] = "@, take 3 sips!";
        texts[4] = "@, example";
        texts[5] = "@, example";
        texts[6] = "@, example";
        texts[7] = "@, example";
        texts[8] = "@, example";
        texts[9] = "@, example";


        playRound();
    }

    private void playRound()
    {
        tv = findViewById(R.id.eightText);
        refreshText(tv);
    }

    public void refreshText(View view)
    {
        tv.setText(generateText());
    }

    private String generateText()
    {
        String n = texts[(int) (Math.random() * texts.length)];
        n = n.replaceAll("@", MainActivity.players[0]);
        return n;
    }
}

