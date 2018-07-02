package com.cameronhammel.cam.drinkup;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
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
    String [] words;
    String [] places;
    int [] colours;

    TextView tv;
    ConstraintLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);

        //names are accessed using the "@" key
        texts = new String[11];
        texts[0] = "@, list 8 Disney characters or take 3 sips!";
        texts[1] = "@, list 8 European countries or take 3 sips!";
        texts[2] = "@, take a sip each time you're caught swearing in the next 8 turns!";
        texts[3] = "@, draw a # using snapchat and send it to any 8 friends or take 4 sips!";
        texts[4] = "@, draw a # using snapchat and send it to any 8 friends or take 4 sips!";
        texts[5] = "@, draw a # using snapchat and send it to any 8 friends or take 4 sips!";
        texts[6] = "Drink 3 times if you haven't been to & in the past 8 months!";
        texts[7] = "Drink 3 times if you haven't been to & in the past 8 months!";
        texts[8] = "Drink 3 times if you haven't been to & in the past 8 months!";
        texts[9] = "@, send an erotic text of 8 words or more to a friend or take 5 sips!";
        texts[10] = "@, play the first 8 seconds of a random song on your phone. If nobody can guess the artist, take 3 sips.";


        //list of nouns accessed using the # key
        words = new String[11];
        words[0] = "giraffe";
        words[1] = "monkey";
        words[2] = "penis";
        words[3] = "superhero";
        words[4] = "mouse";
        words[5] = "beer";
        words[6] = "mustache on another player";
        words[7] = "winky face";
        words[8] = "self-portrait";
        words[9] = "pair of boobs";
        words[10] = "";

        //list of destinations accessed using the & key
        places = new String[11];
        places[0] = "a hospital";
        places[1] = "the gym";
        places[2] = "the dentist";
        places[3] = "a lake or ocean";
        places[4] = "a beach";
        places[5] = "a sports arena";
        places[6] = "bar, pub, or club";
        places[7] = "a movie theatre";
        places[8] = "the zoo";
        places[9] = "an airport";
        places[10] = "Toronto";

        playRound();
    }

    private void playRound()
    {
        tv = findViewById(R.id.eightText);
        cl = findViewById(R.id.constraintLayout);
        refreshText(tv);
    }

    @SuppressLint("ResourceAsColor")
    public void refreshText(View view)
    {
        cl.setBackgroundColor((int) (Color.CYAN * Math.random()));
        tv.setText(generateText());
    }

    private String generateText()
    {
        String n = texts[(int) (Math.random() * texts.length)];
        int x = (int) (Math.random() * words.length);
        int y = (int) (Math.random() * places.length);
        int z = (int) (Math.random() * MainActivity.finalplayers.size());
        n = n.replaceAll("@", MainActivity.finalplayers.get(z) + "");
        n = n.replaceAll("#", words[x]);
        n = n.replaceAll("&", places[y]);
        return n;
    }
}

