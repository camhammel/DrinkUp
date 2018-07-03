package com.cameronhammel.cam.drinkup;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class Eight extends AppCompatActivity
{

    String [] texts;
    String [] words;
    String [] places;
    String [] songs;
    List<String> completed;

    TextView tv;
    ConstraintLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);

        completed = new ArrayList<String>();
        completed.add("test");
        //names are accessed using the "@" key
        texts = new String[35];
        texts[0] = "@, list 8 Disney characters or take 3 sips";
        texts[1] = "@, list 8 European countries or take 3 sips";
        texts[2] = "@, take a sip each time you're caught swearing in the next 8 turns";
        texts[3] = "@, draw a # using snapchat and send it to any 8 friends or take 4 sips";
        texts[4] = "@, draw a # using snapchat and send it to any 8 friends or take 4 sips";
        texts[5] = "@, draw a # using snapchat and send it to any 8 friends or take 4 sips";
        texts[6] = "Drink 3 times if you haven't been to & in the past 8 months";
        texts[7] = "Drink 3 times if you haven't been to & in the past 8 months";
        texts[8] = "Drink 3 times if you haven't been to & in the past 8 months";
        texts[9] = "@, send an erotic text of 8 words or more to a friend or take 5 sips";
        texts[10] = "@, play the first 8 seconds of a random song on your phone. If nobody can guess the artist, take 3 sips";
        texts[11] = "If you've masturbated in the past 8 hours, take 3 sips";
        texts[12] = "@, distribute 8 sips to other players (it doesn't have to be fair!)";
        texts[13] = "@, pick your opponent. You will play rock-paper-scissors, and the winner will distribute 8 sips to other players";
        texts[14] = "@, insult the person to your left 8 times, or take 3 sips";
        texts[15] = "Drink 4 sips if you've ever had alcohol before 8:00am";
        texts[16] = "If your first name has 8 letters or more, drink 3 times";
        texts[17] = "@, list 8 synonyms of the word 'vagina' or drink 3 sips";
        texts[18] = "@, list 8 date night ideas or drink 3 times";
        texts[19] = "If you have a sibling with 8 or more years difference in age, drink 5 times";
        texts[20] = "The person in the room with the worst british accent must drink 4 times";
        texts[21] = "If you've gone mini-golfing in the past 8 months, give out 3 sips";
        texts[22] = "@, if you have $8 or less cash on hand, give out 5 sips";
        texts[23] = "The oldest player in the room may give out 8 sips";
        texts[24] = "Anyone who can't do 8 pushups must drink 4 times";
        texts[25] = "If you've been single for over 8 months, drink 4 times";
        texts[26] = "@, drink 3 times (tough luck!)";
        texts[27] = "If you've seen anyone in the room nude, drink 8 times";
        texts[28] = "If you enjoy cold pizza, drink twice";
        texts[29] = "Whoever has the strongest drink must both drink and give out 3 sips";
        texts[30] = "Go around the room and try to list 5 songs from the 90's. The first person that can, may give out 8 sips to other players";
        texts[31] = "Show your moves. Whoever can dance the best according to @ can give out 8 sips";
        texts[32] = "Whoever has the most snapchat friends may give out 8 sips";
        texts[33] = "@, sing the chorus of =. If you can, give out 8 sips";
        texts[34] = "@, you have 8 seconds to recite the alphabet. If you can't in time, drink 4 times";

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
        words[9] = "female body";
        words[10] = "buzz lightyear";

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

        //list of songs accessed using the = key
        songs = new String[10];
        songs[0] = "Piano Man by Billy Joel";
        songs[1] = "Roxanne by The Police";
        songs[2] = "Hotel California by The Eagles";
        songs[3] = "Stronger by Kanye West";
        songs[4] = "The James Bond theme";
        songs[5] = "Redbone by Childish Gambino";
        songs[6] = "The Final Countdown by Europe";
        songs[7] = "Stacy's Mom by Bowling For Soup";
        songs[8] = "I Want It That Way by the Backstreet Boys";
        songs[9] = "Sweet Caroline by Neil Diamond";

        playRound();
    }

    private void playRound()
    {
        tv = findViewById(R.id.eightText);
        cl = findViewById(R.id.constraintLayout);
        refreshText(tv);
    }

    @SuppressLint("ResourceAsColor")
    public void refreshText(View view) {

        String newText = generateText();

        if (completed.size() >= 50)
        {
            cl.setBackgroundColor(Color.RED);
            tv.setText("Thanks for playing!");

            for (int i=0; i<completed.size(); i++)
                Log.e("GAME_OVER: " + i, completed.get(i));
        }

        else if (!completed.contains(newText))
        {
            int c1 = (int) (50 + (Math.random() * 205));
            int c3 = (int) (50 + (Math.random() * 205));
            int c2 = (int) (50 + (Math.random() * 205));
            cl.setBackgroundColor(Color.rgb(c1, c2, c3));
            tv.setText(newText);
            completed.add(newText);
        }

        else
        {
            refreshText(view);
        }

    }

    private String generateText()
    {
        String n = texts[(int) (Math.random() * texts.length)];
        int v = (int) (Math.random() * songs.length);
        int x = (int) (Math.random() * words.length);
        int y = (int) (Math.random() * places.length);
        int z = (int) (Math.random() * MainActivity.finalplayers.size());
        n = n.replaceAll("@", MainActivity.finalplayers.get(z) + "");
        n = n.replaceAll("#", words[x]);
        n = n.replaceAll("&", places[y]);
        n = n.replaceAll("=", songs[v]);
        return n;
    }
}

