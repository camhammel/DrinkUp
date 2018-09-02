package com.cameronhammel.cam.drinkup;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.cameronhammel.cam.drinkup.MainActivity.finalplayers;

public class GameSelect extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_select);

        Button down = findViewById(R.id.button1);
        Button trivia = findViewById(R.id.button2);
        Button mostlikely = findViewById(R.id.button3);
        Button hollywood = findViewById(R.id.button4);

        down.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (finalplayers.size() < 3)
                {
                    //Toast.makeText(getApplicationContext(),"Crazy Eights requires at least three players to play. Please add more players in the previous screen.", Toast.LENGTH_LONG).show();
                    Snackbar snackbar = Snackbar.make(view, "Down requires at least three players to play. Please add more players.", Snackbar.LENGTH_INDEFINITE)
                            .setAction("RETURN", new View.OnClickListener()
                            {
                                @Override
                                public void onClick(View v) { finish(); }
                            });
                    snackbar.setActionTextColor(getResources().getColor(R.color.colorPrimary));
                    snackbar.show();
                }
                else
                    {
                        Intent i = new Intent(getApplicationContext(), Down.class);
                        startActivity(i);
                    }
            }
        });

        trivia.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(getApplicationContext(), Trivia.class);
                startActivity(i);
            }
        });

        mostlikely.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(getApplicationContext(), MostLikely.class);
                startActivity(i);
            }
        });

    }
}
