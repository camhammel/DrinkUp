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
        contentArray = new String[25];
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
