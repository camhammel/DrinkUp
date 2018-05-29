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

        Toast.makeText(getApplicationContext(), MainActivity.players[0], Toast.LENGTH_LONG).show();

        Button eight = findViewById(R.id.button1);
        Button mostlikely = findViewById(R.id.button2);
        Button vocal = findViewById(R.id.button3);
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
    }
}
