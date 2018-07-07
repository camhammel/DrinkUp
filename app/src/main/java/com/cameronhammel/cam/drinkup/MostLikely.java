package com.cameronhammel.cam.drinkup;

import android.os.CountDownTimer;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MostLikely extends AppCompatActivity
{

    ConstraintLayout bg;
    TextView displayText;
    TextView countdown;
    Button activate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_most_likely);

        bg = findViewById(R.id.mostConstraintLayout);
        displayText = findViewById(R.id.mostMainTextView);
        countdown = findViewById(R.id.mostCountdownText);
        activate = findViewById(R.id.startTimer);
    }

    public void refreshText(View view)
    {

    }

    public void startTimer(View view) {
        countdown.setVisibility(View.VISIBLE);
        activate.setVisibility(View.INVISIBLE);

        final int sec = 5000;
        CountDownTimer countDownTimer = new CountDownTimer(sec, 1000)
        {

            @Override
            public void onTick(long millisUntilFinished) {
                int second = (int) ((millisUntilFinished / 1000) % 60) + 1;
                countdown.setText(String.format("%2d", second));
            }

            @Override
            public void onFinish()
            {
                countdown.setText("Point!");
            }

        };

        countDownTimer.start();
    }
}
