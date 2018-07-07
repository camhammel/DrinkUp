package com.cameronhammel.cam.drinkup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GameSelect extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_select);

        Button eight = findViewById(R.id.button1);
        Button trivia = findViewById(R.id.button2);
        Button mostlikely = findViewById(R.id.button3);
        Button drinkif = findViewById(R.id.button4);

        eight.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(getApplicationContext(), Eight.class);
                startActivity(i);
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
