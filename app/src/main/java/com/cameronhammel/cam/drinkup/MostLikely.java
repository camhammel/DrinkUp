package com.cameronhammel.cam.drinkup;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.provider.MediaStore;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MostLikely extends AppCompatActivity
{

    ConstraintLayout bg;
    TextView displayText;
    TextView countdown;
    Button activate;
    String[] contentArray;
    MediaPlayer mediaPlayer1, mediaPlayer2;
    ArrayList<String> completed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_most_likely);

        bg = findViewById(R.id.mostConstraintLayout);
        displayText = findViewById(R.id.mostMainTextView);
        countdown = findViewById(R.id.mostCountdownText);
        activate = findViewById(R.id.startTimer);
        mediaPlayer1 = MediaPlayer.create(this, R.raw.sound83);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.bow);

        completed = new ArrayList<>();
        contentArray = new String[100];
        contentArray[0] = "Who is most likely to black out tonight?";
        contentArray[1] = "Who is most likely to adopt a dog?";
        contentArray[2] = "Who is most likely to not finish their food?";
        contentArray[3] = "Who is most likely to become single after winning the lottery?";
        contentArray[4] = "Who is most likely to be convicted of aggravated assault?";
        contentArray[5] = "Who is most likely to forget their passport?";
        contentArray[6] = "Who is most likely to become Instagram famous?";
        contentArray[7] = "Who is most likely to be on TV?";
        contentArray[8] = "Who is most likely to die first in a zombie apocalypse?";
        contentArray[9] = "Who is most likely to be a gold digger?";
        contentArray[10] = "Who is most likely to become a stripper?";
        contentArray[11] = "Who is most likely to become addicted to coffee?";
        contentArray[12] = "Who is most likely to get stuck in an elevator?";
        contentArray[13] = "Who is most likely to break their phone screen?";
        contentArray[14] = "Who is most likely to move to another country?";
        contentArray[15] = "Who is most likely to burn their house down?";
        contentArray[16] = "Who is most likely to burn someone else's house down?";
        contentArray[17] = "Who is most likely to buy a ferrari?";
        contentArray[18] = "Who is most likely to buy a sex doll?";
        contentArray[19] = "Who is most likely to read or work at a party?";
        contentArray[20] = "Who is most likely to cause a car accident?";
        contentArray[21] = "Who is most likely to complain about food?";
        contentArray[22] = "Who is most likely to get an STD?";
        contentArray[23] = "Who is most likely to cry over a movie?";
        contentArray[24] = "Who is most likely to appear in a music video?";
        contentArray[25] = "Who is most likely to take any bet?";
        contentArray[26] = "Who is most likely to talk to people in a public bathroom?";
        contentArray[27] = "Who is most likely to join a cult?";
        contentArray[28] = "Who is most likely to be embarrassed by their parents?";
        contentArray[29] = "Who is most likely to have a bad yearbook photo?";
        contentArray[30] = "Who is most likely to believe in superstition?";
        contentArray[31] = "Who is most likely to run a bar?";
        contentArray[32] = "Who is most likely to walk into a window?";
        contentArray[33] = "Who is most likely to get a speeding ticket?";
        contentArray[34] = "Who is most likely to forget their own birthday?";
        contentArray[35] = "Who is most likely to fall asleep before midnight on New Year's?";
        contentArray[36] = "Who is most likely to dress up as a video game character?";
        contentArray[37] = "Who is most likely to cheat on a test?";
        contentArray[38] = "Who is most likely to dye their hair?";
        contentArray[39] = "Who is most likely to offend a stranger?";
        contentArray[40] = "Who is most likely to get back with their ex?";
        contentArray[41] = "Who is most likely to not know the day of the week?";
        contentArray[42] = "Who is most likely to lock their keys in their car?";
        contentArray[43] = "Who is most likely to bake their friends cookies?";
        contentArray[44] = "Who is most likely to visit another country first?";
        contentArray[45] = "Who is most likely to go to work while drunk?";
        contentArray[46] = "Who is most likely to correct someone's spelling?";
        contentArray[47] = "Who is most likely to be able to live without a phone?";
        contentArray[48] = "Who is most likely to use snapchat in the next 10 minutes?";
        contentArray[49] = "Who is most likely to get worked up about a movie?";
        contentArray[50] = "Who is most likely to cry while being pulled over by a police officer?";
        contentArray[51] = "Who is most likely to take horrible pictures?";
        contentArray[52] = "Who is most likely to take great pictures?";
        contentArray[53] = "Who is most likely to see two or more movies in a week?";
        contentArray[54] = "Who is most likely to skip work to drink?";
        contentArray[55] = "Who is most likely to hurt themselves trying to use fireworks?";
        contentArray[56] = "Who is most likely to be terrible with computers?";
        contentArray[57] = "Who is most likely to be youtube-famous?";
        contentArray[58] = "Who is most likely to lose their wallet at a party?";
        contentArray[59] = "Who is most likely to want McDonalds at 2:00am?";
        contentArray[60] = "Who is most likely to see two concerts in a month?";
        contentArray[61] = "Who is most likely to become a crazy cat person?";
        contentArray[62] = "Who is most likely to get an expensive haircut?";
        contentArray[63] = "Who is most likely to get a terrible haircut?";
        contentArray[64] = "Who is most likely to order multiple desserts at a restaurant?";
        contentArray[65] = "Who is most likely to order two entrees at a restaurant?";
        contentArray[66] = "Who is most likely to eat a tub of ice cream?";
        contentArray[67] = "Who is most likely to fall down the stairs?";
        contentArray[68] = "Who is most likely to start an arguement?";
        contentArray[69] = "Who is most likely to lose their keys?";
        contentArray[70] = "Who is most likely to discover new music?";
        contentArray[71] = "Who is most likely to have a terrible music taste?";
        contentArray[72] = "Who is most likely to always have the newest phone?";
        contentArray[73] = "Who is most likely to spend 250 dollars on a night out?";
        contentArray[74] = "Who is most likely to be careful with their money?";
        contentArray[75] = "Who is most likely to die alone?";
        contentArray[76] = "Who is most likely to become an avid sports fan?";
        contentArray[77] = "Who is most likely to not finish their drink?";
        contentArray[78] = "Who is most likely to marry young?";
        contentArray[79] = "Who is most likely to get pizza three times in a week?";
        contentArray[80] = "Who is most likely to appreciate art at a museum?";
        contentArray[81] = "Who is most likely to be bored at a museum?";
        contentArray[82] = "Who is most likely to never leave their hometown?";
        contentArray[83] = "Who is most likely to get multiple degrees?";
        contentArray[84] = "Who is most likely to claim that they're funny?";
        contentArray[85] = "Who is most likely to claim that they're fashionable?";
        contentArray[86] = "Who is most likely to claim that they're smart?";
        contentArray[87] = "Who is most likely to claim that they're dumb?";
        contentArray[88] = "Who is most likely to go to bed at 3am?";
        contentArray[89] = "Who is most likely to pull an all-nighter?";
        contentArray[90] = "Who is most likely to date someone athletic?";
        contentArray[91] = "Who is most likely to watch back-to-back hockey games?";
        contentArray[92] = "Who is most likely to avoid relationships at all costs?";
        contentArray[93] = "Who is most likely to cheat on their partner?";
        contentArray[94] = "Who is most likely to never go to a gym?";
        contentArray[95] = "Who is most likely to sleep over at the gym?";
        contentArray[96] = "Who is most likely to befriend a stranger?";
        contentArray[97] = "Who is most likely to make a conversation awkward?";
        contentArray[98] = "Who is most likely to find minions hilarious?";
        contentArray[99] = "Who is most likely to get a tattoo in Vegas?";
    }

    public void refreshText(View view)
    {
        String newText = contentArray[ (int) (Math.random() * contentArray.length) ];

        if (completed.size() == contentArray.length)
        {
            displayText.setText(R.string.game_over);
            countdown.setVisibility(View.INVISIBLE);
            activate.setVisibility(View.INVISIBLE);
        }

        else if (completed.contains(newText))
            refreshText(view);

        else
            {
            displayText.setText(contentArray[(int) (Math.random() * contentArray.length)]);
            completed.add(newText);
            countdown.setVisibility(View.INVISIBLE);
            activate.setVisibility(View.VISIBLE);
        }
    }


    //runs when the "Ready?" button is pressed
    public void startTimer(View view)
    {

        if (displayText.getText().toString().contains("Rules:"))
        {
            refreshText(view);
        }

        else {
            countdown.setText("");
            countdown.setVisibility(View.VISIBLE);
            activate.setVisibility(View.INVISIBLE);


            final int sec = 6000;
            CountDownTimer countDownTimer = new CountDownTimer(sec, 1000) {

                @Override
                public void onTick(long millisUntilFinished) {
                    int second = (int) ((millisUntilFinished / 1000) % 60);

                    if (second > 2) {
                        countdown.setText(String.format("%2d", second - 2));
                        mediaPlayer1.start();

                    } else if (second == 2) {
                        countdown.setText(R.string.stringPoint);
                        mediaPlayer2.start();
                    }
                }

                @Override
                public void onFinish() { refreshText(countdown); }

            };

            countDownTimer.start();
        }
    }
}
