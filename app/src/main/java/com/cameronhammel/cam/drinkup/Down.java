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
public class Down extends AppCompatActivity
{

    public static final String ERROR = "error";
    String [] texts;
    String [] words;
    String [] places;
    String [] songs;
    List<String> completed;
    int turncounter = -1;
    String swearvirus;

    TextView tv;
    ConstraintLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_down);

        tv = findViewById(R.id.downText);
        cl = findViewById(R.id.downConstraintLayout);

        completed = new ArrayList<String>();
        completed.add("test");
        //names are accessed using the "@" key
        texts = new String[60];
        texts[0] = "@, list 8 Disney characters or take 3 sips";
        texts[1] = "@, list 6 European countries or take 3 sips";
        texts[2] = "@, take a sip each time you're caught swearing in the next 5 turns";
        texts[3] = "@, draw # using snapchat and send it to any 5 friends or take 4 sips";
        texts[4] = "@, draw # using snapchat and send it to any 5 friends or take 4 sips";
        texts[5] = "@, if > is a pussy drinker give them 3 drinks. If they're outdrinking you drink 4 drinks";
        texts[6] = "Drink 3 times if you've been to & in the past 8 months";
        texts[7] = "Drink 3 times if you've been to & in the past 4 months";
        texts[8] = "Hand the phone over to @. @, imitate a #; if nobody is able to guess what you're imitating, drink 3 times";
        texts[9] = "@, send an erotic text of 10 words or more to a friend or take 4 sips";
        texts[10] = "@, play the first 8 seconds of a random song on your phone. If nobody can guess the artist, take 3 sips";
        texts[11] = "If you've masturbated in the past 24 hours, take 3 sips";
        texts[12] = "@, distribute 8 sips to other players (it doesn't have to be fair!)";
        texts[13] = "@, pick your opponent. You will play rock-paper-scissors, and the loser will take 4 sips";
        texts[14] = "@, insult the person to your left 5 times, or take 3 sips";
        texts[15] = "Drink 4 sips if you've ever had alcohol before 10:00am";
        texts[16] = "If your first name has 6 letters or more, drink 3 times";
        texts[17] = "@, list 7 synonyms of the word 'vagina' or drink 3 sips";
        texts[18] = "@, list 5 date night ideas or drink 3 times";
        texts[19] = "If you have a sibling with 6 or more years difference in age, drink 4 times";
        texts[20] = "Each player will do their best impression of the Queen. The player in the room with the worst british accent must drink 3 times";
        texts[21] = "If you've been to a country concert, take two sips";
        texts[22] = "@, if you have less than $10 cash on hand, take 5 sips";
        texts[23] = "The oldest player in the room may give out 8 sips";
        texts[24] = "Anyone who can't do 10 pushups must drink 4 times";
        texts[25] = "If you've been single for over a year, drink 4 times (you're welcome)";
        texts[26] = "@, drink 3 times (tough luck!)";
        texts[27] = "If you've seen anyone in the room nude, drink 8 times";
        texts[28] = "If you enjoy cold pizza, drink twice";
        texts[29] = "Whoever has the strongest drink may give out 3 sips";
        texts[30] = "Go around the room and list songs from the 80's. The first person that can't list a song must take 5 sips";
        texts[31] = "Show your moves. The worst dancer according to @ must take 6 sips";
        texts[32] = "Whoever has the most snapchat friends may give out 8 sips";
        texts[33] = "@, sing the chorus of =. If you can, give out 8 sips";
        texts[34] = "@, you have 8 seconds to recite the alphabet. If you can't in time, drink 4 times";
        texts[35] = "If you're following over 750 people on Instagram, drink twice";
        texts[36] = "@, try to make > laugh. If you can within 30 seconds, they must take 5 sips";
        texts[37] = "If you own a record or cd player (cars don't count), give out 8 sips to your choice of players";
        texts[38] = "@, imitate another player of your choice. If > is able to guess which player @ is imitating correctly, the imitated player must drink 4 times";
        texts[39] = "If you've ever borrowed clothes from a partner, take 3 sips";
        texts[40] = "If you have a car that's 2015 or newer, take 4 sips";
        texts[41] = "If you've ever had a partner with over a 5 year age gap, take 5 sips";
        texts[42] = "If you know photoshop, give out 6 sips";
        texts[43] = "If you play 2+ hrs of video games per day, take 4 sips";
        texts[44] = "If you have an iPhone 7 or newer, take 4 sips";
        texts[45] = "The first person to blink in the next 10 seconds must drink 3 times, starting now";
        texts[46] = "Drink 3 times if you're currently holding your drink in your hand";
        texts[47] = "Go around the room listing Beatles songs. The first person that can't must drink 4 times";
        texts[48] = "@, whoever you think has or had the highest GPA in the room must drink 3 times";
        texts[49] = "If you've ever worked at a restaurant, drink 4 times";
        texts[50] = "If you've ever gone to work or class while drunk, take 5 sips";
        texts[51] = "If you've ever gone to work or class hungover, take 3 sips";
        texts[52] = "If you've bought a new phone in the past year, take 3 sips";
        texts[53] = "@, whoever you think is the most optimistic in the room must take 4 sips";
        texts[54] = "@, whoever you think is the most pessimistic in the room must take 4 sips";
        texts[55] = "@, whoever you think has the best view in the room must take 3 sips";
        texts[56] = "@, whoever you think has the nicest house must drink 4 times";
        texts[57] = "@, whoever you think is the best looking must drink 3 times";
        texts[58] = "@, whoever you think is the most ambitious must drink twice";
        texts[59] = "@, whoever you think is the most nerdy must drink 4 times";



        //list of nouns accessed using the # key
        words = new String[30];
        words[0] = "a giraffe";
        words[1] = "a monkey";
        words[2] = "a penis";
        words[3] = "a superhero";
        words[4] = "a mouse";
        words[5] = "a beer";
        words[6] = "a mustache on another player";
        words[7] = "a winky face";
        words[8] = "a self-portrait";
        words[9] = "a female body";
        words[10] = "buzz lightyear";
        words[11] = "a cereal mascot";
        words[12] = "God";
        words[13] = "spontaneous combustion";
        words[14] = "bat-shit crazy amish folk";
        words[15] = "a didgeridoo";
        words[16] = "a succubus";
        words[17] = "a pioneer";
        words[18] = "a government";
        words[19] = "a booty";
        words[20] = "a thong";
        words[21] = "a catamaran";
        words[22] = "lasagna";
        words[23] = "a boogeyman";
        words[24] = "a toilet";
        words[25] = "Rick Astley";
        words[26] = "fireworks";
        words[27] = "Barack Obama";
        words[28] = "a kitten";
        words[29] = "a kamikaze";

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
        songs[4] = "the Mission Impossible theme";
        songs[5] = "Redbone by Childish Gambino";
        songs[6] = "The Final Countdown by Europe";
        songs[7] = "Stacy's Mom by Bowling For Soup";
        songs[8] = "I Want It That Way by the Backstreet Boys";
        songs[9] = "Sweet Caroline by Neil Diamond";

        play();
    }

    private void play()
    {
        refreshText(tv);
    }

    @SuppressLint("ResourceAsColor")
    public void refreshText(View view) {

        String newText = generateText();

        if (completed.size() >= 50)
        {
            cl.setBackgroundColor(Color.RED);
            tv.setText(R.string.game_over);

            for (int i=0; i<completed.size(); i++)
                Log.e("GAME_OVER: " + i, completed.get(i));
        }


        else if (newText.contains(ERROR))
        {
            refreshText(view);
        }

        else
            if (newText.contains("swearing"))
            {
                swearvirus = newText.substring(0, newText.indexOf(","));
                turncounter = 8;
            }

            if (turncounter == 0)
            {
                cl.setBackgroundColor(Color.GREEN);
                tv.setText(String.format("%s%s", swearvirus, getString(R.string.you_may_swear)));
                turncounter = -1;
            }

            else
                {
                int c1 = (int) Math.abs(((Math.random() * 255) - 50));
                int c3 = (int) Math.abs(((Math.random() * 255) - 50));
                int c2 = (int) Math.abs(((Math.random() * 255) - 50));
                cl.setBackgroundColor(Color.rgb(c1, c2, c3));
                Log.d("Down Color: ", "" + c1 + ", " + c2 + ", " + c3);
                tv.setText(newText);
                //completed.add(newText);
                turncounter--;
            }

    }

    private String generateText() {
        String n = texts[(int) (Math.random() * texts.length)];

        if (!completed.contains(n)) {
            int v = (int) (Math.random() * songs.length);
            int x = (int) (Math.random() * words.length);
            int y = (int) (Math.random() * places.length);
            int z = (int) (Math.random() * MainActivity.finalplayers.size());
            int z2 = (int) (Math.random() * MainActivity.finalplayers.size());
            int counter = 0;
            while (z2 == z || counter <= 4) {
                z2 = (int) (Math.random() * MainActivity.finalplayers.size());
                counter++;
            }

            completed.add(n);
            n = n.replaceAll("@", MainActivity.finalplayers.get(z) + "");
            n = n.replaceAll(">", MainActivity.finalplayers.get(z2) + "");
            n = n.replaceAll("#", words[x]);
            n = n.replaceAll("&", places[y]);
            n = n.replaceAll("=", songs[v]);
            return n;
        } else
            return ERROR;
    }
}

