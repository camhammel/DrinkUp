package com.cameronhammel.cam.drinkup;

import android.annotation.SuppressLint;
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
    TextView tv;
    ConstraintLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);

        texts = new String[10];
        texts[0] = "@, list 8 Disney characters or take 3 sips!";
        texts[1] = "@, take 2 sips!";
        texts[2] = "@, take a sip each time you're caught swearing in the next 8 turns!";
        texts[3] = "@, take 3 sips!";
        texts[4] = "example";
        texts[5] = "example";
        texts[6] = "example";
        texts[7] = "@, example";
        texts[8] = "@, example";
        texts[9] = "@, example";


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
        cl.setBackgroundColor(R.color.colorPrimary);
        tv.setText(generateText());
    }

    private String generateText()
    {
        String n = texts[(int) (Math.random() * texts.length)];
        int z = (int) (Math.random() * MainActivity.finalplayers.size());
        n = n.replaceAll("@", MainActivity.finalplayers.get(z) + "");
        return n;
    }
}

